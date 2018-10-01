/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan29.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program melihat kepribadian seseorang
 * dari warna yang dipilih
 */
public class PBO210117071Latihan29WarnaKepribadian {
    public static final String 
            NORMAL = "\u001b[0m",RED = "\u001b[31m",GREEN = "\u001b[32m"
            ,YELLOW = "\u001b[33m",BLUE = "\u001b[34m",MAGENTA = "\u001b[35m"
            ,CYAN = "\u001b[36m",WHITE = "\u001b[37m";
   
    public static final String 
            B_RED = "\033[41m",B_GREEN = "\033[42m",B_YELLOW = "\033[43m"
            ,B_BLUE = "\033[44m",B_MAGENTA = "\033[45m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        String pWarna,nama;
        
        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW 
                + "KEPRIBADIANMU " + CYAN + "DARI " + MAGENTA + "WARNA " 
                + BLUE + "FAVORITMU" + NORMAL + "\n");
        
        System.out.println(WHITE+B_RED+"\t MERAH \t\t \n" 
                +B_GREEN+"\t HIJAU \t\t \n" 
                +B_YELLOW+"\t KUNING \t \n" 
                +B_BLUE+"\t BIRU \t\t \n" 
                +B_MAGENTA+"\t UNGU \t\t \n" + NORMAL);
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        pWarna = scn.nextLine();
        System.out.print("NAMA KAMU : ");
        nama = scn.nextLine();
        
        System.out.println("");
        System.out.println("===HASIL TEST KEPRIBADIAN "+nama.toUpperCase()+"===");
        System.out.println("Warna Favoritmu adalah "+pWarna.toLowerCase());
        
        if (pWarna.equalsIgnoreCase("biru")){
            System.out.println("1. Menyenangkan, \n"+"2. Bijaksana,\n"
                    +"3. Pembawaan diri tenang saat menghadapi masalah, \n"
                    +"4. Dinamis, \n"+"5. Senang berbagi, \n"+"6. Bersahabat,\n"
                    +"7. Tidak terlalu suka menjadi sorotan banyak orang, \n"
                    +"8. Menyembunyikan perasaan karena karakternya yang "
                    + "cenderung mencari jalan damai. \n");
        } else if (pWarna.equalsIgnoreCase("merah")){
            System.out.println("1. Periang, \n"+"2. Pemberani,\n"
                    +"3. Berani mengambil resiko dalam setiap langkah, \n"
                    +"4. Menyukai tantangan, \n"+"5. Kurang sabar, \n"
                    +"6. Dapat menahan marah namun jika sudah tahap puncak "
                    + "toleransi,kemarahannya akan sulit dikontrol,\n"
                    +"7. Memiliki energi kehangatan dan cinta. \n");
        } else if (pWarna.equalsIgnoreCase("kuning")){
            System.out.println("1. Optimis, \n"+"2. Suka bergaul,\n"
                    +"3. Periang, \n"+"4. Senang menolong, \n"
                    +"5. Lincah dan aktif, \n"+"6. Tidak suka meremehkan "
                    + "kekurangan orang lain,\n"+"7. Loyal, \n"
                    +"8. Hangat, \n"+"9. Meskipun karakternya optimis dan "
                    + "idealis, seringkali goyah dan tidak stabil, \n"
                    +"10. Cenderung penakut.");
        } else if (pWarna.equalsIgnoreCase("ungu")){
            System.out.println("1. Optimis, \n"+"2. Tidak pernah ragu,\n"
                    +"3. Menurutnya pasangan yang ideal adalah yang memiliki "
                    +"mental yang kuat, \n"+"4. Memiliki ambisi yang besar,\n"
                    +"5. Memiliki empati yang besar, \n"+"6. Memiliki sisi "
                    + "misterius sebab seringkali menutupi perasaannya,\n"
                    +"7. Terkadang bersikap keras kepala dan angkuh, \n");
        } else if (pWarna.equalsIgnoreCase("hijau")){
            System.out.println("1. Romantis, \n"+"2. Menyukai hal yang berbau "
                    + "alami dan keindahan,\n"+"3. Teguh pada prinsip, \n"
                    +"4. Menginginkan kesempurnaan, \n"+"5. Mudah cemburu, \n"
                    +"6. Mudah merasa iri,\n"+"7. Menjunjung tinggi suatu nilai "
                    + "toleransi dan kepercayaan, \n");
        }
        
        
    
        
    }
    
}
