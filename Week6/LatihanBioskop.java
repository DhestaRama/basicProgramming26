package Week6;

import java.util.Scanner;

public class LatihanBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Harga Tiket Bioskop ---");
        System.out.println("Masukkan Hari:");
        String hari = sc.nextLine();
        System.out.println("Masukkan Umur:");
        int umur = sc.nextInt();

        double harga;
        if (hari.equalsIgnoreCase("Minggu") || hari.equalsIgnoreCase("Sabtu")) {
            if (umur < 13) {
                harga = 35000;
            } else {
                harga = 50000;
            }
        } else {
            if (umur < 13) {
                harga = 25000;
            } else {
                harga = 25000;
            }
        }
        System.out.println("Harga Tiket: Rp." + harga);
    }
}
