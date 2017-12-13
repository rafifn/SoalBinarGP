/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author rf
 */
public class Kalkulator {
    private int angka1 ;
    private int angka2 ;
    private int hasil ;

    public int getAngka1() {
        return angka1;
    }

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }

    public int getHasil() {
        return hasil;
    }
    
    public void penjumlahan () {
        hasil = angka1 + angka2 ;
    }
    
    public void pengurangan () {
        hasil = angka1 - angka2 ;
    }
    
    public void perkalian () {
        hasil = angka1 * angka2 ;
    }
    
    public void pembagian () {
        hasil = angka1 / angka2 ;
    }

}
