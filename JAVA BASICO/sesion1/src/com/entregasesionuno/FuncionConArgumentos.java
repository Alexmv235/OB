package com.entregasesionuno;

public class FuncionConArgumentos {
    /**
     * En esta clase se crea un meteodo addIva que recibe un valor de tipo double
     * correspondiente al precio y se le aplica el iva del 13%
     * @param args
     */
    public static void main(String[] args) {

        double precioSinIva=1457.87;
        double precioConIva=addIva(precioSinIva);
        System.out.println(precioConIva);

        
    }
    static double addIva(double precio){
        return precio+precio*0.13;
    }
}
