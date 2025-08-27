/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

import java.util.Scanner;

/**
 *
 * @author Tatiana
 */
public class Ej28 {
    public static void main(String[] args) {
        int n;
        Scanner lee=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        n=lee.nextInt();
        int [] vec= new int[n+1];
        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < n+1; i++) {
           int vector =lee.nextInt();
                vec[i]=vector;
        }
        for (int i = 0; i < vec.length; i++) {
            System.out.println("vector" +(i)+ ":" +vec[i]);
        }
    }
}
