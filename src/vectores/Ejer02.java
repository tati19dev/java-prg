/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author Tatiana
 */
public class Ejer02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vec[] = new int[5];
        
        for (int i = 0; i < vec.length; i++) {
            int num = sc.nextInt();
            vec[i] = num;
        }
        
        for (int i = 0; i < vec.length; i++) {
            System.out.print(" "+vec[i]);
        }
        
        System.out.println("");

        for (int i = 0; i < vec.length; i++) {
            vec[i] = vec[i] * vec[i];
        }
        
        for (int i = 0; i < vec.length; i++) {
            System.out.print(" "+vec[i]);
        }
        
        System.out.println("");

    }
}
