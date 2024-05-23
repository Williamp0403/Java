package Operadores;
// Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales trabajadas y de su salario por hora

import javax.swing.JOptionPane;

public class ejercicio2 {
    public static void main(String[] args) {
        float salarioSemanal, horasTrabajadas, salarioHora;
        horasTrabajadas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese las horas semanales trabajadas"));
        salarioHora = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad que gana por hora en $"));
        salarioSemanal = horasTrabajadas * salarioHora;
        JOptionPane.showMessageDialog(null, "El salario semanal del empleado es "+ salarioSemanal + "$");
    }
}
