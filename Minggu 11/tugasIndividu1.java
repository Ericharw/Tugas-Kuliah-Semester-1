import java.util.Scanner;
public class tugasIndividu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3) : ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai N harus minimal 3");
        } else {
            for (int i=1; i<=n; i++) {
                for (int j=n; j>i; j--) {
                    System.out.print(" ");
                }
                for (int k=1; k<=i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
}
