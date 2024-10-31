package pewarisan;

public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;

    public Mobil(final String merek, final String model, final int tahunProduksi) {
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu
    }

    public void infoMobil() {
        super.infoKendaraan();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Jenis Bahan Bakar: " + jenisBahanBakar);
    }
}
