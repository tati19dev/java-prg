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
public class Ej30 {
    public static void main(String[] args) {
        int n;
        Scanner lee=new Scanner(System.in);
        System.out.println("Ingresar el tamaño del vector:");
        n=lee.nextInt();
        int [] vec = new int[n];
        System.out.println("ingresar los vectores:");
        for (int i = 0; i < n; i++) {
            int num = lee.nextInt();
                vec[i]=num;
        }
        for (int i = 0; i < vec.length; i++) {
            System.out.println("num" +(i)+ ":" +  vec[i]);          
        }
        
    }
  
}
