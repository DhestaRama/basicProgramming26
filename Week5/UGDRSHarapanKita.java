    import java.util.Scanner;

public class UGDRSHarapanKita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Penentu Ruang Perawatan UGD ---");
        System.out.print("Masukkan SpO2 (%): ");
        double spO2 = sc.nextDouble();

        System.out.print("Masukkan sisa bed ICU: ");
        int sisaBedICU = sc.nextInt();

        System.out.print("Masukkan tekanan darah sistolik (mmHg): ");
        double sistolik = sc.nextDouble();

        System.out.print("Apakah pasien sadar penuh (true/false): ");
        boolean sadarPenuh = sc.nextBoolean();

        System.out.print("Masukkan suhu tubuh (Celcius): ");
        double suhuTubuh = sc.nextDouble();

        System.out.print("Apakah pasien punya riwayat komorbid (true/false): ");
        boolean riwayatKomorbid = sc.nextBoolean();

        System.out.print("Masukkan usia pasien: ");
        int usia = sc.nextInt();

        System.out.print("Masukkan laju napas (x/menit): ");
        int lajuNapas = sc.nextInt();

        String lokasi;

        if (spO2 < 85 && sisaBedICU > 0) {
            lokasi = "ICU";
        } else if (spO2 < 85 && sisaBedICU == 0) {
            lokasi = "UGD_VENTILATOR_MOBIL";
        } else if ((spO2 >= 85 && spO2 <= 89) || (sistolik < 90 || sistolik > 180) || !sadarPenuh) {
            lokasi = "RESUSITASI_UGD";
        } else if ((spO2 >= 90 && spO2 <= 94 || suhuTubuh > 39) && (riwayatKomorbid && usia >= 65)) {
            lokasi = "HCU_ISOLASI";
        } else if ((spO2 >= 90 && spO2 <= 94) || lajuNapas > 24) {
            lokasi = "RAWAT_INAP_UMUM";
        } else {
            lokasi = "RAWAT_JALAN";
        }

        System.out.println("Lokasi Perawatan: " + lokasi);

    }
}