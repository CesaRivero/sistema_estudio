package Logica;

public class Alumno extends Persona{
	
	private boolean habilitado;

	public Alumno(int id, int pin,String nombre, boolean habilitado) {
		super(id, pin,nombre);
		this.habilitado = habilitado;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	@Override
	public String toString() {
		return "Alumno [habilitado=" + habilitado + ", getNombre()=" + getNombre() + ", getId()=" + getId()
				+ ", getPin()=" + getPin() + "] \n";
	}

	
	
	
	
	
	

}
