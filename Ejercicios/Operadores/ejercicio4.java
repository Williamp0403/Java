// Una compañia de venta de carros usados, paga a su personal de ventas un salario de 1.000$ mensual, mas una comision de 150$ por cada carro vendido, mas el 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.

package Operadores;

import javax.swing.JOptionPane;

public class ejercicio4 {
    public static void main(String[] args) {
        float salario = 1000;
        float comision = 150;
        float carro, venta, resultado;
        carro = Float.parseFloat(JOptionPane.showInputDialog("Cuantos carros vendio el empleado?"));
        comision *= carro;
        venta = Float.parseFloat(JOptionPane.showInputDialog("Cuanto vendio en total?"));
        venta *= 0.05;
        resultado = salario + comision + venta;
        JOptionPane.showMessageDialog(null, "El salario mensual del vendedor es " + resultado + "$.");
   }
}

