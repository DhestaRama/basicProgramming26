package Week9;
import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int HARGA_TIKET = 50000;

        int totalTiket = 0;
        long totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 = selesai): ");
            int jumlah = input.nextInt();

            // Input negatif diabaikan, minta input ulang
            if (jumlah < 0) {
                System.out.println("Input tidak valid, silakan ulangi.");
                continue;
            }

            // 0 menandakan penjualan hari ini selesai
            if (jumlah == 0) {
                break;
            }

            // Tentukan diskon (cek yang terbesar dulu)
            int diskonPersen;
            if (jumlah > 10) {
                diskonPersen = 15;
            } else if (jumlah > 4) {
                diskonPersen = 10;
            } else {
                diskonPersen = 0;
            }

            long totalBayar = (long) jumlah * HARGA_TIKET * (100 - diskonPersen) / 100;

            System.out.println("Diskon      : " + diskonPersen + "%");
            System.out.println("Total bayar : Rp " + totalBayar);
            System.out.println();

            totalTiket += jumlah;
            totalPenjualan += totalBayar;
        }

        System.out.println();
        System.out.println("===== Rekap Penjualan Hari Ini =====");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);

        input.close();
    }
}