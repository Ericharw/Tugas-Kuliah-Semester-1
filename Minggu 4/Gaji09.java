
import java.util.Scanner;
public class Gaji09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;

       
        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();
        System.out.print("Masukkna Gaji per hari Anda: ");
        gaji=input.nextInt();
        System.out.print("Masukkan Potongan Gaji Anda: ");
        potGaji=input.nextInt();
        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang Anda Terima: " +TotGaji);
    }
}
