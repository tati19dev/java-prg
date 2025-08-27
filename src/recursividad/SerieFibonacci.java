/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author Tatiana
 */
public class SerieFibonacci {

    public static void fibonacci(int n, int a, int b) {
        if (n > 0) {
            System.out.print(a + ", ");
            fibonacci(n - 1, b, a + b);
        }
    }

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese el numero deseado:");
        int n;
        n = lee.nextInt();
        System.out.println("La serie de fibonacci es:");
        fibonacci(n, 0, 1);
        System.out.println("");
    }
}
