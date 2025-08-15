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
public class Factorial1 {
 public static long factorial(int n) {
    if (n == 0 || n == 1) {
    return 1; // Caso base
    } else {
    return n * factorial(n - 1); // Llamada recursiva
    }
 }
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número entero positivo: ");
            int numero = sc.nextInt();
            if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
            } else {
            long resultado = factorial(numero);
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }
        sc.close();
    }
}

    

 

