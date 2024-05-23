// Entrada de datos: Su funcion es darle un valor a una variable desde la consola, se utiliza la libreria import java.util.Scanner
// Estructura: Scanner nombre = new Scanner(System.in)

// Guardar diferentes tipos de variables:

// Tipo Enteros: 
// Byte: byte = entrada.nexByte() || Short: short = entrada.nextShort() || Int: int = entrada.nextInt()

// Tipo Flotantes: 
// Float: float = entrada.nexFloat() || Double: double = entrada.nextDouble()

// Tipo String: 
// String: string = entrada.next() (Guarda una cadena de texto hasta q haya un espacio (William Jose = Willian))
// String: string = entrda.nextLine() (Guarda toda la cadena, incluyendo los espacios (Wiliiam Jose = William Jose))

// Tipo Caracter
// Char: char = entrada.next().CharAt(indice)

import java.util.Scanner; // LLamo a la libreria para utlizar entrada de datos

public class EntradaYSalidaDeDatos {
    public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in); 
    String nombre;
    System.out.println("Ingrese su nombre: ");
    nombre = entrada.nextLine();
    System.out.println("Bienvenido "+ nombre);
    }
}
    