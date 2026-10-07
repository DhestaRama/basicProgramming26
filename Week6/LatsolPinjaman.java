import java.util.Scanner;

public class LatsolPinjaman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Pinjaman Bank ---");
        System.out.println("Masukkan Penghasilan Bulanan: Rp.");
        double phasilBul = sc.nextDouble();
         
        String sistem;
        if (phasilBul > 4000000) {
            System.out.println("Memiliki Riwayat Kredit Macet?(TRUE/FALSE)");
            boolean macet = sc.nextBoolean();
            if (macet) {
                System.out.println("apakah kredit macet itu sudah lunas? (TRUE/FALSE)");
                boolean macetLunas = sc.nextBoolean();
                if (macetLunas) {
                    System.out.println("Cicilan Perbulan: Rp.");
                    double cicilan = sc.nextDouble();
                    double rasio = cicilan/phasilBul;
                    if (rasio<=0.3) {
                        sistem = "Disetujui";
                    }else {
                        sistem = "Ditolak: rasio cicilan terlalu tinggi";
                    }
                }else{
                    sistem = "Ditolak: masih memiliki tunggakan kredit macet";
                }
            } else {
                System.out.println("Cicilan Perbulan: Rp.");
                double cicilan = sc.nextDouble();
                double rasio = cicilan/phasilBul;
                if (rasio<=0.3) {
                    sistem = "Disetujui";
                }else {
                    sistem = "Ditolak: rasio cicilan terlalu tinggi";
                }
            }
        } else {
            sistem = "Ditolak: penghasilan tidak memenuhi syarat minimum";
        }
        System.out.println("Hasil " + sistem);
    }
}