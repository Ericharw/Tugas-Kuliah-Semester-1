

import java.util.Scanner;

public class PemilihanPercobaan109 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input09.nextInt();

        String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + "bilangan " + jenisAngka);
        
    }
    
}
