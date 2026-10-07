import java.util.Scanner;
public class Boarding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Status Boarding Penumpang ---");
        System.out.println("Masukkan Status Tiket (DIBATALKAN/AKTIF) :");
        String statusTiket = sc.nextLine();

        System.out.println("Masukkan berat bagasi (kg) :");
        double beratBag = sc.nextDouble();
        
        System.out.println("Masukkan Kelas Tiket (VIP/BISNIS/EKONOMI): ");
        String kelasTiket = sc.nextLine();

        System.out.println("Masukkan Status Member (PLATINUM/GOLD/NONE):");
        String statusMem = sc.nextLine();

        System.out.println("Apakah membawa anak dibawah umur 5 tahun? (True/False)");
        boolean anak5tahun = sc.nextBoolean();

        System.out.println("Masukkan selisih waktu ke gate (menit, boleh negatif jika telat):");
        int selisihWaktu = sc.nextInt();

        String statusBoarding;

        if (statusTiket.equals("DIBATALKAN") || beratBag > 30) {
            // Prioritas 1: tiket tidak sah atau bagasi berlebih,
            // harus ditolak duluan tidak peduli kondisi lain apapun
            statusBoarding = "DITOLAK_BOARDING";
        } else if (kelasTiket.equals("FIRST") && statusMem.equals("PLATINUM")) {
            statusBoarding = "PRIORITAS_VVIP";
        } else if (anak5tahun && !kelasTiket.equals("FIRST")) {
            // Prioritas 3: bawa anak kecil, tapi bukan kelas FIRST
            // (kelas FIRST sudah "diambil" oleh pengecekan VVIP di atas)
            statusBoarding = "PRIORITAS_KELUARGA";

        } else if (selisihWaktu >= 0) {
            // Prioritas 4: tidak masuk kategori istimewa manapun,
            // tapi masih tiba tepat waktu atau lebih awal
            statusBoarding = "BOARDING_NORMAL";

        } else {
            // Prioritas 5 (fallback): tidak memenuhi kondisi manapun di atas,
            // dan selisih waktu negatif berarti sudah telat
            statusBoarding = "TERLAMBAT";
        }

        System.out.println("Status Boarding: " + statusBoarding);
    }



    
}