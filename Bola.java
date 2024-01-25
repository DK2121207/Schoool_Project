/**
 * Bola
 */
public class Bola extends BangunRuang{
    double r;
    
    @Override
    double volume() {
        System.out.println("Menghitung volume bangun ruang: " + (4*pi*r*r*r/3));
        return 0;
    }
    @Override
    double luas_Permukaan() {
        System.out.println("Menghitung luas permukaan bangun ruang: " + (4*pi*r*r));
        return 0;
    }
}