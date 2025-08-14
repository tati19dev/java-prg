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
public class Ej6 {
    public static void main(String[] args) {
        int N;
        Scanner lee=new Scanner(System.in);
        System.out.println("Ingresar el numero:");
        N=lee.nextInt();
        if((N%3==0)&&(N%5!=0)){
            System.out.println("el numero introducido es multiplo de 3 pero no de 5");
        }
    }
}
