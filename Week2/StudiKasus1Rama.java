import java.util.Scanner;
public class StudiKasus1Rama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gaji_pokok, jumlah_anak, tunjangan_anak;
        double potongan;

        System.out.println("Masukkan Gaji Pokok: ");
        gaji_pokok = sc.nextInt();
        System.out.println("Masukkan Jumlah Anak: ");
        jumlah_anak = sc.nextInt();
        System.out.println("Masukkan Tunjangan anak: ");
        tunjangan_anak = sc.nextInt();

        potongan = gaji_pokok * 10 / 100;
        double gaji_bersih = gaji_pokok + (tunjangan_anak * jumlah_anak) - potongan;

        System.out.println("Gaji Bersih: " + gaji_bersih);
    }
}   