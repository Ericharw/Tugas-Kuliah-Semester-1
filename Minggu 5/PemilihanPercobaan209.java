package Minggu3.minggu4.minggu5;

import java.util.Scanner;

public class PemilihanPercobaan209 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Nilai uas : ");
        float uas = input09.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input09.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input09.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input09.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.3F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);
        if( total > 80 && total <= 100) {
            System.out.println("Mendapatkan nilai A dengan kualifikasi Sangat Baik");
        } else if (total > 73 && total <= 80) {
            System.out.println("Mendapatkan nilai B+ dengan kualifikasi Lebih dari Baik");
        } else if (total > 65 && total <= 73) {
            System.out.println("Mendapatkan nilai B dengan kualifikasi Baik");
        }else if (total > 60 && total <= 65) {
            System.out.println("Mendapatkan nilai C+ dengan kualifikasi Lebih dari Cukup");
        }else if (total > 50 && total <= 60) {
            System.out.println("Mendapatkan nilai C dengan kualifikasi Cukup");
        }else if (total > 39 && total <= 50) {
            System.out.println("Mendapatkan nilai D dengan kualifikasi kurang");
        }else {
            
        }

    }   
}
