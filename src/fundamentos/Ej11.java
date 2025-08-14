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
public class Ej11 {
    public static void main(String[] args) {
        int n;
        Scanner lee =new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        n = lee.nextInt();
        if (n==1){
            System.out.println("Lunes");
        }else if(n==2){
            System.out.println("Martes");
        }else if(n==3){
            System.out.println("Miercoles");
        }else if(n==4){
            System.out.println("Jueves");
        }else if(n==5){
            System.out.println("Viernes");
        }else if(n==6){
            System.out.println("Sabado");
        }else if(n==7){
            System.out.println("Domingo");
        }else {
            System.out.println("no es dia valido");
        }      
    }
}
