package com.mycompany.aula4_2;

import java.util.Scanner;


public class Aula4_3 {


    public static void main(String[] args) {
        double altura, peso, imc;
        Scanner Entrada=new Scanner(System.in);
        
        System.out.println("Digite seu peso");
        peso=Entrada.nextDouble();
        System.out.println("Digite seu altura");
        altura=Entrada.nextDouble();
        
        imc=peso/(altura*altura);
        System.out.println("IMC = "+imc);
        
        if(imc<18.5){
      System.out.println("Abaixo do Peso");
    }else if((imc>=18.5)&&(imc<=24.9)){
        System.out.println("Peso Normal");
    }else if ((imc>24.9)&&(imc<=29.9)){
        System.out.println("Sobrepeso");
    }else if((imc>29.9)&&(imc<34.9)){
        System.out.println("Obesidade Grau 1");
    }else{
        System.out.println("Obesidade Grau 2");
    }
    
        
        }
    
}
