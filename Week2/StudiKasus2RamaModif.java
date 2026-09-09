import java.util.Scanner;
public class StudiKasus2RamaModif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan lebar tanah (m): ");
        float lebar = sc.nextFloat();

        System.out.print("Masukkan panjang tanah (m): ");
        float panjang = sc.nextFloat();

        System.out.print("Masukkan diameter kolam (m): ");
        float diameter = sc.nextFloat();

        System.out.print("Masukkan sisi taman (m): ");
        float sisi = sc.nextFloat();

        float luasTanah = lebar * panjang;
        float luasKolam = 3.14f * (diameter / 2) * (diameter / 2);
        float luasTaman = sisi * sisi;
        float luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah = " + luasTanah + " m2");
        System.out.println("Luas kolam = " + luasKolam + " m2");
        System.out.println("Luas taman = " + luasTaman + " m2");
        System.out.println("Luas tanah yang tidak digunakan = "
                + luasTidakDigunakan + " m2");

    }
}