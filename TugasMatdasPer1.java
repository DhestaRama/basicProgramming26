import java.util.Scanner;

public class TugasMatdasPer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== PROGRAM CEK KELULUSAN MAHASISWA =====");

        System.out.print("Masukkan nilai mahasiswa (0-100) : ");
        double nilai = input.nextDouble();

        System.out.print("Masukkan kehadiran (0-100%)     : ");
        double kehadiran = input.nextDouble();

        boolean p = nilai >= 60;
        boolean q = kehadiran >= 80;

        boolean lulus = p && q;


        System.out.println();
        System.out.println("------------ H A S I L ------------");
        System.out.println("Nilai                          : " + nilai);
        System.out.println("Kehadiran                      : " + kehadiran + "%");
        System.out.println("P (nilai >= 60)                : " + p);
        System.out.println("Q (kehadiran >= 80%)            : " + q);
        System.out.println("Status                         : " + (lulus ? "LULUS" : "TIDAK LULUS"));

    }
}
