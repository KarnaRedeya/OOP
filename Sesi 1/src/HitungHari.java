public class HitungHari{

     public static void main(String []args){
        // var
        int hari = 1000;
        int minggu = 1000/7;
        int bagiHari = 1000 % 7;
        String[] Hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        int kalkulasi = bagiHari;
        
        
        System.out.println("1000 Hari = " + minggu + " Minggu");
        System.out.println("Sisa = " + bagiHari + " Hari");
        System.out.println("Hari ini Senin Berarti 1000 selanjutnya "+ Hari[kalkulasi]);
     }
}
