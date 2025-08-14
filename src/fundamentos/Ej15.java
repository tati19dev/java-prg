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
public class Ej15 {
    public static void main(String[] args) {
        String n;
        Scanner lee=new Scanner(System.in);
        System.out.println("Ingrese su contraseña:");
        n=lee.next();
        if (n.equals("Raybin")) {
            System.out.println("acceso concedido");
        }else {
            System.out.println("acceso denegado");
        }       
    } 
}
