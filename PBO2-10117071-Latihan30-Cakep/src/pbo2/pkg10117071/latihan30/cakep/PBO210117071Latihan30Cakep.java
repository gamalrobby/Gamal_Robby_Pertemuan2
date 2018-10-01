/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program pemilihan kondisi (ya/tidak)
 * dan menghasilkan output yang sesuai
 */
public class PBO210117071Latihan30Cakep {
    public static final String 
            NORMAL = "\u001b[0m",RED = "\u001b[31m",GREEN = "\u001b[32m"
            ,YELLOW = "\u001b[33m",BLUE = "\u001b[34m",MAGENTA = "\u001b[35m"
            ,CYAN = "\u001b[36m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        String jawab;
        
        System.out.println(RED + "Kamu " + GREEN + "ngerjain sendiri " + YELLOW 
                + "latihan 17 sampe " + BLUE + "latihan 30 ini ? " 
                + NORMAL);
        System.out.print(BLUE + "Jawab " + RED + "(Yoi/Enggak) : " 
                + NORMAL);
        jawab = scn.nextLine();
        
        if (jawab.equalsIgnoreCase("yoi")){
            System.out.println("\n"+RED+"Cakep Bener. "+MAGENTA+"Good Job");
        } else {
            System.out.println("\n"+RED+"Tetep Cakep sih.\n"+CYAN+"Sing Penting"
                    +" paham konsep nya yee. \n"+NORMAL
                    +"Keep the code works dude");
        }
        
        
        
    }
    
}
