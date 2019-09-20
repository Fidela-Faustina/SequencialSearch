
package sequentialsearch;
import java.util.Scanner;
public class TugasPrak4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String found;
        System.out.println("Masukkan sebuah kata: ");
        found = input.nextLine();
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        for (int i = 0; i < found.length(); i++) {
            if (found.charAt(i)== 'a'){
            a++;
            }
            if (found.charAt(i)== 'i'){
            b++;
            }
            if (found.charAt(i)== 'u'){
            c++;
            }
            if (found.charAt(i)== 'e'){
            d++;
            }
            if (found.charAt(i)== 'o'){
            e++;
            }
        }
        System.out.println("Jumlah huruf a: " + a);
        System.out.println("Jumlah huruf i: " + b);
        System.out.println("Jumlah huruf u: " + c);
        System.out.println("Jumlah huruf e: " + d);
        System.out.println("Jumlah huruf o: " + e);
    }
}
