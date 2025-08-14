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
public class Ej2 {

    public static void main(String[] args) {
        int M, H,Total;
        double Div,Div1,PH,PM;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de mujeres:");
        M = lee.nextInt();
        System.out.println("ingrese la cantiadad de hombres:");
        H = lee.nextInt();
        Total = M + H;
        System.out.println("----"+(M+H));
        Div=(double) M/Total;
        System.out.println("----"+(Div));
        Div1=H/Total;
        System.out.println("----"+(Div1));
        PM =(Div*100);
        PH =(Div1*100);
        System.out.println("el porcentaje de mujeres es:" +PM);
        System.out.println("el porcentaje de hombres es:" +PH);
    }
}
