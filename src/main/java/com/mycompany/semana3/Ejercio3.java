/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;
/**
 *
 * @author CARLOS
 */
public class Ejercio3 {
        public static void main(String[ ]args){
Scanner sc=new Scanner (System.in);
int [][] tabla=new int [3][3];
int a=1;
int   sum1=0,sum3=0,sum4=0,sum5=0,sum6=0;
for (int i=0; i<3;i++){
System.out.print("Ingrese el numero "+a+" i ");
a++;
System.out.println("");
tabla [i][j]=sc.nextInt();

}
}
for (int i=0; i<3;i++){
for (int j=0;j<3; j++){
System.out.print(tabla [i][j]+"");
}
System.out.ptintln("");
}
for(int i=0;i<3;i++){
switch (i){
case 0 -> {
sum1=sum1+tabla[i][j];
sum4=sum4+tabla[j][i];
}
case 1-> {
sum2=sum2+tabla[i][j];
sum5=sum5+tabla[j][i];
}
default ->{
sum3=sum3+tabla[i][j];
sum6=sum6+tabla[j][i];
}
}
}
}
System.out.println ("La suma de la fila 1 es :"+sum1);
System.out.println ("La suma de la fila 2 es :"+sum2);
System.out.println ("La suma de la fila 3 es :"+sum3);
System.out.println ("La suma de la columna 1 es :"+sum4);
System.out.println ("La suma de la columna 2 es :"+sum5);
System.out.println ("La suma de la columba 3 es :"+sum6);
}
}