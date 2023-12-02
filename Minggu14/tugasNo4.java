import java.util.Scanner;

public class tugasNo4 {

    static int hitungPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bulan ke: ");
        int bulanKe = sc.nextInt();

        int jumlahPasanganMarmut = hitungPasanganMarmut(bulanKe);

        System.out.println("Pada bulan ke-" + bulanKe + " terdapat " + jumlahPasanganMarmut + " pasangan marmut");
    }
}
