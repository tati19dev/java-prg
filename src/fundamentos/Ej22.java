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
public class Ej22 {
    public static void main(String[] args) {
        int n;
        Scanner lee =new Scanner(System.in);
        System.out.println("ingrese el numero de tabla que desee:");
        n=lee.nextInt();
        System.out.println("La tabla es:");
        for (int i = 1; i <= 10; i++) {
            int p = n*i;
            System.out.println(n+ "*"+i+" = " +p);
        }
        System.out.println(" ");
    }
}
