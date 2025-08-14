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
public class Ej23 {
    public static void main(String[] args) {
        int sum=0;
        Scanner lee =new Scanner(System.in);
        System.out.println("La suma es:");
        for (int i = 1; i <= 50; i++) {
            sum = sum+i;
        }
        System.out.println(" " +sum);
        System.out.println(" ");
    }
}
