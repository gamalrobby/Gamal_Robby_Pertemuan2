/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi menghitung pendapatan tunjangan dari 
 * kondisi menikah atau belum menikah dan gaji pokok
 */
public class PBO210117071Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gaji,tunjangan,tGaji;
        String status;

        System.out.println("==========Program Tunjangan==========");
        
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        Scanner scanner = new Scanner(System.in);
        gaji = scanner.nextInt();
        
        System.out.print("Status anda? (menikah/belum)     : ");
        status = scanner.next();
        
        tunjangan = (status.equals("menikah"))? gaji * 0.35 : 0;
        tGaji = tunjangan+gaji;
        
        System.out.println("==========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokok      : Rp " + gaji);
        System.out.println("Tunjangan       : Rp " + tunjangan);
        System.out.println("Total Gaji      : Rp " + tGaji);
        System.out.println("(Developed by : A Gamal Robby Abdulkarim)");
    }
    
}
