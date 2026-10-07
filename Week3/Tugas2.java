import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlLembar;
        double biayaPenjilidan = 5000;
        double biayaPerlembar = 500;
        double totBiaya;

        System.out.println("Masukkan Jumlah Lembar :");
        jmlLembar = sc.nextInt();

        totBiaya = (jmlLembar*biayaPerlembar)+biayaPenjilidan;
        System.out.println("Jumlah Lembar :" + jmlLembar);
        System.out.println("Total biaya yang harus dibayar :Rp." + totBiaya);
        
    }
}