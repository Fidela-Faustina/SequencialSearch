/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;
import java.util.Scanner;
public class TugasPrak1 {
    public static void main(String[] args) {
    int cari;
    int a=0;
    int [] data ={12,67,84,54,23,23,25,12,45};
    Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nilai yang dicari: ");
        cari = input.nextInt();
        System.out.println("Data pada array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
            if (cari == data [i]){
                a++;
            }
            System.out.println();
        }
        System.out.println("Data ada : " + a);
}
}
