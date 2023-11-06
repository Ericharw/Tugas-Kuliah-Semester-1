package minggu6;
import java.util.Scanner;
public class latihan209 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner (System.in);
        String jenisBuku;
        int jmlBuku, diskon;

        System.out.print("Masukkan jenis buku  : ");
        jenisBuku = input09.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jmlBuku = input09.nextInt();

         if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jmlBuku > 2) {
                diskon = 12;
            } else {
                diskon = 10;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jmlBuku > 3) {
                diskon = 9;
            } else {
                diskon = 8;
            }
        } else if (jmlBuku > 3) {
            diskon = 5;
        } else {
            diskon = 0;
        } 
        
        System.out.println("Anda mendapatkan diskon "+diskon+"%");
        
    }
}