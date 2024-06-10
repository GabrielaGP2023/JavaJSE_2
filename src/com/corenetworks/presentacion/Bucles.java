package com.corenetworks.presentacion;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        //Monstrar los números entre un rango
        //Pedir estos numeros por la consola
        //Ascendente

        int numero1 = 0, numero2 = 0;
        Scanner  datosEntrada = new Scanner(System.in);
        System.out.println("Introduce dos numeros y mostrare todos los numeros entre el primero y el segundo");
        System.out.println("primer numero: ");
        numero1 = datosEntrada.nextInt();
        System.out.println("Segundo numero: ");
        numero2 = datosEntrada.nextInt();
        if(numero1 < numero2)
        {
            for(int i = numero1; i <= numero2;i++)
            {
                System.out.println(i);
            }
        }
        else
        {
            for (int i = numero2; i <= numero1; i++) {
                System.out.println(i);
            }
        }

    }
}
