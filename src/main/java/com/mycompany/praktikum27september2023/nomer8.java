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
public class nomer8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double jariJari, tinggi, luas, volume;
        
        System.out.println("PROGRAM PERHITUNGAN VOLUME DAN LUAS KERUCUT");
        System.out.print("Masukkan jari-jari = ");
        jariJari=in.nextDouble();
        System.out.print("Masukan tinggi     = ");
        tinggi=in.nextDouble();
        volume=1.0/3.0*Math.PI*Math.pow(jariJari, 2)*tinggi;
        luas=Math.PI*Math.pow(jariJari, 2)+Math.PI*Math.pow(jariJari, 2)*tinggi;
        System.out.println("______________________________________");
        System.out.println("volume kerucut tersebut adalah "+volume);
        System.out.println("luas kerucut adalah = "+luas);
    }
}
