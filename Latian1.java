package sequentialsearch;
import java.util.Scanner;

public class Latian1 {

    public static void main(String[] args) {
        String cari;
        boolean found = false;
        String[] hewan = new String[5];
        hewan [0] = "Kucing";
        hewan [1] = "Harimau";
        hewan [2] = "Kerbau";
        hewan [3] = "Buaya";
        hewan [4] = "Ular";
         
        Scanner input = new Scanner(System.in);
        System.out.println("Hewan yang anda cari: ");
        cari = input.nextLine();
        
        for (String hewan1 : hewan) {
            if (cari.equals (hewan1)){
                found = true;
            } 
        }
        if (found == true) {
            System.out.println("Yey! Hewan itu ada");
        } else {
            System.out.println("Maaf, Hewan itu tidak ada di kebun binatang ini");
        }
    }

}
