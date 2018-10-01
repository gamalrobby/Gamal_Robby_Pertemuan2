/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program mengubah kalimat menjadi
 * huruf besar dan kecil
 */
public class PBO210117071Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        String kalimat;
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = scn.nextLine();
        System.out.println("");
        
        String str1 = kalimat.toUpperCase();
        String str2 = kalimat.toLowerCase();
        
        System.out.println("======Hasil Formatting======");
        System.out.println("Huruf Besar : "+str1);
        System.out.println("Huruf Kecil : "+str2);
    }
    
}
