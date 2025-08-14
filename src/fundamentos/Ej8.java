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
public class Ej8 {
    public static void main(String[] args) {
        int n;
        Scanner lee = new Scanner (System.in);
        System.out.println("Ingrese el numero:" );
        n = lee.nextInt();
        if (n>0) {
            System.out.println("El numero ingresado es positivo:" );
        }else if(n<0){
            System.out.println("El numero ingresado es negativo:" );
        }else {
            System.out.println("El numero es cero:");
        }  
    }   
}
