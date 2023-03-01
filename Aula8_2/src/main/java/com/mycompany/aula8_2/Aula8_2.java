package com.mycompany.aula8_2;

import java.io.*;
import java.util.Scanner;


public class Aula8_2 {
public static void main(String[] args) {
    int linhas=1, colunas=4;
    Scanner Entrada=new Scanner(System.in);
    Scanner Entrada1=new Scanner(System.in);
    
    String[][] endereco=new String [linhas][colunas];
    
    String pausa;
    
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
        System.out.println("Digite o bairro: ");
        endereco[contl][3]=Entrada1.nextLine();
    }
    System.out.println("ENDEREÇOS INFORMADOS");
    pausa=Entrada.next();
    
    try{
       FileWriter arquivo=new FileWriter("C:\\Users\\Pedro\\Documents\\exemplo\\dados.txt", true);
    PrintWriter gravararquivo=new PrintWriter(arquivo);
    
    for(contl=0;contl<linhas;contl++){
         gravararquivo.print(endereco[contl][0].toUpperCase());
         gravararquivo.print(" "+endereco[contl][1].toUpperCase()+";");
         gravararquivo.print(" "+endereco[contl][2].toUpperCase()+";");
         gravararquivo.print(" "+endereco[contl][3].toUpperCase());
         gravararquivo.println();
        }
        gravararquivo.close();
        arquivo.close();
    }catch(IOException e){
        System.out.println("Deu erro na gravacao");
    } 
    System.out.println("INFORMACOES SALVAS NO ARQUIVO");
     pausa=Entrada.next();
     
     try{
         FileReader lerarquivo=new FileReader("C:\\Users\\Pedro\\Documents\\exemplo\\dados.txt");
     BufferedReader bufleitura=new BufferedReader(lerarquivo);
     
     String linha;
     linha=bufleitura.readLine();
     while(linha!=null){
         System.out.println(linha);
         linha=bufleitura.readLine();
     
     }
     lerarquivo.close();
     bufleitura.close();
     }catch(IOException e){
         System.out.println("Deu erro na leitura.");
     }
     
     
    }
    }