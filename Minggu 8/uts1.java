package minggu6.minggu7.uts;
import java.util.Scanner;
public class uts1 {
            public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

               int sudutA, sudutB, sudutC;
               System.out.print("Masukkan sudut A: ");
               sudutA = sc.nextInt();
               System.out.print("Masukkan sudut B: ");
               sudutB = sc.nextInt();
               System.out.print("Masukkan sudut C ");
               sudutC = sc.nextInt();

               if ((sudutA + sudutB + sudutC) == 180) {
                if ((sudutA + sudutB == sudutC) || (sudutB + sudutC == sudutA ) || (sudutA + sudutC == sudutB)) {
                  System.out.println("Siku-Siku");
                } else {
                     System.out.println ("Bukan siku-siku");
               
                }

               }else {
                  System.out.println("Error");
               }
            }
         }


