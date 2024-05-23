package Clases;

public class MCO extends Jugador {
    int precision;

    public MCO(String nombre, String apellido, String nacionalidad, int tiro, int pase, int defensa, int precision) {
        super(nombre, apellido, nacionalidad, tiro, pase, defensa);
        this.precision = precision;
    }

    @Override
    public void habilidad_jugador() {
        super.habilidad_jugador();
        System.out.println("Habilidad: Tiro de larga distancia");
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
    
}
