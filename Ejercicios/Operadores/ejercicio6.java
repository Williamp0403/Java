// Hacer un programa que calcule el cuadrado de una suma

package Operadores;

import javax.swing.JOptionPane;

public class ejercicio6 {
    public static void main(String[] args) {
        double num1, num2, suma, resultado;
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero:"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo numero:"));
        suma = num1 + num2;
        resultado = Math.pow(suma, 2);
        JOptionPane.showMessageDialog(null, "El cuadrado de la suma es: " + resultado);
    }
}