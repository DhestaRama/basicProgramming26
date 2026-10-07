import java.util.Scanner;
public class Spbu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- System SPBU ---");
        System.out.println("Masukkan Kode BBM");
        int kodeBBM = sc.nextInt();

        String BBM;
        if (kodeBBM == 1) {
            BBM = "Pertalite";
        } else if (kodeBBM == 2) {
            BBM = "Pertamax";
        } else if (kodeBBM == 3) {
            BBM = "Pertamax Turbo";
        } else if (kodeBBM == 4) {
            BBM = "Solar";
        } else {
            BBM = "Kode Tidak Dikenali";
        }

        System.out.println("Jenis BBM : " + BBM);
    }
}