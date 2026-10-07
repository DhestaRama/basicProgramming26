import java.util.Scanner;

public class LatSolBeasiswa {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("--- Sistem Persetujuan Beasiswa Kampus ---");
        System.out.println("Masukkan IPK:");
        double ipk = sc.nextDouble();
        String hasil;

        if (ipk >= 3.00) {
            System.out.println("memiliki tunggakan pembayaran kampus (true/false)");
            boolean tunggakan = sc.nextBoolean();
            if (tunggakan) {
                System.out.println("apakah tunggakan itu sedang dalam proses cicilan yang disetujui kampus (true/false)?");
                boolean cicResmi = sc.nextBoolean();
                if (cicResmi) {
                    System.out.println("Masukkan Penghasilan orang tua: Rp.");
                    double pHasilOrtu = sc.nextDouble();
                    System.out.println("Masukkan Jumlah Tanggungan keluarga:");
                    int agtKeluarga = sc.nextInt();
                    double rasio = pHasilOrtu/agtKeluarga;
                    if (rasio < 1500000) {
                        hasil="Disetujui";
                    }else{
                        hasil="Ditolak: kondisi ekonomi keluarga belum memenuhi kriteria prioritas";
                    }
                }else{
                    hasil="Ditolak: terdapat tunggakan pembayaran yang belum diselesaikan";
                }
            }else{
                System.out.println("Masukkan Penghasilan orang tua: Rp.");
                    double pHasilOrtu = sc.nextDouble();
                    System.out.println("Masukkan Jumlah Tanggungan keluarga:");
                    int agtKeluarga = sc.nextInt();
                    double rasio = pHasilOrtu/agtKeluarga;
                    if (rasio < 1500000) {
                        hasil="Disetujui";
                    }else{
                        hasil="Ditolak: kondisi ekonomi keluarga belum memenuhi kriteria prioritas";
                    }
            }
        } else {
            hasil = "Ditolak: IPK tidak memenuhi syarat minimum";
        }
        System.out.println("Hasil "+hasil);
    }
}
