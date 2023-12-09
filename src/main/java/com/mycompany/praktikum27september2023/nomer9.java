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
public class nomer9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double vT, sT, v0, a, t;
        
        System.out.println("PROGRAM PERHITUNGAN PERCEPATAN");
        System.out.print("Masukan kecepatan awal : ");
        v0=in.nextDouble();
        System.out.print("Masukan waktu          : ");
        t=in.nextDouble();
        System.out.print("Masukan percepatan     : ");
        a=in.nextDouble();
        
        vT=v0+a*t;
        sT=v0*t+0.5*a*Math.pow(t, 2);
        System.out.println("____________________________________");
        System.out.println("kecepatannya adalah            : "+vT);
        System.out.println("dan jarak yang ditempuh adalah : "+sT);
    }
}
