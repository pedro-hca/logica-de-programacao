package com.mycompany.aula3_5;

import java.util.Scanner;

public class Aula3_5 {

    public static void main(String[] args) {  
     int num1, num2;
     
     Scanner Entrada=new Scanner (System.in);
     System.out.println("Digite o primeiro numero:");
     num1=Entrada.nextInt();
                  
     System.out.println("Digite o segundo numero:");
     num2=Entrada.nextInt();
     
     int soma= num1+num2;
     System.out.println("O resultado da soma eh = "+soma);
     
    }
    
}
