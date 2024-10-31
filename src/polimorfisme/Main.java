package src.polimorfisme;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;

        bangunDatar = new Persegi(4);
        tampilkanPerhitungan(bangunDatar.hitungluas(), bangunDatar.hitungKeliling(), "Persegi");
        bangunDatar = new SegitigaSamaSisi(4, 5);
        tampilkanPerhitungan(bangunDatar.hitungluas(), bangunDatar.hitungKeliling(), "Segitiga Sama Sisi");
        bangunDatar = new Lingkaran(22);
        tampilkanPerhitungan(bangunDatar.hitungluas(), bangunDatar.hitungKeliling(), "Lingkaran");
    }

    public static void tampilkanPerhitungan(double luas, double keliling, String namaBangunDatar) {
        System.out.println("Luas bangun datar " + namaBangunDatar + " : " + luas);
    }
}
