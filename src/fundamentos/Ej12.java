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
public class Ej12 {
    public static void main(String[] args) {
        int n;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresar el numero:");
        n=lee.nextInt();
        if (n%5==0 && n%3==0) {
            System.out.println("el numero es multiplo de 5 y 3");            
        }else if (n%5==0) {
            System.out.println("El numero es multiplo de 5");
        }else if (n%3==0) {
            System.out.println("El numero es multiplo de 3");
        }else{
            System.out.println("El numero no es multiplo de 3 ni de 5");
        }
    }
}
