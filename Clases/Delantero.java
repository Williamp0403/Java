package Clases;

public class Delantero extends Jugador {
    int finalizacion;

    public Delantero(String nombre, String apellido, String nacionalidad, int tiro, int pase, int defensa, int finalizacion) {
        super(nombre, apellido, nacionalidad, tiro, pase, defensa);
        this.finalizacion = finalizacion;
    }
    
    @Override
    public void habilidad_jugador() {
        super.habilidad_jugador();
        System.out.println("Habilidad: Cazagoles");
    }

    public int getFinalizacion() {
        return finalizacion;
    }

    public void setFinalizacion(int finalizacion) {
        this.finalizacion = finalizacion;
    }
    
}
