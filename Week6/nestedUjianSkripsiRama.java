package Week6;

import java.util.Scanner;

public class nestedUjianSkripsiRama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- System Syarat Ujian Skripsi ---");
        System.out.println("Apakah Mahasiswa Bebas Kompen? (Ya/Tidak)");
        String bebasKompen = sc.nextLine().trim();
        System.out.println("Masukkan Jumlah Log Bimbingan P1:");
        int p1 = sc.nextInt();
        System.out.println("Masukkan Jumlah Log Bimbingan P2:");
        int p2 = sc.nextInt();
        String pesan;

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (p1 >= 8 && p2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (p1 < 8 && p2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (p1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
System.out.println(pesan);

    }
}
