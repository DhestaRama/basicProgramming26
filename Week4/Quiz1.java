package Week4; 

import java.util.Scanner;
public class Quiz1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int handphone, kabel, earphone;
        int harBel, biPengemas, biKirim;
        int harJual, resKer, jumlPnjualan;
        double diskon=0.06;
        long KeutProdukHp;
        double KeutPerItemHp, jmlItemPehitHp;
        long KeutProdukKabel;
        double KeutPerItemKabel, jmlItemPehitKabel;
        long  KeutProdukEar;
        double KeutPerItemEar, jmlItemPehitEar;
        double tarKeuntungan, totJumlah;
        double ratratKeut, persKeut; 
        long totKeuntungan;



        System.out.println("Produk Handphone, Masukkan =  ");
        System.out.println("Harga Jual : Rp.");
        harJual = sc.nextInt();
        System.out.println("Harga Beli : Rp.");
        harBel = sc.nextInt();
        System.out.println("Biaya Pengemasan : Rp.");
        biPengemas = sc.nextInt();
        System.out.println("Biaya Kirim : Rp.");
        biKirim = sc.nextInt();
        System.out.println("Faktor Resiko Kerusakan : (%) ");
        resKer = sc.nextInt();
        System.out.println("Jumlah Penjualan : ");
        jumlPnjualan = sc.nextInt();

        KeutPerItemHp = harJual-harBel-biKirim-biPengemas-diskon;
        System.out.println("Keuntungan Per Item : Rp." + KeutPerItemHp);
        jmlItemPehitHp = jumlPnjualan-(resKer/100*jumlPnjualan);
        System.out.println("Jumlah Item Penghitung Keuntungan : " + jmlItemPehitHp);
        KeutProdukHp =(long) (KeutPerItemHp*jmlItemPehitHp);
        System.out.println("Keuntungan Produk Handphone Adalah Rp." + KeutProdukHp);



        System.out.println("Produk Kabel, Masukkan =  ");
        System.out.println("Harga Jual : Rp.");
        harJual = sc.nextInt();
        System.out.println("Harga Beli : Rp.");
        harBel = sc.nextInt();
        System.out.println("Biaya Pengemasan : Rp.");
        biPengemas = sc.nextInt();
        System.out.println("Biaya Kirim : Rp.");
        biKirim = sc.nextInt();
        System.out.println("Faktor Resiko Kerusakan : (%) ");
        resKer = sc.nextInt();
        System.out.println("Jumlah Penjualan : ");
        jumlPnjualan = sc.nextInt();

        KeutPerItemKabel = harJual-harBel-biKirim-biPengemas-diskon;
        System.out.println("Keuntungan Per Item : Rp." + KeutPerItemKabel);
        jmlItemPehitKabel = jumlPnjualan-(resKer/100*jumlPnjualan);
        System.out.println("Jumlah Item Penghitung Keuntungan : " + jmlItemPehitKabel);
        KeutProdukKabel =(long) (KeutPerItemKabel*jmlItemPehitKabel);
        System.out.println("Keuntungan Produk Kabel Adalah Rp." + KeutProdukKabel);


        // EarPhone // 
        System.out.println("Produk Erphone, Masukkan =  ");
        System.out.println("Harga Jual : Rp.");
        harJual = sc.nextInt();
        System.out.println("Harga Beli : Rp.");
        harBel = sc.nextInt();
        System.out.println("Biaya Pengemasan : Rp.");
        biPengemas = sc.nextInt();
        System.out.println("Biaya Kirim : Rp.");
        biKirim = sc.nextInt();
        System.out.println("Faktor Resiko Kerusakan : (%) ");
        resKer = sc.nextInt();
        System.out.println("Jumlah Penjualan : ");
        jumlPnjualan = sc.nextInt();

        KeutPerItemEar = harJual-harBel-biKirim-biPengemas-diskon;
        System.out.println("Keuntungan Per Item : Rp." + KeutPerItemEar);
        jmlItemPehitEar = jumlPnjualan-(resKer/100*jumlPnjualan);
        System.out.println("Jumlah Item Penghitung Keuntungan : " + jmlItemPehitEar);
        KeutProdukEar =(long) (KeutPerItemEar*jmlItemPehitEar);
        System.out.println("Keuntungan Produk EarPhone Adalah Rp." + KeutProdukEar);


        totKeuntungan = KeutProdukHp+KeutProdukKabel+KeutProdukEar;
        System.out.println("Total Keuntungan Dari Semua jenis Produk : Rp." + totKeuntungan);
        totJumlah = jmlItemPehitEar+jmlItemPehitHp+jmlItemPehitKabel;
        ratratKeut = (int) (totKeuntungan/totJumlah);
        System.out.println("Rata-rata keuntungan dari semua produk Rp." + ratratKeut);

        tarKeuntungan = sc.nextInt();
        System.out.println(" Target : Rp.");
        persKeut = (int) (totKeuntungan/tarKeuntungan*1); 



    }
}