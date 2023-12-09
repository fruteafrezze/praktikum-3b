/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum27september2023;

import java.util.Scanner;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomer2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double hargaBarang, diskon = 20.0/100.0, hargaAsli, potonganHarga, hargaDiskon;
        int jumlahBarang;
        
        System.out.println("TOKO RAMAJU-MAJU");
        System.out.print("Harga barang = Rp ");
        hargaBarang=in.nextDouble();
        System.out.print("Jumlah barang = ");
        jumlahBarang=in.nextInt();
        
        hargaAsli=hargaBarang*jumlahBarang;
        System.out.println("Total harga barang sebelum diskon "+hargaAsli);
        potonganHarga=diskon*hargaAsli;
        System.out.println("Discount yang diperoleh "+potonganHarga);
        hargaDiskon=hargaAsli-potonganHarga;
        System.out.println("Total harga setelah discount "+hargaDiskon);
        
        
        
    }
        
        
    
}
