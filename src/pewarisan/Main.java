package src.pewarisan;

public class Main {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Toyota", "Avanza", 2022, 4,"Bensin");
        Motor motorku = new Motor("Honda", CBR256RR, 2023, 258, Manual);

        mobilku.infoMobil();

        motorku.infomotor();
    }
}
