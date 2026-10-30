import java.util.Scanner;

public class SiakadForRama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai > 60) {
                System.out.println("Lulus");
                lulus++;
            } else {
                System.out.println("Tidak Lulus");
                tidakLulus++;
            }
        }
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        sc.close();
    }
}