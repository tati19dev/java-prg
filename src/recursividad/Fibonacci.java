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
public class Fibonacci {
    public static long fibonacci(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner lee =new Scanner(System.in);
        System.out.println("Ingrese el numero deseado:");
        int n;
        n=lee.nextInt();
        System.out.println("La serie de fibonacci es:");
        for (int i = 0; i < n; i++) {
            long fibo = fibonacci(i);
            System.out.print(fibo+" ");
        }
        System.out.println(" ");
    }
}
