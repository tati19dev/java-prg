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
public class Ej29 {

    public static void main(String[] args) {
        int n, suma = 0;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese el tama;o del vector");
        n = lee.nextInt();
        int[] sumvec = new int[n];
        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < n; i++) {
            int vec = lee.nextInt();
            sumvec[i] = vec;
        }
        for (int i = 0; i < sumvec.length; i++) {
            suma = suma + sumvec[i];
        }
        for (int i = 0; i < sumvec.length; i++) {
            System.out.println(" vec" + (i) + ":" + sumvec[i]);
        }
        System.out.println("La suma de todos los vectores introducidos son:");
        System.out.println(" " + suma);
    }
}
