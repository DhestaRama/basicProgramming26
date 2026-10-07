import java.util.Scanner;
public class  PemilihanIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Buku Yang Sedang Dipinjam :");
        int jmlBuku = sc.nextInt();

        if (jmlBuku <= 3)
        {
            System.out.println("Pinjaman Berhasil");
        }
        else 
        {
            System.out.println("Batas Peminjaman tercapai!");
        }

    }
}