/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program ejaan nama yang inputannya
 * berasal dari user
 */
public class PBO210117071Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        String nama;
        System.out.print("Masukkan Nama Depan Anda Untuk Dieja : ");
        nama = scn.next();
        System.out.println("");
        
        String[] huruf=nama.split("(?<=\\G.{1})");
        System.out.println("Ejaan Untuk \""+nama+"\" adalah :");
        for (int i = 1; i <= huruf.length; i++){
            System.out.println("Huruf Ke-"+i+" :"+huruf[i-1]);
        }
    }
    
}
