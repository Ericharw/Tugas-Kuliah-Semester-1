
import java.util.Scanner;
public class uts2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan bulat N (N > 0): ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("N harus lebih besar dari 0.");
        } else {
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += i * i;
            }
            System.out.println("Penjumlahan N bilangan kuadrat pertama adalah: " + sum);
        }
    }
}


