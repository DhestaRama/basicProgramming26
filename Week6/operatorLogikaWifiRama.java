package Week6;
import java.util.Scanner;

public class operatorLogikaWifiRama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- WIFI ---");
        System.out.println("Apakah Pengguna Mahasiswa? (TRUE/FALSE)");
        Boolean mhs = sc.nextBoolean();
        System.out.println("Apakah Pengguna Dosen? (TRUE/FALSE)");
        Boolean dosen = sc.nextBoolean();
        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        Boolean akunDiblokir = sc.nextBoolean(); 

        if ((mhs || dosen) && !akunDiblokir) {
             System.out.println("Akses WiFi diberikan"); 
        } else { 
            System.out.println("Akses WiFi ditolak"); 
        } 

    }
}