package com.corenetworks.presentacion;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Calcular el perímetro de un rectangulo
        int base=10, altura =5, perimetro;
        perimetro = (2*base)+(2*altura);
        System.out.println("perimetro 1 "+ perimetro);
        perimetro = 2*(base+altura);
        System.out.println("perimetro 2 " + perimetro);

        //Calcular el área de cuadrado utilizando la clase Math
        double ladoC = 5, areaC;
        areaC = Math.pow(ladoC,2);
        System.out.println("Area del Cuadrado " + areaC);

        //Declarar una variable y luego de inicializarla incrementar en 1
        int valor = 10;
        valor++;
        System.out.println("Valor de variable "+ valor);
    }
}
