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
public class Ej27 {
    public static void main(String[] args) {
        int n;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        n=lee.nextInt();
         int [] vector= new int [n];
        System.out.println("Ingrese los numeros deseados para el vector");    
        for (int i = 0; i < n; i++) {
           int numero =lee.nextInt();
            vector[i] = numero;
        }
        for (int i = 0; i < vector.length; i++) {
             System.out.println("numero "+(i+1)+":"+vector[i]); 
        }         
    }
}
