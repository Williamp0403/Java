// Clase Match

// Raiz cuadrada: double variable = Math.sqrt(numero)

// Potencia: double variable = Match.pow(base, potencia)

// Redondear: double variable = Match.round(numero)

// Numero aleatorio: double variable = Match.random()

import javax.swing.JOptionPane;

public class OperadoresClaseMath{
    public static void main(String[] args) {    
        // Raiz cuadrada
        double raiz, resultado;
        raiz = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero a calcular su raiz"));
        resultado = Math.sqrt(raiz);
        JOptionPane.showMessageDialog(null, "La raiz de "+ raiz + " es: "+ resultado);

        // Potencia
        double potencia = Math.pow(2, 3);
        System.out.println("Potencia: "+ potencia);

        // Redondear
        double numero;
        long redondeado;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero a redondear"));
        redondeado = Math.round(numero);
        JOptionPane.showMessageDialog(null, "El numero "+ numero + ", redondeado es: "+ redondeado);
        
        // Numero aleatorio
        double aleatorio = Math.random();
        System.out.println("Aleatorio: "+ aleatorio);
    }
}