package minggu6.minggu7;
import java.util.Scanner;
public class WhileKelipatan09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int kelipatan = 0, jumlah = 0, counter = 0, totalKelipatan = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        int i = 1;

        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += 1;
                counter++;
                totalKelipatan += i;
            }
            i++;
        }
        double rataRata = (double) totalKelipatan / counter;

        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }
}
