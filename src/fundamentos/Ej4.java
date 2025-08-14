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
public class Ej4 {
    public static void main(String[] args) {
        int E1,E2,mayor,menor,Diferencia;
        Scanner lee=new Scanner(System.in);
        System.out.println("Ingrese la primera edad:");
        E1=lee.nextInt();
        System.out.println("Ingrese la segunda edad: ");
        E2=lee.nextInt();
        mayor=Math.max(E1, E2);
        menor=Math.min(E1, E2);
        Diferencia=Math.abs(E1-E2);
        System.out.println("la edad del mayor es:"+mayor);
        System.out.println("La edad del menor es:"+menor);
        System.out.println("La diferencia de edades es:"+Diferencia);
    }
}
