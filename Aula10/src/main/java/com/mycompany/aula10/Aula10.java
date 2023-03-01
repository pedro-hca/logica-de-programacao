package com.mycompany.aula10;

import java.util.Scanner;
public class Aula10{


            //metodo para soma com sobrecarga
            //soma dois numeros
            static double soma(double a, double b){
              return (a+b);  
            }
            //soma tres numeros
            static double soma(double a, double b, double c){
              return (a+b+c);  
            }
            //soma quatro numeros
            static double soma(double a, double b, double c, double d){
              return (a+b+c+d);  
            }

            
            //metodo para subtração
            static double sub(double a, double b){
            return (a-b);
            }
            static double mult(double a, double b){
                return (a*b);
            }
            static double div(double a, double b){
                return (a/b);
            }
            static double quadrado(double a){
                return (a*a);
            }

           //metodo de receber um numero digitado pelo usuario
           static double num(){
                   System.out.println("Digite um valor");
                   Scanner Entradanum=new Scanner(System.in);
                   return Entradanum.nextDouble();
           }
           //metodo de imprimir o menu na tela
           static void menu(){
                System.out.println("Calculadora");
                System.out.println("Digite 12 p/ Somar dois numeros");
                System.out.println("Digite 13 p/ Somar tres numeros");
                System.out.println("Digite 14 p/ Somar quatro numeros");
                System.out.println("Digite 2 p/ Subtracao");
                System.out.println("Digite 3 p/ Multiplicacao");
                System.out.println("Digite 4 p/ Divisao");
                System.out.println("Digite 5 p/ Quadrado");
                System.out.println("Digite 0 p/ Sair");
           }
    
           //sistema de calculadora que da as opções soma e subtração
           public static void main(String[] args) {
            double a, b, c, d, resultado;
            int opt;
            boolean continuar=true;
            Scanner Entrada=new Scanner(System.in);
               
            do{
               menu();
                opt=Entrada.nextInt();
                   
            switch (opt) {
                case 12:
                a=num();
                b=num();
                resultado=soma(a,b);
                System.out.println("Resultado =" + resultado+"\n\n\n\n\n");
                break;
                case 13:
                a=num();
                b=num();
                c=num();
                resultado=soma(a,b,c);
                System.out.println("Resultado =" + resultado+"\n\n\n\n\n");
                break;
                case 14:
                a=num();
                b=num();
                c=num();
                d=num();
                resultado=soma(a,b,c,d);
                System.out.println("Resultado =" + resultado+"\n\n\n\n\n");
                break;  
                case 2:
                a=num();
                b=num();
                resultado=sub(a,b);
                System.out.println("Resultado =" + resultado+"\n\n\n\n\n");
                break;
                case 3:
                a=num();
                b=num();
                resultado=mult(a,b);
                System.out.println("Resultado =" + resultado+"\n\n\n\n\n");
                break;
                case 4:
                a=num();
                b=num();
                if(b==0){
                    System.out.println("Divisao impossivel.");
                }else{
                resultado=div(a,b);
                System.out.println("Resultado =" + resultado+"\n\n\n\n\n");
                }
                break;
                case 5:
                a=num();
                resultado=quadrado(a);
                System.out.println("Resultado =" + resultado+"\n\n\n\n\n");
                break;
                case 0:
                continuar=false;
                break;
            default:
                System.out.println("Opcao invalidada, tente novamente.");
                break;
            }
            }while(continuar==true);
            }
    }
                         
