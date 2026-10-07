package Week6;
import java.util.Scanner;
public class Perpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- MASUK PERPUSTAKAAN ---");
        System.out.println("Membawa KTM (true/false)");
        boolean bawaKTM = sc.nextBoolean();

        System.out.println("Registrasi Online? (true/false)");
        boolean regis = sc.nextBoolean();

        String masuk;

        if (bawaKTM || regis) {
            masuk = "Dipersilahkan Masuk";
        } else {
            masuk = "Masuk Gagal";
        }
        System.out.println(masuk);
    }
}
