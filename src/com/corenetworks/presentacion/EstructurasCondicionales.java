package com.corenetworks.presentacion;

public class EstructurasCondicionales {
    public static void main(String[] args) {
        //En base a la edad programar si una persona puede conducir un ciclomotor
        final int edadMinima = 16;
        int edad = 10;
        if(edad < edadMinima)
        {
            System.out.println("no tiene edad suficiente para conducir un ciclomotor");
        }
        else
        {
            System.out.println("tiene edad suficiente para conducir un ciclomotor");
        }

        //Decir si un número es múltiplo de 4
        int numero = 15;
        if(numero%4==0){
            System.out.println("El numero es multiplo de 4");
        }
        else{
            System.out.println("El numero no es multiplo de 4");
        }

        //switch
        //Poner en letra una nota suspenso, suficiente, bien,  notable, sobresaliente

        int nota = 8;
        switch(nota)
        {
            case 0,1,2,3,4:
                System.out.println("Suspendo");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6,7:
                System.out.println("bien");
                break;
            case 8,9:
                System.out.println("Notable");
                break;
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Valor erroneo");

        }
        System.out.println(nota);

        int nota2 = 8;
        String mensaje;
        mensaje = switch(nota)
        {
            case 0,1,2,3,4-> "Suspendido";
            case 5 -> "Suficiente";
            case 6,7-> "bien";
            case 8,9->
                "Notable";
            case 10->
                "Sobresaliente";
            default->
                "Valor erroneo";
        };
        System.out.println(mensaje);




    }
}
