package src.polimorfisme;

import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;

        bangunDatar = new Persegi(4);
        tampilkanHasilPerhitungan(bangunDatar.hitungLuas(), bangunDatar.hitungKeliling(), "Persegi");

        bangunDatar = new SegitigaSamaSisi(4, 5);
        tampilkanHasilPerhitungan(bangunDatar.hitungLuas(), bangunDatar.hitungKeliling(), "Segitiga Sama Sisi");

        bangunDatar = new Lingkaran(2);
        tampilkanHasilPerhitungan(bangunDatar.hitungLuas(), bangunDatar.hitungKeliling(), "Lingkaran");

    }

    public static void tampilkanHasilPerhitungan(double luas, double keliling, String namaBangunDatar) {
        System.out.println("Luas bangun datar " + namaBangunDatar + " : " + luas);
        System.out.println("Keliling bangun datar " + namaBangunDatar + " : " + keliling);
    }
}
