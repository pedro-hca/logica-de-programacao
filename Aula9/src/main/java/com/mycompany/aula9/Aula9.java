package com.mycompany.aula9;

import java.util.Arrays;


public class Aula9 {


    public static void main(String[] args) {
       int[] teste1={0,1,2,3,4};
       int[] teste2={9,7,4,1,7};
       int[] teste3={3,9,6,7,4};
       
       //impressão: Arrays.toString(array)
        System.out.println(Arrays.toString(teste1));
        System.out.println(Arrays.toString(teste2));
        System.out.println(Arrays.toString(teste3));
        
        //tamanho de um array: array.length
        System.out.println(teste1.length);

        //pesquisa/busca
        //ordenação
        Arrays.sort(teste1);//ordenação
        System.out.println(Arrays.binarySearch(teste1, 4));
        Arrays.sort(teste2);
        System.out.println(Arrays.binarySearch(teste2, 4));
        Arrays.sort(teste3);
        System.out.println(Arrays.binarySearch(teste3, 4));
        
        //copia
        System.out.println(Arrays.toString(teste1));
        teste1=Arrays.copyOf(teste3, teste3.length);
        System.out.println(Arrays.toString(teste1));
        
        //preenchimento de valores
        System.out.println(Arrays.toString(teste1));
        Arrays.fill(teste1,0);
        System.out.println(Arrays.toString(teste1));
        
        //coloca em letra minuscula
        String teste="JOAO";
        System.out.println(teste.toLowerCase());
        
        //nao deu certo
        String teste4="PEDRO";
        System.out.println(teste.charAt('P'));
        System.out.println(teste.charAt('E'));
        System.out.println(teste.charAt('D'));
        System.out.println(teste.charAt('R'));
        System.out.println(teste.charAt('O'));
    }
    
}
