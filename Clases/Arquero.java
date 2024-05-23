package Clases;

public class Arquero extends Jugador{
    int reflejos;

    public Arquero(String nombre, String apellido, String nacionalidad, int tiro, int pase, int defensa, int reflejos) {
        super(nombre, apellido, nacionalidad, tiro, pase, defensa);
        this.reflejos = reflejos;
    }

    @Override
    public void habilidad_jugador() {
        super.habilidad_jugador();
        System.out.println("Habilidad Especial: Mano a mano");
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }
     
}




