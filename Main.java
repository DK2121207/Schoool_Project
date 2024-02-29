package javaapplication1;

public class Main {
    public static void main(String[] args) {
        Member member = new Member();
        Karyawan karyawan = new Karyawan();
        Barang barang = new Barang();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();

        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
        
        transaksi.prosesTransaksi(member, transaksi, barang);
        
        laporan.laporan(transaksi, barang);
        laporan.laporan(barang);
        laporan.laporan(member);
    }
}
