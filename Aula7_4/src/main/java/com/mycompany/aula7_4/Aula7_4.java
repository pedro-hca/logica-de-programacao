package com.mycompany.aula7_4;

import java.util.Scanner;


public class Aula7_4 {
public static void main(String[] args) {
    int linhas=2, colunas=4;
    Scanner Entrada=new Scanner(System.in);
    Scanner Entrada1=new Scanner(System.in);
    
    String[][] endereco=new String [linhas][colunas];
    System.out.println("Coleta de informacoes");
    int contl;
    for(contl=0;contl<linhas;contl++){
        System.out.println("\n\nEndereco "+(contl+1));
        System.out.println("Digite o tipo de Logradouro: ");
        endereco[contl][0]=Entrada.next();
        System.out.println("Digite o nome: ");
        endereco[contl][1]=Entrada1.nextLine();
        System.out.println("Digite o numero: ");
        endereco[contl][2]=Entrada.next();
        System.out.println("Digite o nome do bairro: ");
        endereco[contl][3]=Entrada1.nextLine();
    }
    for(contl=0;contl<linhas;contl++){
         System.out.println("\nEndereco "+(contl+1));
         System.out.print("    "+endereco[contl][0].toUpperCase());
         System.out.print(" "+endereco[contl][1].toUpperCase()+",");
         System.out.print(" "+endereco[contl][2].toUpperCase()+",");
         System.out.print(" "+endereco[contl][3].toUpperCase());
             
         }
        
        
    }   
        
        
        
        
    }
    

