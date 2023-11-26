import java.util.Scanner;

public class nilaiTugasMhs {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMhs = 5;
        int jmlMinggu = 7;
        double[][] nilaiTugas = new double[jmlMhs][jmlMinggu];
        String[] namaMhs = new String[jmlMhs];

        inputDataNamaMhs(sc, namaMhs);
        inputDataNilai(sc, nilaiTugas);

        tampilkanSeluruhNilai(nilaiTugas);
    }
    public static void inputDataNamaMhs(Scanner sc, String[] namaMhs) {
        for (int i = 0; i < namaMhs.length; i++) {
            System.out.print("Masukkan nama Mahasiswa " + (i+1) + ": ");
            namaMhs[i] = sc.nextLine();
        }
    }
    public static void inputDataNilai(Scanner sc, double[][] nilaiTugas) {
        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.println("Masukkan nilai tugas untuk Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiTugas[i][j] = sc.nextDouble();
            }
        }
    }
    public static void tampilkanSeluruhNilai(double[][] nilaiTugas) {
        System.out.println("\nSeluruh Nilai Mahasiswa:");
        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print("Minggu-" + (j + 1) + ": " + nilaiTugas[i][j] + "\t");
            }
            System.out.println();
        }
    }
}