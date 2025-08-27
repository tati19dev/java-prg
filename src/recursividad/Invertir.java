/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author Tatiana
 */
public class Invertir {

    public static String invertir(String txt) {
        if (txt.length() <= 1) {
            return txt;
        }
        return invertir(txt.substring(1)) + txt.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");
        String texto = sc.nextLine();
        System.out.println("Invertida: " + invertir(texto));
    }

}
