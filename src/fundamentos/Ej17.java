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
public class Ej17 {
    public static void main(String[] args) {
        int n;
        Scanner lee=new Scanner(System.in);
        System.out.println("ingrese hasta el numero que desee:");
        n=lee.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print (" " +i);
        }
        System.out.println("");
    }
}
