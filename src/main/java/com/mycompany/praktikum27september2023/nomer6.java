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
public class nomer6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double xa,ya,xb,yb,xc,yc;
        double a, b, c ;
        double s, keliling, luas;
        
        System.out.println("PROGRAM MENGHITUNG KELILING SEGITIGA SEMBARANG");
        System.out.print("Masukan absis untuk titik A : ");
        xa=in.nextDouble();
        System.out.print("Masukan ordinat untuk titik A : ");
        ya=in.nextDouble();
        System.out.print("Masukan absis untuk titik B : ");
        xb=in.nextDouble();
        System.out.print("Masukan ordinat untuk titik B : ");
        yb=in.nextDouble();
        System.out.print("Masukan absis untuk titik C : ");
        xc=in.nextDouble();
        System.out.print("Masukan ordinat untuk titik C : ");
        yc=in.nextDouble();
        
        a=Math.sqrt(Math.pow(xa-xb, 2)+Math.pow(ya-yb, 2));
        b=Math.sqrt(Math.pow(xb-xc, 2)+Math.pow(yb-yc, 2));
        c=Math.sqrt(Math.pow(xc-xa, 2)+Math.pow(yc-ya, 2));
        
        keliling= (a+b+c)/2;
        s=0.5*keliling;
        luas = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        System.out.println("__________________________________");
        System.out.println("Jarak antara titik A dan B "+a);
        System.out.println("Jarak antara titik B dan C "+b);
        System.out.println("Jarak antara titik C dan A "+c);
        System.out.println("Keliling segitiga adalah "+keliling);
        System.out.println("luas segitiga adalah "+luas);
        
    

    
    }
}
