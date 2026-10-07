import java.util.Scanner;

public class Tugas1PemilihanRama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas 
            ? "Pembayaran UKT terverifikasi\nsilahkan cetak KRS dan minta tanda tangan DPA" 
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
    }
}