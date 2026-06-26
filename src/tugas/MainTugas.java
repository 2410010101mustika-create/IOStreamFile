/*
Nama : Mustika Rahmelia
NPM  : 2410010101
*/

package tugas;

public class MainTugas {

    public static void main(String[] args) {
        
        System.out.println("==================================");
        System.out.println("Nama : Mustika Rahmelia");
        System.out.println("NPM  : 2410010101");
        System.out.println("==================================");
        System.out.println();

        String[] kategori = {
            "Makanan",
            "Minuman",
            "Alat Tulis"
        };

        System.out.println("=== DAFTAR KATEGORI ===");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(new Barang("Beras", 70000, 10));
        gudang.tambahBarang(new Barang("Gula", 18000, 15));
        gudang.tambahBarang(new Barang("Teh", 12000, 20));
        gudang.tambahBarang(new Barang("Pensil", 3000, 40));
        gudang.tambahBarang(new Barang("Buku", 15000, 25));

        gudang.tampilkanSemua();

        gudang.simpanKeBerkas();

        System.out.println();

        Gudang gudangBaru = new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        gudangBaru.tampilkanSemua();

        System.out.println();

        System.out.println("Total Nilai Persediaan : Rp" +
                gudangBaru.totalNilai());
    }
}