package Clases;

public class MCD extends Jugador{
    int dominio; 

    public MCD(String nombre, String apellido, String nacionalidad, int tiro, int pase, int defensa, int dominio) {
        super(nombre, apellido, nacionalidad, tiro, pase, defensa);
        this.dominio = dominio;
    }

    @Override
    public void habilidad_jugador() {
        super.habilidad_jugador();
        System.out.println("Habilidad: Recuperacion de balon");
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
    }

}

