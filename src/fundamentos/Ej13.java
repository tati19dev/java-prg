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
public class Ej13 {
    public static void main(String[] args) {
        int Nteoria, Npractica;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese la nota de la teoria:");
        Nteoria = lee.nextInt();
        System.out.println("Ingrese la nota de practicas:");
        Npractica=lee.nextInt();
        if (Nteoria>=60 && Npractica>=60) {
            System.out.println("El estudiante aprobo");
        } else{
            System.out.println("El estudiante reprobo");
        }    
    }
}
