// Variable: Es un espacio en memoria donde se almacena un valor
// Tipos de variables: entero, flotantes, caracter, String, booleano, 

// Tipo entero: Son un tipo de variables de numeros enteros, las cuales son, byte, short, int y long
// Byte: rango: -128 a 127 || Short: rango: -32.768 a 32.767 || Int: rango: -2.147.483.648 a -2.147.483.647 || Long: rango: -9.223.372.036.854.775.808 a  -9.223.372.036.854.775.807

// Tipo flotantes: Son un tipo de variables de numeros decimales, las cuales son float y double

// Tipo caracter: Son un tipo de variable de un caracter, el cual es char

// Tipo booleano: Verdadero o falso

// Constante: Es un espacio en memoria donde se almacena un valor que no se puede cambiar, de declara "final";

public class Variable {
    public static void main(String[] args) {
        // Tipo entero
        byte numByte = 20;
        System.out.println("Byte: "+ numByte);
        short numShort = 20000;
        System.out.println("Short: "+ numShort);
        int numInt = 293837373;
        System.out.println("Int: "+ numInt);
        long numLong = 2132175321;
        System.out.println("Long: "+ numLong);

        // Tipo flotante
        float numFloat = 125.32f;
        System.out.println("Float: "+ numFloat);
        double numDouble = 12.12112;
        System.out.println("Double: "+ numDouble);

        // Tipo Caracter
        char caracter = 's';
        System.out.println("char: "+ caracter);

        // Tipo String
        String cadenaDeCaracteres = "William";
        System.out.println("String: "+ cadenaDeCaracteres);

        // Tipo Boleano
        boolean opcion = true;
        System.out.println("Boleano: "+ opcion);

        // Constante
        final int num = 10;
        System.out.println("Constante: "+ num);
    }
}