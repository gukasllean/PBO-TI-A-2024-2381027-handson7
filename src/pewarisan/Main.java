package src.pewarisan;

public class Main {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Toyota", "Avanza", 2022, 4, "Bensin");
        Motor motorku = new Motor("Honda", "CBR250RR", 2023, 250, "Mannual");

        mobilku.infoKendaraan();
        mobilku.infoMobil();

        motorku.infoKendaraan();
        motorku.infoMotor();
    }
}
