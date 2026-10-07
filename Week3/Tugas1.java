import java.util.Scanner;
public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga;
        int bulan;
        double uangMuka;
        double sisaHarga;
        double bunga=0.02;
        int cicilan;

        System.out.println("Masukkan Harga: ");
        harga = sc.nextInt();
        System.out.println("Masukkan Uang Muka: ");
        uangMuka = sc.nextInt();

        sisaHarga = harga-uangMuka;
        System.out.println("Sisa Harga: " + sisaHarga) ;

        System.out.println("Masukkan Berapa Bulan ");
        bulan = sc.nextInt();

        cicilan = (int) (sisaHarga/bulan*bunga);
        System.out.println("Cicilan: " + cicilan);

    }
    
}
