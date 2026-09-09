public class ContohVariabelRama {

    public static void main(String[] args) {
        String Hobby = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umur = 20;
        double ipk = 3.24, tinggiBadan = 1.78;
        System.out.println("Hobby:" + Hobby);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umur: " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggiBadan));
    }
    
}
