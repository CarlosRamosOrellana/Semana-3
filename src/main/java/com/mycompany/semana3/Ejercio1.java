/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.semana3;

import java.util.Scanner;

/**
 *
 * @author CARLOS
 */
public class Ejercio1 {

    public static void main(String[] args) {
        float numer[ ] ,a=1,media=0;
        Scanner sc=new Scanner (System.in);
        System.out.print("Ingerese el nuemero de personas");
        numer =new float[sc.nextInt() ];
        for (int i=0;i< numer.length;i++){
            System.out.print("Ingrese la altura de las personas"+a+":");
            numer[ 1]=sc.nextFloat();
            media=media+numer[i ];
            a++;
        }
        media=media/numer.length;
        a=0;
        for(int i=0;i<numer.length;i++){
            if (media<numer[1 ])
                a++;
        }
   System.out.println("Media de "+numer.length+"personas es }:"+media);
    System.out.println("Hay "+a+"personas superiores ala media. ");
    }
    
}
