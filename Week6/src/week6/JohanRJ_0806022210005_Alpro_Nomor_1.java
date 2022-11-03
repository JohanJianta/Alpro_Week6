package week6;
import java.util.Scanner;

public class JohanRJ_0806022210005_Alpro_Nomor_1 {
    
    public static void main(String[] args) {
        int pilihan, angka;
        char ulang;
        boolean hitung = true;
        Scanner input = new Scanner (System.in);
        
        while (hitung) {
            int hasil = 0;
            int i = 1;
            System.out.println("===============================================");
            System.out.println("                 Deretan Angka                 ");
            System.out.println("===============================================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Perkalian");
            
            System.out.print("Pilih angka : ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1 :
                    System.out.println("-----------------------------------------------");
                    System.out.println("                 Penjumlahan                   ");
                    System.out.println("-----------------------------------------------");
                    
                    System.out.print("Angka : ");
                    angka = input.nextInt();
                    
                    do {
                        hasil = hasil + i;
                        System.out.print(i);
                        i++;
                        if (i <= angka) {
                            System.out.print("+");
                        }
                    } while (i <= angka);
                    System.out.println("= "+hasil);
                    
                    break;
                
                case 2 :
                    System.out.println("-----------------------------------------------");
                    System.out.println("                   Perkalian                   ");
                    System.out.println("-----------------------------------------------");
            
                    System.out.print("Angka : ");
                    angka = input.nextInt();
                    hasil = 1;
                    
                    do {
                        hasil = hasil * i;
                        System.out.print(i);
                        i++;
                        if (i <= angka) {
                            System.out.print("x");
                        }
                    } while (i <= angka);
                    System.out.println("= "+hasil);
                    
                    break;
                
                default :
                    System.out.println("Pilihan anda tidak valid");
                    
            }
            
            System.out.println("");
            System.out.println("Hitung lagi? [Y/N]");
            ulang = input.next().charAt(0);
            
            if (ulang == 'N' || ulang == 'n') {
                hitung = false;
            }
            System.out.println("");
        }
    }
}
