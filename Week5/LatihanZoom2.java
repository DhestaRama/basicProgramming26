import java.util.Scanner;
public class LatihanZoom2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Menghitung Bahan Bakar Moge ---");
        //#Perkotaan#//
        System.out.println("Masukkan Kecepatan Di Perkotaan (km/jam): ");
        double kecKota = sc.nextDouble();
        System.out.println("Masukkan Durasi Perjalan Di Perkotaan (jam): ");
        double durKota = sc.nextInt();
        double kapMesin = 250, lingKota = 0.5;

        //menghitung jarak//
        double jarakKota = kecKota * durKota;
        System.out.println("Jarak Tempuh Di Perkotaan : " + jarakKota);
        //menghitung konsumsi bahan bakar//
        double konsumsiBBMKota = (jarakKota / 100 ) * kapMesin * lingKota;
        System.out.println("Konsumsi Bahan Bakar : " + konsumsiBBMKota);

        //#Jalan Tol#//
        System.out.println("Masukkan Kecepatan Di Tol (km/jam): ");
        double kecTol = sc.nextDouble();
        System.out.println("Masukkan Durasi Perjalan Di Tol (jam): ");
        double durTol = sc.nextInt();
        double lingTol = 0.3;

        //menghitung jarak//
        double jarakTol = kecTol * durTol;
        System.out.println("Jarak Tempuh Di Jalan Tol : " + jarakTol);
        //menghitung konsumsi bahan bakar//
        double konsumsiBBMTol = (jarakTol / 100 ) * kapMesin * lingTol;
        System.out.println("Konsumsi Bahan Bakar (km/l) : " + konsumsiBBMTol);

        //#Pegunungan#//
        System.out.println("Masukkan Kecepatan Di Pegunungan (km/jam): ");
        double kecGun = sc.nextDouble();
        System.out.println("Masukkan Durasi Perjalan Di Pegunungan (jam): ");
        double durGun = sc.nextInt();
        double lingGun = 0.7;

        //menghitung jarak//
        double jarakGun = kecGun * durGun;
        System.out.println("Jarak Tempuh Di Pegunungan : " + jarakGun);
        //menghitung konsumsi bahan bakar//
        double konsumsiBBMGun = (jarakGun / 100 ) * kapMesin * lingGun;
        System.out.println("Konsumsi Bahan Bakar  : " + konsumsiBBMGun);

        //Menghitung Total konsumsi bahan bakar//
        double totalKonsumsiBBM = konsumsiBBMKota + konsumsiBBMTol + konsumsiBBMGun;
        System.out.println("Total konsumsi bahan bakar :" + totalKonsumsiBBM);
        
        //Menghitung Rata-rata Konsumsi //
        double totJarak = jarakGun + jarakKota + jarakTol;
        double rataRata = totalKonsumsiBBM / totJarak;
        System.out.println("Rata-rata konsumsi bahan bakar yang dibutuhkan per km : " + rataRata);

        //menghitung presentase konsumsi bahan bakar dari target harian//
        System.out.println("Masukkan Target Harian (liter)");
        double targetHarian = sc.nextDouble();
        double persentase = (totalKonsumsiBBM / targetHarian) * 1;
        System.out.println("Persentase konsumsi bahan bakar dari target harian : " + persentase);
    }
}