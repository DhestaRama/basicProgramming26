import java.util.Scanner;

public class BarangDatang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stok = 9;

        System.out.print("Nama barang: ");
        String nama = sc.nextLine();

        System.out.print("Jumlah barang datang: ");
        int jumlah = sc.nextInt();

        stok = stok + jumlah;

        System.out.println("Barang: " + nama);
        System.out.println("Stok sekarang: " + stok);
    }
}