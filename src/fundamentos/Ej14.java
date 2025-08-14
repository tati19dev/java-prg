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
public class Ej14 {
    public static void main(String[] args) {
        int n;
        Scanner lee =new Scanner(System.in);
        System.out.println("ingrese el año");
        n=lee.nextInt();
        if (n%4==0 && n%100!=0) {
            System.out.println("El año es biciestro");
        }else if(n%400==0){
            System.out.println("El año es biciestro");
        }else{
            System.out.println("El año no es biciestro");
        }
    }  
}
