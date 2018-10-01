/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi mencari nilai terbesar dan terkecil
 * dari nilai yang diinputkan user
 */
public class PBO210117071Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaPetugas;
        int bNilai,nilai[],j=1,i=1;
        int min,max;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("==Program Nilai Terbesar dan Terkecil Mahasiswa==");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        bNilai = scn.nextInt();
        
        nilai = new int[bNilai];
        while(i <= bNilai){
        System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
        nilai[i-1] = scn.nextInt();
        i = i+1;
        }
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        
        while (j <= bNilai){
            System.out.println("Nilai Mahasiswa ke-"+j+" = "+nilai[j-1]);
            j = j+1;
        }
        min=nilai[0];
        max=nilai[0];
        for (i=0; i < bNilai; i++){
            if(nilai[i] > max){
                max = nilai[i];   
            }
            else if(nilai[i] < min){
                min = nilai[i];    
            }    
        }
        System.out.println("");
        System.out.println("Nilai Terbesar adalah "+max);
        System.out.println("Nilai Terkecil adalah "+min);
        System.out.println("\nPetugas : "+namaPetugas);
    }

}
