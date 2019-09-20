/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;
public class Latihan3 {
    public static void main(String[] args) {
       int max = 85;
       int [] data = new int [] {45, 50, 60, 85, 40, 80};
        System.out.println("Data ada pada array");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + "\t");
            if (data[i] > max) {
                max = data [i];
            }
        }
        System.out.println("\nBerat badan siswa paling berat adalah " + max);
    }
    
}
