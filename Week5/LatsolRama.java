import java.util.Scanner;
public class LatsolRama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Akses Gedung ---");
        System.out.println("Masukkan Status Kartu (NORMAL/VIP/HILANG/DICURI):");
        String statusAkun = sc.nextLine();

        System.out.println("Telat Membayar (bulan): ");
        int telBulan = sc.nextInt();

        System.out.println("Masukkan Jumlah Saldo : Rp.");
        double saldo = sc.nextDouble();

        System.out.println("Jam Masuk (0-23)");
        int jamMasuk = sc.nextInt();

        String hasilAkses;

        if (statusAkun.equals("HILANG") || statusAkun.equals("DICURI")) {
            hasilAkses = "BLOKIR";
        } else if (telBulan > 3 && !statusAkun.equals("VIP")) {
            hasilAkses = "AKSES TERBATAS";
        }else if (statusAkun.equals("VIP") && saldo > 50000) {
            // Prioritas 3: kartu VIP dengan saldo mencukupi dapat akses khusus
            hasilAkses = "AKSES VIP";

        } else if (jamMasuk >= 6 && jamMasuk <= 22) {
            // Prioritas 4: di luar kondisi khusus di atas,
            // cek apakah jam masuknya masih dalam jam operasional normal
            hasilAkses = "AKSES NORMAL";

        } else {
            // Prioritas 5 (fallback): tidak masuk kriteria manapun di atas,
            // berarti jam masuknya di luar 06.00-22.00
            hasilAkses = "AKSES DITOLAK JAM";
        }

        System.out.println("Status Akses: " + hasilAkses);
    }
}