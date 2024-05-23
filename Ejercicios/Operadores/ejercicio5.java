// La calificacion final de un estudiante de informatica se calcula con base a las calificaciones de cuatro aspectos de su rendimiento academico: participacion, primer examen parcial, segundo examen parcial y examen final. Sabiendo que las calificaciones anteriores entran a la calificacion final con ponderaciones del 10%, 25%, 25% y 40%. Hacer un programa que calcule e imprima la calificacion final obtenida por un estudiante.

package Operadores;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion, parcial1, parcial2, examenFinal, calificacionFinal;
        System.out.println("Cuanto saco en la participacion? ");
        participacion = entrada.nextFloat();
        participacion *= 0.10;
        System.out.println("Cuanto saco en el primer parcial?");
        parcial1 = entrada.nextFloat();
        parcial1 *= 0.25;
        System.out.println("Cuanto saco en el segundo parcial?");
        parcial2 = entrada.nextFloat();
        parcial2 *= 0.25;
        System.out.println("Cuanto saco en el examen final?");
        examenFinal = entrada.nextFloat();
        examenFinal *= 0.40;
        calificacionFinal = participacion + parcial1 + parcial2 + examenFinal;
        System.out.println("La clasificacion final del estudiante es: " + calificacionFinal);
    }  
}
