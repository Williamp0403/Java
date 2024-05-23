package Clases;

public class LateralIzquierdo extends Jugador {

    int velocidad2;

    public LateralIzquierdo(String nombre, String apellido, String nacionalidad, int tiro, int pase, int defensa, int velocidad2) {
        super(nombre, apellido, nacionalidad, tiro, pase, defensa);
        this.velocidad2 = velocidad2;
    }

    @Override
    public void habilidad_jugador() {
        super.habilidad_jugador();
        System.out.println("Habilidad: Aceleracion");
    }

    public int getVelocidad2() {
        return velocidad2;
    }

    public void setVelocidad2(int velocidad2) {
        this.velocidad2 = velocidad2;
    }
    
}
