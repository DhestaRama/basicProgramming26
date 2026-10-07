import java.util.Scanner;

public class Tugas2PemilihanRama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jumlah KRS :");
        int jmlKRS = sc.nextInt();

        if (jmlKRS > 24){
            System.out.println("Melebihi Batas");
        } else {
            System.out.println("KRS valid");
        }
    }
}