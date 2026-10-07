import java.util.Scanner;
public class TugasParkirRama {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Parkir Roda Dua --");
        System.out.println("Masukkan Lama Parkir (jam) :" );
        int lamaParkir = sc.nextInt();
        int tarif = 2000;

        if (lamaParkir < 2 ){
            tarif = 2000;
        } else if (lamaParkir > 2 ){
            tarif = 2000 + (lamaParkir-2) * 1000;
        }
        System.out.println("Total Tarif Parkir : Rp." + tarif);
    }
}