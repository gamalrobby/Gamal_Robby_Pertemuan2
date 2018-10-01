/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan26.waktusaatini;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program menampilkan waktu dan tanggal
 * saat ini
 */
public class PBO210117071Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date date = new Date();
        System.out.printf("%s %tA, %<te %<tb %<tY %<tT %n",
                "Hari ini adalah hari :",date);
        
        Calendar calender = Calendar.getInstance();
        SimpleDateFormat hari = new SimpleDateFormat("EEEE, d MMM YYY hh:mm:ss");
        
        String kalender = hari.format(calender.getTime());
        System.out.println("Hari ini adalah hari : "+kalender);
    }

}
