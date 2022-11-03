package week6;
import java.util.Scanner;
public class JohanRJ_0806022210005_Alpro_Nomor_2 {
    
    public static void main(String[] args) {
        String nama;
        int pilihan;
        boolean main = true;
        Scanner input = new Scanner (System.in);
        
        int health = 5;
        int hungry = 2;
        int mood = 2;
        int clean = 4;
        System.out.println("===============================================");
        System.out.println("                   Tamagotchi                  ");
        System.out.println("===============================================");
        System.out.print("Masukkan nama Pet anda : ");
        nama = input.next();
        System.out.println("Nama Pet anda adalah "+nama);
        System.out.println("-----------------------------------------------");
        
        while (main) {
            System.out.println("Status "+nama+" saat ini :");
            System.out.println("Health = "+health+" | Hungry = "+hungry+
                               " | Mood = "+mood+" | Clean = "+clean);
            System.out.println("Apa yang anda ingin lakukan?");
            System.out.println("1. Beri Makan");
            System.out.println("2. Bermain");
            System.out.println("3. Mandi");
            System.out.println("4. Tidur");
            System.out.println("5. Bantuan");
            System.out.println("0. Exit");
            System.out.println("");
            System.out.print("Pilihan anda : ");
            pilihan = input.nextInt();
            System.out.println("");
            
            switch (pilihan) {
                case 1 :
                    hungry = hungry + 2;
                    System.out.println(nama+" makan dengan lahap");
                    System.out.println("Hungry +2");
                    break;
                case 2 :
                    mood = mood + 2;
                    clean = clean - 1;    hungry = hungry - 2;
                    System.out.println(nama+" bermain dengan riang");
                    System.out.println("Mood +2 | Clean -1 | Hungry -2");
                    break;
                case 3 :
                    clean = 5;
                    mood = mood - 1;
                    System.out.println("Anda memandikan "+nama);
                    System.out.println("Clean = 5 | Mood -1");    
                    break;
                case 4 :
                    health = health + 1;
                    hungry = hungry - 1;
                    System.out.println(nama+" tertidur dengan pulas");
                    System.out.println("Health +1 | Hungry -1");
                    break;
                case 5 :
                    System.out.println("Panduan Bermain :");
                    System.out.println("a) Memberi makan Pet akan menambahkan poin status Hungry sebanyak 2 poin");
                    System.out.println("b) Bermain dengan Pet akan menambahkan poin status Mood sebanyak 2 poin, tetapi akan mengurangi poin status Clean sebanyak 1 poin dan status Hungry sebanyak 2 poin");
                    System.out.println("c) Memandikan Pet akan mengubah poin status Clean menjadi 5 poin, tetapi akan mengurangi poin status Mood sebanyak 1");
                    System.out.println("d) Menidurkan Pet akan menambahkan poin status Health sebanyak 1 poin, tetapi akan mengurangi poin status Hungry sebanyak 1 poin");
                    System.out.println("e) Apabila poin salah satu status bernilai kurang dari 1 atau bernilai lebih dari 5 , maka poin status Health akan berkurang sebanyak 1 untuk setiap status");
                    System.out.println("f) Permainan akan berakhir apabila poin status Health bernilai 0");
                    break;
                case 0 :
                    System.out.println("Anda memilih keluar dari permainan");
                    System.out.println("Terima kasih telah bermain ^-^");
                    main = false;
                    break;
                default :
                    System.out.println("Pilihan anda tidak valid, silahkan coba pilihan yang lain");
                }
            
            System.out.println("---------------------------------------");
            
            if (hungry < 1 || hungry > 5) {
                health = health - 1;
            }
            
            if (mood < 1 || mood > 5) {
                health = health - 1;
            }
            
            if (clean < 1 || clean > 5) {
                health = health - 1;
            }
            
            if (health <= 0) {
                System.out.println(nama+" telah kabur dari rumah");
                System.out.println("GAME OVER");
                main = false;
            }     
        } 
    }
}
