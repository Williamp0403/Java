package Clases;

public class Jugador { 
    // Atributos
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int tiro;
    private int pase;
    private int defensa;

    public Jugador(){

    }

    public Jugador(String nombre, String apellido, String nacionalidad, int tiro, int pase, int defensa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.tiro = tiro;
        this.pase = pase;
        this.defensa = defensa;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public int getTiro() {
        return tiro;
    }
    public void setTiro(int tiro) {
        this.tiro = tiro;
    }
    public int getPase() {
        return pase;
    }
    public void setPase(int pase) {
        this.pase = pase;
    }
    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void habilidad_jugador() {
        
    }
}



