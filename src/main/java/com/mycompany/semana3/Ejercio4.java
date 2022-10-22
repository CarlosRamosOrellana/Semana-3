/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author CARLOS
 */
public class Ejercio4 {
    public static void main(String[]args){
        int [][] matriz=new int [7][7];
        for (int i=0; i<7 ; i++){
        for (int j=0; j<7 ;j++){
            if (i!=j)
                matriz[i][j]=0;
            else 
               matriz[i][j]=i;
            
        }
        }
        for (int i=0; i<7;i++){
            for(int j=0; j<7; j++)
                System.out.print(matriz[i][j]+" ");
            System.out.println("");
        }
    }
}