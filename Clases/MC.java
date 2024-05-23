package Clases;

public class MC extends Jugador {
    int vision;

    public MC(String nombre, String apellido, String nacionalidad, int tiro, int pase, int defensa, int vision) {
        super(nombre, apellido, nacionalidad, tiro, pase, defensa);
        this.vision = vision;
    }

    @Override
    public void habilidad_jugador() {
        super.habilidad_jugador();
        System.out.println("Habilidad: Creacion de juego");
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }
    
}
