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
public class Ej1 {
    public static void main(String[] args) {
         double capital,ganancia;
         Scanner lee = new Scanner(System.in);
         System.out.println("ingresar el valor del,capital:");
         capital = lee.nextDouble();  
         ganancia = capital*0.02;
         System.out.println("La ganancaia es:"+ganancia);
    }      
}
