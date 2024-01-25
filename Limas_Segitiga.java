public class Limas_Segitiga extends BangunRuang {
    double t_Limas, t_Segitiga_Alas, a_Segitiga_Alas;
    
    @Override
    double volume() {
        System.out.println("Menghitung volume bangun ruang: " + (luas_Alas()*t_Limas/3));
        return 0;
    }
    @Override
    double luas_Permukaan() {
        System.out.println("Menghitung luas permukaan bangun ruang: " + (luas_Alas() + (t_Segitiga_Alas*t_Limas/2) + (a_Segitiga_Alas*t_Limas/2) + (Phytagoras()*t_Limas/2)));
        return 0;
    }

    private double luas_Alas() {
        return a_Segitiga_Alas*t_Segitiga_Alas/2;
    }

    private double Phytagoras() {
        return Math.sqrt(a_Segitiga_Alas*a_Segitiga_Alas + t_Segitiga_Alas*t_Segitiga_Alas);
    }
}
