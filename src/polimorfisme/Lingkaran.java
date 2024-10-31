package src.polimorfisme;

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public lingkaran(final double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungluas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}
