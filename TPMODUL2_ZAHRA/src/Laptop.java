public class Laptop extends Perangkat {
    //attribute
    protected boolean webcam;

    //Constructor
    public Laptop (String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    
    @Override
    public void informasi(){
        String choice = (webcam) ? "MEMILIKI" : "TIDAK MEMILIKI";
        System.out.println("Handphone ini memiliki driver tipe "+drive+" ram sebesar "+ram+"GB dan processor secepat "+processor+" Ghz.Selain itu handphone ini "+choice+" webcam");
    }

    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game "+nama_game);
    }

    // overloading: 2 nama function sama dengan parameter berbeda
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim ke "+email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("laptop berhasil kirim email ke "+email1+" dan "+email2);
    }
}
