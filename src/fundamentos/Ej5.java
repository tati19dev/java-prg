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
public class Ej5 {
    public static void main(String[] args) {
        int N;
        Scanner lee=new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        N=lee.nextInt();
            if(N>=0){
                System.out.println("El numero es positivo");
        }else if(N<0){
                System.out.println("El numero es negativo");
        }
    }
}
