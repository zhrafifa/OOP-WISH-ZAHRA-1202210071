import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant rumahmakan = new Restaurant();
            int orderQty, customerID;
            try {
                System.out.println("Enter Customer ID: ");
                customerID = input.nextInt();

                System.out.println("Enter how much food to make: ");
                orderQty = input.nextInt();

                Thread threadsatu= new Thread(rumahmakan);
                Waiters pelayan = new Waiters(orderQty, customerID);
                Thread threaddua = new Thread(pelayan);

                threadsatu.start();
                threaddua.start();
                threadsatu.join();
                threaddua.join();

            } catch (Exception e) {
                System.out.println("Input must be in Integer");
            }
        }
    }
}
