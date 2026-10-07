package Week6;
import java.util.Scanner;

public class tokoBukuRama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Diskon Toko Buku ---");
        System.out.println("Masukkan Jenis Buku Yang Ingin Dibeli (Kamus/Novel/Lainnya)");
        String jenisBuku = sc.nextLine();
        System.out.println("Masukkan Jumlah Buku Yang Ingin dibeli: ");
        int jumlahBuku = sc.nextInt();

        double jmlDiskon;
        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            jmlDiskon = 10;
            if (jumlahBuku > 2) {
                jmlDiskon = jmlDiskon + 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            jmlDiskon = 7;
            if (jumlahBuku > 3) {
                jmlDiskon = jmlDiskon + 2;
            } else {
                jmlDiskon = jmlDiskon + 1;
            }
        } else {
            if (jumlahBuku > 3) {
                jmlDiskon = 5;
            } else {
                jmlDiskon = 0;
            }
        }
        System.out.println("Jumlah Diskon : " + jmlDiskon);
    }
}
