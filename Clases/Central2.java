package Clases;

public class Central2 extends Jugador{
    // Atributos
    int entrada2;
    
    public Central2(String nombre, String apellido, String nacionalidad, int tiro, int pase, int defensa, int entrada2) {
        super(nombre, apellido, nacionalidad, tiro, pase, defensa);
        this.entrada2 = entrada2;
    }

    @Override
    public void habilidad_jugador() {
        super.habilidad_jugador();
        System.out.println("Habilidad: Despeje");
    }

    public int getEntrada2() {
        return entrada2;
    }

    public void setEntrada2(int entrada2) {
        this.entrada2 = entrada2;
    }
    
}
