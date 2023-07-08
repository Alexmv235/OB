package com.entregasesionuno;

public class ConcatenarTexto {
    public static void main(String[] args) {
        
        String[] palabras = {"p1","p2","p3"};
        String resultado="";

        for(String palabra:palabras){
            resultado=resultado+palabra;
        }
        System.out.println(resultado);
    }
    
}
