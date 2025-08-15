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
public class PotenciaNum {
    public static long potencia(int b,int exp){
        if(exp == 0) {
            return 1;
        }
        return b*potencia(b,exp-1);
    }
    public static void main(String[] args) {
        Scanner lee =new Scanner(System.in);
        int exp,b;
        System.out.println("Ingrese el valor del exponente");
        exp=lee.nextInt();
        System.out.println("Ingrese el valor de la base");
        b=lee.nextInt();
        System.out.println("La potencia de un muero es:");
      
             long Pt = potencia(b,exp);
            System.out.print(Pt+" ");
        
        System.out.println(" ");
    }
}

