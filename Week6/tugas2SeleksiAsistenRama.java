package Week6;
import java.util.Scanner;
public class tugas2SeleksiAsistenRama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Seleksi Asiste Praktikum ---");
        System.out.println("Apakah Mahasiswa Aktif? (TRUE/FALSE)");
        boolean isAktif = sc.nextBoolean();
        System.out.println("Apakah Mahasiswa Sedang Mendapatkan Sanksi Akademik? (TRUE/FALSE)");
        boolean hasSanksi = sc.nextBoolean();

        System.out.println("Masukkan nilai daspro:");
        double nilaiDaspro = sc.nextDouble();
        System.out.println("Apakah Mempunyai Sertfikat Pemrograman? (TRUE/FALSE)");
        boolean hasSertifikat = sc.nextBoolean();
        double nilaiWncra;
        


        String status;
        if (isAktif && !hasSanksi) {
            if (nilaiDaspro >= 80 || hasSertifikat) {
                System.out.println("Masukkan Nilai Wawancara:");
                nilaiWncra = sc.nextDouble();
                if (nilaiWncra >= 75) {
                    status = "Diterima Sebagai Asisten Praktikum";
                } else {
                    status = "Gagal: Tidak Diterima";
                }
            } else {
                status = "Gagal: Nilai daspro atau sertifikat belum memenuhi syarat";
            }
        }else{
            status = "Gagal: Status tidak aktif atau sedang ada sanksi";
        }
        System.out.println(status);
    }
}
