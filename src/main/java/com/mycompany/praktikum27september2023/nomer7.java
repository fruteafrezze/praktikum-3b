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
public class nomer7 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double f, x;
        
        System.out.println("PROGRAM PERHITUNGAN FUNGSI F(x)");
        System.out.println("f(x) = 5 + 6 x + 8 x^2 + 9 x^3 + 5 x^4.");
        System.out.print("Masukkan x = ");
        x=in.nextDouble();
        System.out.println("___________________________________________");
        f= 5+(6*x)+(8*Math.pow(x, 2))+(9*Math.pow(x, 3))+(5*Math.pow(x, 4));
        System.out.print("""
                           Hasil dari fungsi f(x) = 5 + 6 x + 8 x^2 + 9 x^3 + 5 x^4.
                           sebagai berikut :
                           """+f);
        
                
    }
}
