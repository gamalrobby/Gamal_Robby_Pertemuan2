/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi menghitung rata-rata nilai yang 
 * inputan nilainya berasal dari user
 */
public class PBO210117071Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1,bMhs,nMhs[];
        double rata,jmlh=0;
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        bMhs = scanner.nextInt();
        
        nMhs = new int[bMhs];
        while(i <= bMhs){
        System.out.print("Nilai Mahasiswa ke-"+ i +" : ");
        nMhs[i-1] = scanner.nextInt();
        jmlh = jmlh + nMhs[i-1];
        i = i+1;
        }
        rata = jmlh / bMhs;
        System.out.println("");
        System.out.println("Maka,Rata-Rata Nilainya adalah "+rata);
        System.out.println("");
        System.out.println("Developed by : A Gamal Robby Abdulkarim");
    }
    
}
