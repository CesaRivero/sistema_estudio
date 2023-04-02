package Logica;

public class Profesor extends Persona{
    private String legajo;
    public Profesor(int id, int pin, String nombre,String legajo) {
        super(id, pin, nombre);
        this.legajo=legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
}
