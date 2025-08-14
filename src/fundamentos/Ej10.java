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
public class Ej10 {
    public static void main(String[] args) {
        int n;
        Scanner lee = new Scanner (System.in);
        System.out.println("Ingrese la nota:");
        n =lee.nextInt();
        if (n>=90) {
            System.out.println("Excelente nota");
        }else if(n>=70 && n<=89){
            System.out.println("Buena nota");
        }else if(n<70){
            System.out.println("reprobado");
        }
    }
}
