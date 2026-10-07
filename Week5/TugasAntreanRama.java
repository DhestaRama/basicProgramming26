import java.util.Scanner;
public class TugasAntreanRama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Mesin Antrean Digital ---");
        System.out.println("Masukkan Kode layanan : ");
        int kode = sc.nextInt();
         
        switch (kode) {
            case 1  :
                System.out.println("Loket : A");
                System.out.println("Layanan : Legalisir Ijazah");
                break;
            case 2:
                System.out.println("Loket : B ");
                System.out.println("Layanan : Surat Keterangan Aktif Kuliah");
                break;
            case 3:
                System.out.println("Loket : C ");
                System.out.println("Layanan : Pembayaran UKT ");
                break;
            case 4:
                System.out.println("Loket : D ");
                System.out.println("Layanan : Pengajuan Cuti Akademik ");
                break;        
            default:
                System.out.println("Kode Tidak Valid");
                break;
        }
    }
}
