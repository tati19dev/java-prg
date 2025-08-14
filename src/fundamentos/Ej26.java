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
public class Ej26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int[] vector = new int[10];
        System.out.println("ingrese los numeros que desee:");
        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            vector[i] = num;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("numero  "  + (i + 1)+ " : " + vector[i]);
        }
    }
}
