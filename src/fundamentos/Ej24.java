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
public class Ej24 {
    public static void main(String[] args) {
        int n, fac=1;
        Scanner lee=new Scanner(System.in);
        System.out.println("Ingrese el numero que desee para hallar el factorial:");
        n=lee.nextInt();
        for (int i = n; i>= 1; i--) {
            fac = fac*i;
        }
        System.out.println(" El factorial es:" +fac);
        System.out.println(" ");
    }
}
