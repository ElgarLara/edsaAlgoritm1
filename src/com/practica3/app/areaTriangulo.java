package com.practica3.app;
 
import java.util.Scanner;

public class areaTriangulo
{
public static void main(String[] args)
{
   double base=0.0;
   double height=0.0;
   double areaTriangle=0.0; 
   Scanner entradaTeclado;
   entradaTeclado = new Scanner(System.in);
   
   //input of the user
   System.out.println("write the base;");
   base= entradaTeclado.nextDouble();
   System.out.println("write height:");
   height = entradaTeclado.nextDouble();
   
   //process
   areaTriangle = (base*height)/2;
   
   //output
   System.out.println("the base you input was"+base);
   System.out.println("the height you input was"+height);
   System.out.println("the area of the triangle was"+areaTriangle);
   
   //closing of objects
   entradaTeclado.close();
   
   
   
   
   System.out.println("base input was here:"+base);
   
   
   
   }
}
