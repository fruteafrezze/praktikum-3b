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
public class nomer5 {
    public static void main(String[] args) {
        String nama;
        double tinggiBadan, beratIdeal;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("PROGRAM BERAT IDEAL");
        System.out.print("nama         : ");
        nama=in.nextLine();
        System.out.print("Tinggi badan : ");
        tinggiBadan=in.nextDouble();
        beratIdeal=tinggiBadan-100;
        System.out.println("Berat ideal anda adalah "+beratIdeal);
        
    }
}
