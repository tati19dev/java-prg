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
public class Ej3 {
    public static void main(String[] args) {
        int r;
        double A;
        Scanner lee= new Scanner(System.in);
        System.out.println("Ingresar el radio:");
        r = lee.nextInt();
        A = Math.PI * Math.pow(r,2);
        System.out.println("El area de la circunferencia es:"+A);
    }
}
