package minggu6.minggu7.uts;

import java.util.Scanner;

public class uts3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan bilangan bulat N (N > 0): ");
            int number = scanner.nextInt();
    
            int count = 0;
            while (number != 0) {
                int digit = number % 10;
                if (digit % 2 != 0) {
                    count++;
                }
                number /= 10;
            }
    
            System.out.println("Jumlah digit ganjil dalam bilangan adalah: " + count);
        
    }
   
    
    
    
    
    
    
    }
    
    

