// Guillermo tiene n dolares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen los tres juntos.

package Operadores;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, resultado;
        System.out.println("Cuantos dolares tiene Guillermo?");
        guillermo = entrada.nextFloat();
        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;
        resultado = guillermo + luis + juan;
        System.out.println("Guillermo tiene " + guillermo + "$," + " Luis " + luis + "$," + " y Juan "+ juan + "$." + " Entre todos tienen "+ resultado + "$." );
    }
}
