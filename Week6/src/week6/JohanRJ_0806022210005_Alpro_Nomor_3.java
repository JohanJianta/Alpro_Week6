package week6;
import java.util.Scanner;
public class JohanRJ_0806022210005_Alpro_Nomor_3 {
    
    public static void main(String[] args) {
        int pilihan;
        char ulang;
        boolean hitung = true;
        Scanner input = new Scanner (System.in);
        
        while (hitung) { //looping kalkulator
            boolean penjumlahan = true;
            boolean perkalian = true;
            boolean pembagian = true;
            boolean pangkat = true;
            boolean akar = true;
            int i = 1;
            int hasil = 0;
            int angka;
            double hasil2 = 1; // untuk pembagian dan akar, agar koma bisa terbaca
            double angka2; // untuk pembagian dan akar, agar koma bisa terbaca
            
            System.out.println("===============================================");
            System.out.println("                  Calculator                   ");
            System.out.println("===============================================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Perkalian");
            System.out.println("3. Pembagian");
            System.out.println("4. Pangkat");
            System.out.println("5. Akar");
            System.out.println("");
        
            System.out.print("Pilihan anda : ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1 :
                    while (penjumlahan) { //looping penjumlahan
                        System.out.println("===============================================");
                        System.out.println("                  Penjumlahan                  ");
                        System.out.println("===============================================");
                        System.out.print("Berapa banyak angka yang akan dimasukkan? ");
                        pilihan = input.nextInt();
                        System.out.println("");
                    
                        do { //looping input
                            System.out.print("Masukkan angka ke-"+i+" : ");
                            angka = input.nextInt();
                            System.out.println("");
                            hasil = hasil + angka;
                            i++;
                        } while (i <= pilihan);
                        System.out.println("Hasil akhir : "+hasil);
                        System.out.println("");
                        i = 1; //reset nilai
                        hasil = 0; //reset nilai
                        
                        System.out.println("Ulangi Lagi? [Y/N]");
                        ulang = input.next().charAt(0);
            
                        if (ulang == 'N' || ulang == 'n') {
                            penjumlahan = false;
                        }
                    }
                    break;
                case 2 :
                    while (perkalian) { //looping perkalian
                        hasil = 1; // biar tidak dikali 0
                        System.out.println("===============================================");
                        System.out.println("                   Perkalian                   ");
                        System.out.println("===============================================");
                        System.out.print("Berapa banyak angka yang akan dimasukkan? ");
                        pilihan = input.nextInt();
                        System.out.println("");
                    
                        do { //looping input
                            System.out.print("Masukkan angka ke-"+i+" : ");
                            angka = input.nextInt();
                            System.out.println("");
                            hasil = hasil * angka;
                            i++;
                        } while (i <= pilihan);
                        System.out.println("Hasil akhir : "+hasil);
                        System.out.println("");
                        i = 1; //reset nilai
                        
                        System.out.println("Ulangi Lagi? [Y/N]");
                        ulang = input.next().charAt(0);
            
                        if (ulang == 'N' || ulang == 'n') {
                            perkalian = false;
                        }
                    }
                    break;
                case 3 :
                    while (pembagian) { //looping pembagian
                        System.out.println("===============================================");
                        System.out.println("                   Pembagian                   ");
                        System.out.println("===============================================");
                        System.out.print("Berapa banyak angka yang akan dimasukkan? ");
                        pilihan = input.nextInt();
                        System.out.println("");
                    
                        do { //looping input
                            System.out.print("Masukkan angka ke-"+i+" : ");
                            angka2 = input.nextDouble();
                            System.out.println("");
                        
                            if (i == 1) {
                                hasil2 = angka2 / hasil2; 
                            } else {
                                hasil2 = hasil2 / angka2;
                            }
                        
                        i++;
                        } while (i <= pilihan);
                        System.out.println("Hasil akhir : "+hasil2);
                        System.out.println("");
                        i = 1; //reset nilai
                        hasil2 = 1; //reset nilai
                        
                        System.out.println("Ulangi Lagi? [Y/N]");
                        ulang = input.next().charAt(0);
            
                        if (ulang == 'N' || ulang == 'n') {
                            pembagian = false;
                        }
                    }
                    break;
                case 4 :
                    while (pangkat) { //looping pangkat
                        System.out.println("===============================================");
                        System.out.println("                    Pangkat                    ");
                        System.out.println("===============================================");
                        System.out.println("1. Jumlah");
                        System.out.println("2. Kurang");
                        System.out.println("");
                        System.out.print("Pilihan anda : ");
                        pilihan = input.nextInt();
                    
                        switch (pilihan) {
                            case 1 :
                                System.out.println("===============================================");
                                System.out.println("               Pangkat (Jumlah)                ");
                                System.out.println("===============================================");
                                System.out.print("Berapa banyak angka yang akan dimasukkan? ");
                                pilihan = input.nextInt();
                                System.out.println("");
                            
                                do { //looping input
                                    System.out.print("Masukkan angka ke-"+i+" : ");
                                    angka = input.nextInt();
                                    System.out.println("");
                                    hasil = hasil + angka * angka;
                                    i++;
                                } while (i <= pilihan);
                                System.out.println("Hasil akhir : "+hasil);
                            break;
                            case 2 :
                                System.out.println("===============================================");
                                System.out.println("               Pangkat (Kurang)                ");
                                System.out.println("===============================================");
                                System.out.print("Berapa banyak angka yang akan dimasukkan? ");
                                pilihan = input.nextInt();
                                System.out.println("");
                            
                                do {
                                    System.out.print("Masukkan angka ke-"+i+" : ");
                                    angka = input.nextInt();
                                    System.out.println("");
                                
                                    if (i == 1) { //looping input
                                        hasil = angka * angka - hasil;
                                    } else {
                                        hasil = hasil - angka * angka;
                                    }
                                
                                i++;
                                } while (i <= pilihan);
                                System.out.println("Hasil akhir : "+hasil);
                            break;
                            default :
                                System.out.println("Pilihan anda tidak valid, silahkan mencoba lagi");
                        }
                        i = 1; //reset nilai
                        hasil = 0; //reset nilai
                        System.out.println("");
                        
                        System.out.println("Ulangi Lagi? [Y/N]");
                        ulang = input.next().charAt(0);
            
                        if (ulang == 'N' || ulang == 'n') {
                            pangkat = false;
                        }
                    }
                    break;
                case 5 :
                    while (akar) { //looping akar
                        System.out.println("===============================================");
                        System.out.println("                     Akar                      ");
                        System.out.println("===============================================");
                        System.out.print("Masukkan angka : ");
                        angka = input.nextInt();
                        System.out.println("Hasil Akhir : "+Math.sqrt(angka));
                        System.out.println("");
                        
                        System.out.println("Ulangi Lagi? [Y/N]");
                        ulang = input.next().charAt(0);
            
                        if (ulang == 'N' || ulang == 'n') {
                            akar = false;
                        }
                    }
                    break;
                default :
                    System.out.println("Pilihan anda tidak valid, silahkan coba pilihan yang lain");
            }
            
            System.out.println("");
            System.out.println("Pakai Metode Kalkulator Lain? [Y/N]");
            ulang = input.next().charAt(0);
            
            if (ulang == 'N' || ulang == 'n') {
                System.out.println("");
                System.out.println("!! Terima Kasih !!");
                hitung = false;
            }
        }
    }
}