/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan20.saldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi perhitungan lama tabungan sampai
 * mencapai saldo target
 */
public class PBO210117071Latihan20SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo=3500000;
        int bulan=1;
        
        DecimalFormat decimal = (DecimalFormat) DecimalFormat.getIntegerInstance();
        DecimalFormatSymbols format = new DecimalFormatSymbols();
        format.setGroupingSeparator('.');
        decimal.setDecimalFormatSymbols(format);
        
        while(saldo <= 6000000  ){
            saldo = (int) (saldo+(saldo * 0.08));
            System.out.printf("Saldo di Bulan ke-"+bulan+" Rp %s %n",decimal.format(saldo));
            bulan = bulan+1;
        }
    }
    
}
