public class Main extends BangunRuang {
    public static void main(String[] args) {
        System.out.println("pilih bangun ruang");
        System.out.println("""
                1. Bola
                2. Tabung
                3. Limas Segitiga
                4. Balok
                """);
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                Bola bola = new Bola();
                System.out.print("Masukkan jari-jari: ");
                bola.r = input.nextDouble();
                bola.volume();
                bola.luas_Permukaan();
                break;
        
            case 2: 
                Tabung tabung = new Tabung();
                System.out.print("Masukkan tinggi: ");
                tabung.r = input.nextDouble();
                System.out.print("Masukkan jari-jari: ");
                tabung.r = input.nextDouble();
                tabung.volume();
                tabung.luas_Permukaan();
                break;

            case 3:
                Limas_Segitiga limas_Segitiga = new Limas_Segitiga();
                System.out.print("Masukkan tinggi limas: ");
                limas_Segitiga.t_Limas = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga alas: ");
                limas_Segitiga.t_Segitiga_Alas = input.nextDouble();
                System.out.print("Masukkan alas segitiga alas: ");
                limas_Segitiga.a_Segitiga_Alas = input.nextDouble();
                limas_Segitiga.volume();
                limas_Segitiga.luas_Permukaan();
                break;

            case 4:
                Balok balok = new Balok();
                System.out.print("Masukkan panjang: ");
                balok.p = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                balok.l = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                balok.t = input.nextDouble();
                balok.volume();
                balok.luas_Permukaan();
                break;
            default:
                break;
        }
    }
}
