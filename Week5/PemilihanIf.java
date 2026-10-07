import java.util.Scanner;
public class PemilihanIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totBelanja;
        System.out.println("Total Belanja : Rp.");
        totBelanja = sc.nextInt(); 

        if (totBelanja >= 50000 ) {
            System.out.println("Selamat, Kamu mendapat gratis es teh 10 cup!!!");
            
        }
    }
}