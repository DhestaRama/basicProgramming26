package Week6;
import java.util.Scanner;

public class nestedAksesLabRama {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Akses Laboratorium ---");
        System.out.println("Apakah Anda Mahasiswa Aktif? (TRUE/FALSE)");
        Boolean mhsAktif = sc.nextBoolean();

        System.out.println("Apakah Anda Sedang disanksi? (TRUE/FALSE)");
        Boolean sanksi = sc.nextBoolean();

        System.out.println("Apakah Anda Punya Izin Dosen? (TRUE/FALSE)");
        Boolean punyaIzinDosen = sc.nextBoolean();

        System.out.println("Apakah Anda Punya Izin Asisten Laboratorium? (TRUE/FALSE)");
        Boolean astLab = sc.nextBoolean();

        if (mhsAktif && !sanksi) {
             if (punyaIzinDosen || astLab) { 
                System.out.println("Akses laboratorium diberikan"); 
            } else { 
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab"); 
            } 
        } else { 
        System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat"); 
        } 

    }
}
