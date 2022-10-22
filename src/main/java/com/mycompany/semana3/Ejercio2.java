/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

import java.util.Scanner;

/**
 *
 * @author CARLOS
 */
public class Ejercio2 {
    public static void main (String[ ]args){
        int numer [ ]=new int [ 10 ],a=1;
        float pos=0,neg=0,cp=0,cn=0;
        Scanner s=new Scanner(System.in);
        for (int i=0; i<10; i++){
            System.out.println("Numero "+a+" :");
            numer [i]=s.nextInt();
            if(numer[i]>0){
                pos=pos+numer[ 1];
                cp++;
            }
            else if (numer [1 ]<0){
                neg=neg+numer[ 1];
                cn++;
                
            }
            a++;
        }
        pos=pos/cp;
        neg=neg/cn;
        System.out.println("Media positiosa :" +pos);
        System.out.println("Media negativos :" +neg);
                
    }
    
}
