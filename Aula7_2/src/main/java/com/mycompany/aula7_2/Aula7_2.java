package com.mycompany.aula7_2;

import java.util.Scanner;


public class Aula7_2 {


    public static void main(String[] args) {
        int qtdmat=2, qtdaluno=3;
        
        int[][]notas=new int[qtdaluno][qtdmat];
        
        Scanner Teclado=new Scanner(System.in);
        Scanner Teclado2=new Scanner(System.in);
        int contal,contmat;
        
        String[] nomes=new String[qtdaluno];
        
        for(contal=0;contal<qtdaluno;contal++){
            System.out.println("\n\nDigite o nome do aluno:"+(contal+1));
            nomes[contal]=Teclado2.nextLine();
           for(contmat=0;contmat<qtdmat;contmat++){
               System.out.println("Digite a nota:" +(contmat+1));
               notas[contal][contmat]=Teclado.nextInt();
           }
    }
    System.out.println("impressao de notas");
    int soma=0;
    for(contal=0;contal<qtdaluno;contal++){
        soma=0;
        System.out.println("\n\nAluno: "+nomes[contal]);
        for(contmat=0;contmat<qtdmat;contmat++){
               System.out.print("     " + notas[contal][contmat]+" ");
               soma+=notas[contal][contmat];
               
    }
       System.out.println("  Media do Aluno="+(soma/qtdmat)); 
    
}}}
