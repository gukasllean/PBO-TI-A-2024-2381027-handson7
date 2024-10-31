package src.abstraksi;

public class Mobil extends Kendaraan{

    public Mobil(final String warna) {
        super(warna);
    }

    @Override
    void bergerak() {
        System.out.println("Moil bergerak di jalan");
    }
}
