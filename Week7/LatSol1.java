import java.util.Scanner;

public class LatSol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- System Kelayakan Kredit Motor ---");
        System.out.println("Masukkan Usia Anda :");
        int usia = sc.nextInt();

        String status;
        if (usia < 21 || usia > 60) {
            status = "Ditolak: usia di luar ketentuan";
        } else {
            System.out.println("Status Pekerjaan: (TETAP/KONTRAK)");
            String statusPekerjaan = sc.next();
            if (statusPekerjaan.equalsIgnoreCase("TETAP")) {
                System.out.println("masukkan Gaji Bulanan : Rp.");
                double gaji = sc.nextDouble();
                System.out.println("Cicilan Perbulan : Rp.");
                double cicilan = sc.nextDouble();
                if (cicilan <= (0.35*gaji)) {
                    status = "Disetujui";
                } else {
                    status = "Ditolak: cicilan terlalu besar";
                }
            } else if (statusPekerjaan.equalsIgnoreCase("KONTRAK")) {
                System.out.println("Berapa sisa kontrak kerja (bulan): ");
                int kontrak = sc.nextInt();
                if (kontrak >= 12) {
                    System.out.println("masukkan Gaji Bulanan : Rp.");
                    double gaji = sc.nextDouble();
                    System.out.println("Cicilan Perbulan : Rp.");
                    double cicilan = sc.nextDouble();
                    if (cicilan <= (0.35*gaji)) {
                        status = "Disetujui";
                    } else {
                        status = "Ditolak: cicilan terlalu besar";
                    } 
                } else {
                    status = "Ditolak: sisa kontrak kurang dari 12 bulan";
                }
            } else {
                status = ("Ditolak: status pekerjaan tidak memenuhi syarat");
            }
        }
        System.out.println("Status " + status);
    }
}