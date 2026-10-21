package Week8;
import java.util.Scanner;
//Nama: Dhesta Ramadhani Pramana//
//no.Absen: 10//
//NIM:264107020215//
//kelas:TI-1D//

public class UTSPrakdasproQ6_Dhesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Judul Program//
        System.out.println("--- Koin Plants Vs Zombie ---");

        //input data//
        System.out.println("Mode level (siang/malam)");
        String mode = sc.nextLine();
        System.out.println("Masukkan Jumlah Zombie Yang Dikalahkan:");
        int jmlZombieDikalah = sc.nextInt();

        //data yang sudah tersedia//
        int koinPerZSiang = 10;
        int koinPerZMalam = 15;

        //Variabel//
        int koinDasar;
        int totKoin;
        double bonus;
        //Pemilihan 1//
        if (mode.equalsIgnoreCase("siang")) {
            //pemilihan 2//
            if (jmlZombieDikalah <= 10) {
                bonus = 0;
                koinDasar = jmlZombieDikalah * koinPerZSiang;
            } else if (jmlZombieDikalah > 10 && jmlZombieDikalah <= 25) {
                bonus = 0.1;
                koinDasar = jmlZombieDikalah * koinPerZSiang;
            } else {
                bonus = 0.25;
                koinDasar = jmlZombieDikalah * koinPerZSiang;
            }
        } else {
            //pemilihan 2//
            if (jmlZombieDikalah <= 10) {
                bonus = 0;
                koinDasar = jmlZombieDikalah*koinPerZMalam;
            } else if (jmlZombieDikalah > 10 && jmlZombieDikalah <= 25) {
                bonus = 0.15;
                koinDasar = jmlZombieDikalah*koinPerZMalam;
            } else if (jmlZombieDikalah > 25) {
                bonus = 0.3;
                koinDasar = jmlZombieDikalah*koinPerZMalam;
            } else {
                bonus = 0.4;
                koinDasar = jmlZombieDikalah*koinPerZMalam+100;  
            }
        }
        //Menghitung Koin Bonus//
        int koinBonus =(int) (koinDasar*bonus);
        //Menghitung Total Koin//
        totKoin = koinDasar+koinBonus;

        //Menampilkan Hasil Koin dasar//
        System.out.println("Koin Dasar = " + koinDasar);
        //Menampilkan Hasil Bonus //
        System.out.println("Bonus = " + bonus + "  (" +koinBonus +")"  );
        //Menampilkan Hasil Total Koin//
        System.out.println("Total Koin = " + totKoin);
    }
}
