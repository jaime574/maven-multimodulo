package com.politecnicomalaga.calculadora;

public class calculadora {
    public static void main(String[] args) {
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();
        Division division = new Division();

        System.out.println(suma.sumar());
        System.out.println(resta.restar());
        System.out.println(multiplicacion.multiplicar());
        System.out.println(division.dividir());
    }
}
