/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan22.perhitunganlingkaran;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program perhitungan  jari2,luas dan 
 * keliling lingkaran dengan diketahui diameternya yang telah diinput user.
 * dan program ini berisi validasi jika yang di inputkannya tidak sesuai dengan 
 * yang diinginkan
 */
public class PBO210117071Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // int  = 0;
        double diameter = 0;
        double jari, luas, keliling;
        double phi = 3.14159265358979323846;

        Scanner scanner = new Scanner(System.in);
        System.out.println("======Perhitungan Lingkaran======");
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            try {
                diameter = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Nilai Diameter Tidak Sesuai");
                scanner.nextLine();
            }
        } while (diameter == 0);

        jari = (diameter / 2);
        luas = (float) phi * (jari * jari);
        keliling = (phi * diameter);

        DecimalFormat dc = new DecimalFormat("#.##");
        System.out.println("");
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran \t= %s%n", dc.format(jari) + " cm");
        System.out.printf("Luas Lingkaran      \t= %s%n", dc.format(luas) + " cm");
        System.out.printf("Keliling Lingkaran  \t= %s%n", dc.format(keliling) + " cm");

    }

}
