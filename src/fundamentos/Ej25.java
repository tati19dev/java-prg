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
public class Ej25 {
    public static void main(String[] args) {
        int n;
        Scanner lee=new Scanner(System.in);
        System.out.println("Ingrese el numero deseado:");
        n=lee.nextInt();
        for (int i = 7; i <= n; i=i+10) {
               System.out.print(" "+i);
            }
        System.out.println(" ");
        }
    }
 
