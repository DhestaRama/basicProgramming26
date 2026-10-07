import java.util.Scanner;
public class KalkulatorPPh21{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Kalkulator PPh 21 ---");
        System.out.println("Masukkan Penghasilan Kena Pajak (PKP) : ");
        double pkp = sc.nextDouble();

        double pajak;

        if (pkp <= 0){
            pajak = 0;
        } else if (pkp <= 60000000){
            pajak = 0.05 * pkp;
        } else if (pkp <= 250000000){
            pajak = 3000000 + 0.15 * (pkp-60000000);
        } else if (pkp <= 500000000){
            pajak = 31500000 + 0.25 * (pkp-250000000);
        } else{
            pajak = 94000000 + 0.30 * (pkp-500000000);
        }
        System.out.println("Total PPh 21 : Rp." + pajak);
    }

}
