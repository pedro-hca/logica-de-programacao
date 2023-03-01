package com.mycompany.aula11;

import java.util.Scanner;
public class Aula11{


            static double soma(double a, double b){
              return (a+b);  
            } 
            static double sub(double a, double b){
            return (a-b);
            }
            static double mult(double a, double b){
                return (a*b);
            }
            static double div(double a, double b){
                return (a/b);
            }
            //RECURSIVIDADE
            
            
              //fatorial 5!=5*4*3*2*1
              //1º caso que se repete
              //2º demais casos
            static double fatorial(double num){
                if(num==1){
                    return 1;
                }else{
                    return (num*fatorial(num-1));
                }
              /*exponenciação: n^x
              10^1= 10
              10^2=10*10
              10^3=10*10*10
               */ 
            }
            static double exponenciacao(double base, double exp){
              //1º caso que se repete
              //2º demais casos 
              if(exp==1){
                  return base;
              }else{
                  return (base*exponenciacao(base,exp-1));
              }
            }
            
            /*Fibonacci
            valores:  0,1,1,2,3,5...(soma os dois anteriores = posições)  
            posições: 1,2,3,4,5,6
            */
            
            static double fibonacci(int pos){
                //caso base
                //outros casos
                if(pos==1){
                    return 0;
                }else if(pos==2){
                    return 1;
                }else{
                    return(fibonacci(pos-1)+fibonacci(pos-2));
                }
            }
              
              

           //metodo de receber um numero digitado pelo usuario
           static int num(){
                   System.out.println("Informe um numero para a operacao");
                   Scanner entrada= new Scanner(System.in);
                   return entrada.nextInt();
           }
           //metodo de imprimir o menu na tela
           static int menu(){
                System.out.println("\n\n\n\nMENU CALCULADORA");
                System.out.println("Digite 1 p/ Somar");
                System.out.println("Digite 2 p/ Subtrair");
                System.out.println("Digite 3 p/ Multiplicar");
                System.out.println("Digite 4 p/ Dividir");
                System.out.println("Digite 5 p/ Fatorial");
                System.out.println("Digite 6 p/ Exponenciacao");
                System.out.println("Digite 7 p/ Fibonnaci");
                System.out.println("Digite 0 p/ Sair");
                Scanner entrada=new Scanner(System.in);
                return entrada.nextInt();
           }
    
           //sistema de calculadora que da as opções soma e subtração
           public static void main(String[] args) {
            int a=2, b=2, num1;
            int opt;
            boolean continuar=true;
               
            do{
                opt=menu();
                switch (opt) {
                case 1:
                a=num();
                b=num();
                System.out.println("Soma "+soma(a,b));
                continuar=true;
                break;  
                case 2:
                a=num();
                b=num();
                System.out.println("Subtracao "+sub(a,b));
                continuar=true;
                break;
                case 3:
                a=num();
                b=num();
                System.out.println("Multiplicacao "+mult(a,b));
                continuar=true;
                break;
                case 4:
                a=num();
                b=num();
                System.out.println("Divisao "+div(a,b));
                continuar=true;
                break;
                case 5:
                a=num(); //coloquem regras para nao aceitar negativos
                if (a<=0){
                System.out.println("Nao tente numeros negativos");
                }else{
                System.out.println("Factorial "+fatorial(a));
                continuar=true;
                }
                break;
                case 6:
                System.out.println("Digite a base");
                a=num();//base
                System.out.println("Digite o expoente");
                b=num();//expoente
                System.out.println("Exponenciacao "+exponenciacao(a,b));
                continuar=true;
                break;
                case 7:
                a=num();//posicao
                System.out.println("Fibonacci "+fibonacci(a));
                continuar=true;
                break;
                case 0:
                continuar=false;
                System.out.println("Saindo do programa");
                break;
            default:
                System.out.println("Opcao invalidada, tente novamente.");
            }
            }while(continuar!=false);
            }
    }
       