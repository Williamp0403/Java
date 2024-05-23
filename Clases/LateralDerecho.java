package Clases;

public class LateralDerecho extends Jugador {
    int velocidad1;
    public LateralDerecho(String nombre, String apellido, String nacionalidad, int tiro, int pase, int defensa, int velocidad1) {
        super(nombre, apellido, nacionalidad, tiro, pase, defensa);
        this.velocidad1 = velocidad1;
    }

    @Override
    public void habilidad_jugador() {
        super.habilidad_jugador();
        System.out.println("Habilidad: Centro bombeado");
    }

    public int getVelocidad1() {
        return velocidad1;
    }
    public void setVelocidad1(int velocidad1) {
        this.velocidad1 = velocidad1;
    }
    
}
