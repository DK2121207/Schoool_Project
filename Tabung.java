public class Tabung extends BangunRuang {
    double r, t;

    @Override
    double volume() {
        System.out.println("Menghitung volume bangun ruang: " + pi*r*r*t);
        return 0;
    }
    @Override
    double luas_Permukaan() {
        System.out.println("Menghitung luas permukaan bangun ruang: " + 2*pi*r*r+2*pi*r*r);
        return 0;
    }
}