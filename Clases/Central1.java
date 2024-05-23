package Clases;

public class Central1 extends Jugador {
    int entrada1;

    public Central1(String nombre, String apellido, String nacionalidad, int tiro, int pase, int defensa, int entrada1) {
        super(nombre, apellido, nacionalidad, tiro, pase, defensa);
        this.entrada1 = entrada1;
    }

    @Override
    public void habilidad_jugador() {
        super.habilidad_jugador();
        System.out.println("Habilidad: Juego aereo");
    }

    public int getEntrada1() {
        return entrada1;
    }

    public void setEntrada1(int entrada1) {
        this.entrada1 = entrada1;
    }
     
}
