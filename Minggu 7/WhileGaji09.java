package minggu6.minggu7;
import java.util.Scanner;
public class WhileGaji09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double totalGajiLembur=0;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan: ");
        jumlahKaryawan = sc.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = sc.next();

            if (!(jabatan.equalsIgnoreCase("direktur") || jabatan.equalsIgnoreCase("manajer") || jabatan.equalsIgnoreCase("karyawan"))) {
                System.out.println("Jabatan tidak valid. Pilih dari opsi yang tersedia.");
                continue;

            }
            System.out.println("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = sc.nextInt();

            double gajiLembur = 0;

            if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur = 100000;

            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
            i++;

        }   
        System.out.println("Total gaji lembur: " + totalGajiLembur);
        


    }
    
}
