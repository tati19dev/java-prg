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
public class Ej7 {
    public static void main(String[] args) {
        int Edad;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese la edad:" );
        Edad = lee.nextInt();
        if (Edad >=18) {
            System.out.println("Es mayor de Edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
