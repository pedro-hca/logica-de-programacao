package com.mycompany.aula6;


public class Aula6 {


    public static void main(String[] args) {
        int id=30;
        double alt=1.89;
        double pe=82.49;
        char sexo='M';
        
        System.out.println("Idade="+id);
        System.out.println("Altura="+alt);
        System.out.println("Peso="+pe);
        
        System.out.printf("Idade=%d\nAltura=%.2f\nPeso=%.1f\nSexo=%c",id,alt,pe,sexo);
    }
    
}
