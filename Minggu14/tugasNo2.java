import java.util.Scanner;
public class tugasNo2 {
    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            System.out.print(n + "+");
            return 1;
        } else {
            int hasilPenjumlahan = n + penjumlahanRekursif(n-1);
            System.out.print(n + "+");
            return hasilPenjumlahan;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan nilai n : ");
        n = sc.nextInt();
        
        int hasilPenjumlahan = penjumlahanRekursif(n);
        System.out.println("=" + hasilPenjumlahan);
    }
}
