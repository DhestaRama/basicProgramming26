public class StudiKasus2Rama {

    public static void main(String[] args) {
        float lebar = 30;
        float panjang = 100;
        float diameter = 5;
        float sisi = 2;

        float luasTanah =  lebar * panjang;
        float luasKolam = 3.14f * (diameter / 2) * (diameter / 2);
        float luasTaman = sisi* sisi;
        float luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah = " + luasTanah + " m2");
        System.out.println("Luas Kolam = " + luasKolam + " m2");
        System.out.println("Luas taman = " + luasTaman + " m2");
        System.out.println("Luas tanah yang tidak digunakan = " + luasTidakDigunakan + " m2");



    }
}