public class Handphone extends Perangkat{
     //attribute
     protected boolean fingerprint;

    //constructor
    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
     }

    @Override
    public void informasi(){
        String choice = (fingerprint) ? "MEMILIKI" : "TIDAK MEMILIKI";
        System.out.println("Handphone ini memiliki driver tipe "+drive+" ram sebesar "+ram+"GB dan processor secepat "+processor+" Ghz.Selain itu handphone ini "+choice+" fingerprint");
    }

    public void telfon(int no_hp){
        System.out.println("handphone berhasil menelfon ke "+no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("handphone berhasil kirim sms ke "+no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("handphone berhasil kirim sms ke "+no_hp1+" dan "+no_hp2);
    }
}
