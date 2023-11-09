
import java.util.Scanner;
public class DoWhileCuti09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println("Jatah cuti: ");
        jatahCuti = sc.nextInt();
        sc.nextLine();

        do {
            System.out.println("Apakah Anda ingin mengambil cuti (y/t)?");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("JumlahHari: ");
                jumlahHari = sc.nextInt();
                sc.nextLine();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi. Anda memiliki " + jatahCuti + "hari cuti");
            
                }
            }
        } while (true);
    } 
}
