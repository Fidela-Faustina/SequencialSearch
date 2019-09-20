/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;
public class TugasPrak3 {
    public static void main(String[] args) {
        int a= 0;
        int hasil = 0;
        int [] nilai = new int [] {92, 98, 76, 72, 84, 101, 39, 78};
        System.out.println("Data yang ada pada array: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i] + "\t");
        }
        System.out.println();
        System.out.println("Nilai yang merupakan kelipatan 3: ");
        for (int i = 0; i < nilai.length; i++) {
            if (hasil == nilai [i] % 3) {
                    a++;
                    System.out.println(nilai[i]);
            
        }
        }
    }
}

