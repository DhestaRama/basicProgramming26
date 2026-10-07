import java.util.Scanner;
public class NusantaraPay {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Evaluasi Transaksi Nusantara Pay ---");
       
        System.out.print("Masukkan status akun (contoh: NORMAL/BLACK-LISTED/SUSPICIOUS): ");
        String statusAkun = sc.nextLine();

        System.out.print("Masukkan saldo saat ini: ");
        double saldo = sc.nextDouble();

        System.out.print("Masukkan nominal transaksi: ");
        double nominal = sc.nextDouble();

        System.out.print("Apakah transaksi dari luar negeri (true/false): ");
        boolean isBedaNegara = sc.nextBoolean();

        System.out.print("Masukkan jam transaksi (0-23): ");
        int jam = sc.nextInt();
        String status;

        if (statusAkun.equals("BLACK-LISTED")) {
            status = "REJECTED_BLACKLIST";
        } else if (nominal > saldo) {
            status = "REJECTED_SALDO";
        } else if (nominal > 10000) {
            status = "REJECTED_LIMIT";
        } else if (isBedaNegara && nominal > 2000) {
            status = "FLAGGED_FRAUD";
        } else if (jam >= 0 && jam < 4 && nominal > 1000) {
            status = "REQUIRE_OTP_NIGHT";
        } else if (statusAkun.equals("SUSPICIOUS") && nominal > 500) {
            status = "REQUIRE_OTP_SUSPICIOUS";
        } else {
            status = "APPROVED";
        }

        System.out.println("Status Transaksi: " + status);
    }
}