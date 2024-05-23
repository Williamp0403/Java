// Entrada y salida de datos con JOptionPane: Permite la entrada y salida de datos mediante ventanas emergentes
// Libreria: import javax.swing.JOptionPane

// Entrada de datos:Devuelve un string

// Estructura: variable = JOptionPane.showInputDialog("mensaje")
// String: String = JOptionPane.showInputDialog("mensaje")
// char: char = JOptionPane.showInputDialog("mensaje").chartAt(indice)
// int: int = Integer.parseInt(JOptionPane.showInputDialog("mensaje"))
// Double: double = Double.parseDouble(JOptionPane.showInputDialog("mensaje"))

// Salida de datos: JOptionPane.showMessageDialog(null, "mensaje");


import javax.swing.JOptionPane;

public class InpYOutConJOptionPane {
    public static void main(String[] args) {
        // Entrada de datos
        // String
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        // Int
        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
        // Salida de datos
        JOptionPane.showMessageDialog(null, "Bienvenido, "+ nombre + " Su edad es "+ edad);
    }   
}