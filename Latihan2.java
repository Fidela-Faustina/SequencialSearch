/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;

import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {
        int cari;
        boolean found = false;
        int[] data = new int[]{12, 34, 65, 78, 91, 23};
        Scanner input = new Scanner(System.in);
        System.out.println("Nomor bangku berapa yang ingin anda cari? ");
        cari = input.nextInt();
        for (int i = 0; i < data.length; i++) {
            if (cari == data[i]) {
                found = true;
                System.out.println("Nomor bangku ditemukan pada urutan ke-" + i);
            }
        }
        if (found != true) {
            System.out.println("Nomor tidak ada di kelas ini");
        }
    }

}
