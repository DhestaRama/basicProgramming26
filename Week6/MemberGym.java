package Week6;

import java.util.Scanner;

public class MemberGym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Pendaftaran Member Gym ---");
        System.out.println("Masukkan Umur:");
        int umur = sc.nextInt();
        System.out.println("Apakah Mempunyai Surat Keterangan Sehat? (TRUE/FALSE)");
        boolean Surat = sc.nextBoolean();

        String pendaftaran;
        if (umur >= 17) {
            if (Surat) {
                pendaftaran = "Pendaftaran diterima";
            } else {
                pendaftaran = "Pendaftaran ditolak: wajib lampirkan surat keterangan sehat";
            }
        } else {
            pendaftaran = "Pendaftaran ditolak: belum cukup umur";
        }
        System.out.println(pendaftaran);
    }
}
