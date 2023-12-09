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
public class nomer3 {
    public static void main(String[] args) {
        int nilai1, nilai2, nilai3;
        double nilaiRerata;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("SD BHINNEKA");
        System.out.print("Nilai 1 : ");
        nilai1=in.nextInt();
        System.out.print("Nilai 2 : ");
        nilai2=in.nextInt();
        System.out.print("Nilai 3 : ");
        nilai3=in.nextInt();
        nilaiRerata=(nilai1+nilai2+nilai3)/3;
        System.out.println("_____________________________");
        System.out.print("Nilai rata-rata = "+nilaiRerata);
        
    }
}
