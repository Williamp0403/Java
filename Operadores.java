// Operadores

// 1. Operadores Aritmeticos
// + Suma
// - Resta
// * Multiplicacion
// / Division
// % Modulo

// 2. Operadores de asignacion
// += Asignación de adición
// -= Asignación de sustracción
// *= Asignación de multiplicación
// /= Asignación de división


import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, resultado;           
        System.out.println("Digite el primer numero a sumar: ");
        num1 = entrada.nextInt();
        System.out.println("Digite el segundo numero a sumar");
        num2 = entrada.nextInt();
        resultado = num1 + num2; 
        System.out.println("El resultado de la suma es: "+ resultado);
    } 
}
