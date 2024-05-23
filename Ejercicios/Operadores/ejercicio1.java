package Operadores;
// Hacer un programa que calcule e imprima la suma de tres calificaciones

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, resultado;
        System.out.println("Ingrese la primera calificacion");
        nota1 = entrada.nextFloat();
        System.out.println("Ingrese la segunda calificacion");
        nota2 = entrada.nextFloat();
        System.out.println("Ingrese la tercera calificacion");
        nota3 = entrada.nextFloat();
        resultado = nota1 + nota2 + nota3;
        System.out.println("La suma de las calificaciones es: "+ resultado);
    }
}
