/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang1;

import java.util.Scanner;

/**
 *
 * @author rf
 */
public class Bintang1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Masukkan Jumlah Baris : ");
        x = input.nextInt();
        System.out.println();
        for (int i=1;i<=x;i++){
            for(int j= 1 ; j<= i ; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }   
}
