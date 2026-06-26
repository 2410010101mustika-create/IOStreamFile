package bagian3.kontak;

public class MainKontak {

    public static void main(String[] args) {

        // Membuat objek pengelola dan mengisinya
        BukuKontak buku = new BukuKontak("kontak.txt");

        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@gmail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@gmail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@gmail.com"));

        buku.tampilkanSemua();
        buku.simpanKeBerkas();

        System.out.println();

        // Nomor 1 - Mencari kontak
        buku.cariKontak("Budi");

        System.out.println();

        // Objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();

        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());

        System.out.println();

        // Nomor 3 - Menghapus kontak
        bukuLain.hapusKontak("Budi");

        System.out.println();

        System.out.println("Daftar kontak setelah dihapus:");
        bukuLain.tampilkanSemua();
    }
}