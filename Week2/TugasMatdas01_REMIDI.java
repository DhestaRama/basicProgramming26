import java.util.Scanner;


public class TugasMatdas01_REMIDI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        int q;
        
        
        System.out.print("Masukkan Nilai : ");
        p = sc.nextInt();

        System.out.print("Masukkan Kehadiran : ");
        q = sc.nextInt();

        if (p >= 60) {
            if (q >= 80) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("False");
        }
    }
    
}
