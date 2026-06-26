package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanFile3 {

    public static void main(String[] args) {

        File berkas = new File("sementara.txt");

        try {
            berkas.createNewFile();
            System.out.println("Sebelum dihapus, ada? " + berkas.exists());

            boolean hasil = berkas.delete();
            System.out.println("File berhasil dihapus? " + hasil);

            System.out.println("Sesudah dihapus, ada? " + berkas.exists());

        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}