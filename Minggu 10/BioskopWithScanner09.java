
import java.util.Scanner;
public class BioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int baris, kolom;
        String nama, next;
        String [][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu (1/2/3)");

            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                System.out.print("Masukkan nama : ");
                nama = sc.nextLine();

                boolean kursiTersedia = false;

                do {
                    System.out.println("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.println("Masukkan kolom (1/2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris >= 1 && baris <= 4 && (kolom == 1 || kolom == 2)) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil diinputkan ");
                            kursiTersedia = true;
                        }else {
                        System.out.println("Kursi sudah tidak tersedia. silakan pilih kursi lain ");
                        }
                    }else {
                        System.out.println("Baris atau kolom tidak valid. Silakan pilih ulang ");
                    }
                }while (!kursiTersedia);
                    break;
                case 2:
                System.out.println("Daftar penonton : ");
                for (int i = 0; i < 4; i++ ) {
                    for (int j = 0; j < 2; j++ ) {
                        if (penonton[i][j] !=null) {
                            System.out.println("Baris " + (i + 1) + ", kolom " + (j + 1) + ": " + penonton[i][j]);
                        }else {
                            System.out.println("Baris " + (i + 1) + ", kolom " + ": ***");
                        }
                    }
                }
                break;
                case 3: 
                System.out.println("Terima kasih, program akan keluar ");
                System.exit(0);
                break;

                default:
                System.out.println("Pilhan invalid, silakan pilih menu yang sesuai! ");
            }
        }
    }
    
}
