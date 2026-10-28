package Week9;
import java.util.Scanner;

public class SiakadForRama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
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
            } else {
                System.out.println("Tidak Lulus");
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        sc.close();
    }
}