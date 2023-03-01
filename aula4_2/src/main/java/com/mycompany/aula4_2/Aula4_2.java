package com.mycompany.aula4_2;

public class Aula4_2 {

    public static void main(String[] args) {
        boolean renda=false;
        boolean adimplencia=false;
        boolean privilege=false;
        boolean restricao=false;
        
        boolean resultado=((renda&&adimplencia)||privilege)&&!restricao;
        
        System.out.println("Emprestimo deve ser concedido ?"+ resultado);
    }
    
}
