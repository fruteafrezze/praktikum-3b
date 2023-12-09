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
public class nomer1 {
    public static void main(String[] args) {
        int jumlahMakan, jumlahLauk, jumlahMinum;
        double makan, lauk, minum, hargaTotal;
        
        
        Scanner masukan = new Scanner(System.in);
        
        makan=8000;
        lauk=3000;
        minum=2000;
        
        System.out.print(""" 
                         WARUNG MAKAN RAPAYUPAYU
                         
                         DAFTAR HARGA
                         MAKAN+SAYUR = 8000
                         SEMUA LAUK = 3000
                         SEMUA MINUM = 2000
                         
                           """);
        System.out.println("total tagihan yang harus dibayar jika jumlah total makan sebagai berikut");
        System.out.print("makan =\s");
        jumlahMakan = masukan.nextInt();
        System.out.print("lauk =\s");
        jumlahLauk = masukan.nextInt();
        System.out.print("minum =\s");
        jumlahMinum = masukan.nextInt();
        
        
        hargaTotal=jumlahMakan*makan+jumlahLauk*lauk+jumlahMinum*minum;
        System.out.println("total harga yang harus dibayar :\s"+hargaTotal);
        
        
        
    }
    
}
