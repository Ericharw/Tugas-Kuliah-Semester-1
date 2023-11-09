
import java.util.Scanner;
public class latihan109 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner (System.in);
        int bil1, bil2, bil3, nilaiMaks;
        System.out.println("Masukkan bilangan 1 : ");
        bil1 = input09.nextInt();
        System.out.println("Masukkan bilangan 2 : ");
        bil2 = input09.nextInt();
        System.out.println("Masukkan bilangan 3 : ");
        bil3 = input09.nextInt();

        if (bil1>bil2) {
            nilaiMaks = bil1;
        }else {
            nilaiMaks = bil2;
        }
        if (bil3>nilaiMaks) {
            nilaiMaks = bil3;
        }
        System.out.println("Bilangan terbesar : " + nilaiMaks);
    }
    
}
