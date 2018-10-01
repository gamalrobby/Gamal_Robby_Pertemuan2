/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program mengubah kata yang diinginkan
 * dengan inputan dari sebuah kalimat
 */
public class PBO210117071Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        String kalimat,cari,ganti;
        
        System.out.println("=====Program Mengganti Kata=====");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        kalimat = scn.nextLine();
        System.out.print("Ganti Kata : ");
        cari = scn.nextLine();
        System.out.print("Menjadi Kata : ");
        ganti = scn.nextLine();
        
        System.out.println("");
        System.out.println("===Hasil Formatting===");
        System.out.println("Kalimat Awal : "+kalimat);
        System.out.println("Kalimat Baru : "+kalimat.replace(cari, ganti));
    }
    
}
