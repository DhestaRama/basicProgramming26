package Week3;

import java.util.Scanner;
public class MenghitungTotalBayarRama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        System.out.println("Masukkan Harga: ");
        harga = sc.nextInt();

        potongan=harga*diskon;
        jml_bayar=harga-potongan;

        System.out.println("Harga yang harus anda bayar : Rp." + jml_bayar);

    }
}