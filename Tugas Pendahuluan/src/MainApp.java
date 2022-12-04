public class MainApp {
    //main class
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("SSD", 8, 2.4F);
        perangkat.informasi();
        System.out.println(" ");

        Laptop laptop = new Laptop("SSD", 8, 2.5F, true);
        laptop.informasi();
        laptop.bukaGame("Hamsterball");
        laptop.kirimEmail("zahrabutuhhealing@gmail.com");
        laptop.kirimEmail("zahralagistress@gmail.com","zahracapekngerjaintugasdantubes@gmail.com");
        System.out.println(" ");

        Handphone hp = new Handphone("SSD", 8, 2.5F, false);
        hp.informasi();
        hp.telfon(628121241);
        hp.kirimSMS(628121212);
        hp.kirimSMS(623456789, 621234562);
    }
}
