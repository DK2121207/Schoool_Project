public class Balok extends BangunRuang {
    double p, l, t;
    @Override
    double volume() {
        System.out.println("Menghitung volume bangun ruang: " + (p*l*t));
        return 0;
    }
    @Override
    double luas_Permukaan() {
        System.out.println("Menghitung luas permukaan bangun ruang: " + (t*l*2 + p*l*2 + p*t*2));
        return 0;
    }
}
