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
public class nomer4 {
    public static void main(String[] args) {
        double us1, us2, uas, nilaiFinal;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Nilai Final");
        System.out.print("US 1 : ");
        us1=in.nextDouble();
        System.out.print("US 2 : ");
        us2=in.nextDouble();
        System.out.print("UAS  : ");
        uas=in.nextInt();
        nilaiFinal=0.3*us1+0.3*us2+0.4*uas;
        System.out.println("_______________________________");
        System.out.println("Nilai Final = "+nilaiFinal);
        
        
    }
}
