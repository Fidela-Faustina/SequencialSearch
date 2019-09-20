/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;

/**
 *
 * @author USER
 */
public class TugasPrak2 {
    public static void main(String[] args) {
        int a=0;
        int nilai [] = new int [] {78,54,80,56,76,90,95,100,40};
        double ratarata=0;
        System.out.println("Nilai kelas A: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]+ "\t");
            ratarata+=nilai[i];     
        }ratarata/=nilai.length;
        for (int i = 0; i < nilai.length; i++) {
            if (ratarata<nilai[i]){
                a++;           
        }
        }
            System.out.println("\n"); 
            System.out.println("Nilai Rata-Rata : " + ratarata);
            System.out.println("Siswa yang diatas kkm sebanyak: " + a);
        }
    }

