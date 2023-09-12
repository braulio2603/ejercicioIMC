package main;
import varIMC.varIMC;
import operaciones.calculoIMC;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        varIMC ingresarEstatura = new varIMC();
        System.out.println("Ingresa tu estatura");
        ingresarEstatura.setEstatura(sc.nextDouble());

        System.out.println("Ingresa tu peso");
        varIMC ingresarPeso = new varIMC();
        ingresarPeso.setPeso(sc.nextDouble());

        calculoIMC calcularIMC = new calculoIMC();
        calcularIMC.opCalculoIMC();

        //calculoIMC tipoPeso = new calculoIMC();
        //tipoPeso.tipoPeso();

    }
}
