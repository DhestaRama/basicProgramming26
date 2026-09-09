package Week3;

import java.util.Scanner;
public class GajiKaryawanRama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok;
        double bonus;
        int  totGaji;
        double tujTrans = 600000;
        double tujMkn = 400000;

        System.out.println("Masukkan Gaji Pokok: ");
        gajiPokok = sc.nextInt();
        bonus = 0.05*gajiPokok;
        totGaji =(int) (gajiPokok+tujMkn+tujTrans+bonus-(0.01*gajiPokok));

        System.out.println("Bonus Bulanan anda adalah Rp." + bonus);
        System.out.println("Gaji yang anda terima adalah Rp." + totGaji);

    }
}