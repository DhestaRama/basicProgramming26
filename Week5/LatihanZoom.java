public class LatihanZoom {
    public static void main(String[] args){
        double bb = 5.5;
        //variabel utk aktivitas lari
        double kaloriL, koefL=0.05;
        int durasiL, kecpL, ketinggianL;
        //variabel utk aktivitas renang
        double kaloriR, koefR=0.04;
        int durasiR, kecpR, ketinggianR;
        //variabel utk aktivitas sepeda
        double kaloriS, koefS=0.03;
        int durasiS, kecpS, ketinggianS;

        //hitung kalori
        kaloriL = (durasiL * koefL * bb) +
                  (kecpL * 0.5) +
                  (ketinggianL * 0.01);
        kaloriR = (durasiR * koefR * bb) +
                  (kecpR * 0.5) +
                  (ketinggianR * 0.01);
        kaloriS = (durasiS * koefS * bb) +
                  (kecpS * 0.5) +
                  (ketinggianS * 0.01);

        System.out.println ("Kalori Lari" + kaloriL + "Kalori Renang " + kaloriR);

        double totalKalori = kaloriL+kaloriR+kaloriS;
        double kaloriPermenit = totalKalori / (durasiL+durasiR+durasiS);
        double targetHarian = 850;
        double persenCapaian = totalKalori/targetHarian*100;
    
    }
}