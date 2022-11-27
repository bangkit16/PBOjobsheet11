package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Keledai kld = new Keledai("Kedelai",4 , "Abu-abu", "Hehehehe");
        Gorlla grl = new Gorlla("Gulali",4 ,"Hitam Manis" , "Haaum Hauum" );
        Singa sna = new Singa("Cingacing",4 , "Coklat" , "Roaar Roaar");

        kld.displayBinatang();
        kld.displayMakan();
        kld.displayData();
        System.out.println("");
        grl.displayBinatang();
        grl.displayMakan();
        grl.displayData();
        System.out.println("");
        sna.displayBinatang();
        sna.displayMakan();
        sna.displayData();
    }
}
