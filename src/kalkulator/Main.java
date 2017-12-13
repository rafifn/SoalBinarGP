/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author rf
 */
public class Main {
    public static void main(String[] args){
        Kalkulator kalkulator = new Kalkulator () ;
        Scanner input = new Scanner(System.in);
        Boolean lagi = true ;
        
            System.out.println("Ini Adalah Kalkulator");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            
            System.out.print("Silahkan Pilih : ");
            int pilihan = input.nextInt();
            System.out.println("");
          
            System.out.print("Input Angka : ");
            int ang1 = input.nextInt();
            kalkulator.setAngka1(ang1);
            System.out.println("");
          
            System.out.print("Input Angka : ");
            int ang2 = input.nextInt();
            kalkulator.setAngka2(ang2);
            System.out.println("");
            if(pilihan==1){
                kalkulator.penjumlahan();
                System.out.println("Hasil = "+kalkulator.getHasil());
            }
            
            else if(pilihan==2){
                kalkulator.pengurangan();
                System.out.println("Hasil = "+kalkulator.getHasil());
            }
            
            else if(pilihan==3){
                kalkulator.perkalian();
                System.out.println("Hasil = "+kalkulator.getHasil());
            }
            
            else if(pilihan==4){
                kalkulator.pembagian();
                System.out.println("Hasil = "+kalkulator.getHasil());
            }
            
            else {
                System.out.println("Tidak Ada");
            }
    }
}