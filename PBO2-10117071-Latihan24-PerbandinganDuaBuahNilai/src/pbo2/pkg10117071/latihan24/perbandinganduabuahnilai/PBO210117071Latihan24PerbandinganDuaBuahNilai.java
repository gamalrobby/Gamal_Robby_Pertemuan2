/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi perbandingan dua buah nilai yang
 * menghasilkan nilai lebih besar dari ...
 */
public class PBO210117071Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int nSatu,nDua;
        int besar,kecil;
        String ulangi;
        
        System.out.println("===Program Perbandingan Nilai===");
        do{
        System.out.print("Masukkan Nilai Pertama : ");
        nSatu = scn.nextInt();
        System.out.print("Masukkan Nilai Kedua   : ");
        nDua = scn.nextInt();
        
        besar=((nSatu > nDua)?nSatu:nDua);
        kecil=((nSatu < nDua)?nSatu:nDua);
        
        System.out.println("Hasil : "+besar+" Lebih Besar dari "+kecil);
        System.out.print("Ulangi Aktifitas ? (Ya/Tidak): ");
        ulangi = scn.next();
        System.out.println("");
        }while(ulangi.equalsIgnoreCase("ya"));
    }
    
}
