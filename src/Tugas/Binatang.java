package Tugas;

public abstract class Binatang {
    public String nama;
    public int jmlKaki;
    public Binatang(String nama,int jmlKaki){
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }
    public abstract void setNama(String nama);
    public abstract String getNama();
    public abstract void setKaki(int jmlKaki);
    public abstract int getKaki();
    public abstract void displayBinatang();

}
