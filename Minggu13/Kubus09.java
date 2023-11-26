import java.util.Scanner;
public class Kubus09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s,Lp,vol;
        System.out.print("Masukkan panjang sisi kubus :");
        s=sc.nextInt();

        Lp=hitungLp(s);
        System.out.println("Luas permukaan kubus adalah "+Lp);

        vol=hitungVolume(s);
        System.out.println("volume kubus adalah "+vol);
    }

    static int hitungLp (int s) {
        int Lp=6*s*s;
        return Lp;
    }
    static int hitungVolume (int s) {
        int vol=s*s*s;
        return vol;
    }
}

