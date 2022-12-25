public class Waiters implements Runnable {
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 150000;

    public Waiters(int orderQty, int customerID) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Number of Food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * foodPrice);
        System.out.println("==========================================================");
    }

    public void getFood() {
        synchronized(Restaurant.getLock()){
            System.out.println("Waiter: Food is ready to deliver");
            Restaurant tempatmakan = new Restaurant();
            tempatmakan.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }

            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the restaurant to make another food\n");
        }
    }
}
