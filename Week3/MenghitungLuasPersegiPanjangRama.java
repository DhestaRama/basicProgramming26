package Week3;

import java.util.Scanner;
public class MenghitungLuasPersegiPanjangRama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang;
        int lebar;
        int Luas;

        System.out.println("Masukkan Panjang: ");
        panjang = sc.nextInt();
        System.out.println("Masukkan Lebar: ");
        lebar = sc.nextInt();

        Luas = panjang * lebar;
        System.out.println("Luas Persegi adalah " + Luas);  
    }
}