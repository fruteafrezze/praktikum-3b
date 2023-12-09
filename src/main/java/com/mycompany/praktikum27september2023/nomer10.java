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
public class nomer10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double fx, x, µ, σ ;
        
        System.out.println("PROGRAM FUNGSI DISTRIBUSI ");
        System.out.print("masukan nilai x : ");
        x = in.nextDouble();
        System.out.print("masukan nilai µ : ");
        µ = in.nextDouble();
        System.out.print("masukan nilai σ : ");
        σ = in.nextDouble();
        
        fx = (1/σ*Math.sqrt(2*Math.PI)*Math.pow(Math.E, Math.pow(-1.0/2.0*(x-µ)/σ, 2)));
        System.out.println("_______________________________");
        System.out.println("jadi nilai fx "+fx);
    }
}
