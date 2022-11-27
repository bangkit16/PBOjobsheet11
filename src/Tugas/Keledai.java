package Tugas;

public class Keledai extends Binatang implements IHerbivora {
    public String suara;
    public String warnaBulu;

    public Keledai(String nama, int jmlKaki , String warnaBulu , String suara){
        super(nama, jmlKaki);
        this.warnaBulu = warnaBulu;
        this.suara = suara;
    }
    @Override
    public void setNama(String nama) {
        super.nama = nama;
    }
    @Override
    public String getNama() {
        return super.nama;
    }
    @Override
    public void setKaki(int jmlKaki) {
        super.jmlKaki = jmlKaki;
    }
    @Override
    public int getKaki() {
        return super.jmlKaki;
    }
    @Override
    public void displayBinatang(){
        System.out.println("Jenis : Herbivora");
    }
    @Override
    public void displayMakan() {
        System.out.println("Makanan : Tumbuhan");
    }
    public void displayData(){
        System.out.println("Nama : " + super.nama);
        System.out.println("Jumlah Kaki : " + super.jmlKaki);
        System.out.println("Suara : " + suara);
        System.out.println("Warna Bulu : " + warnaBulu);
    }
}
