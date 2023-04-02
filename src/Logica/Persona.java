package Logica;

public class Persona {

	private int id;
	private int pin;
	private String nombre;
	
	public Persona(int id, int pin,String nombre) {
		super();
		this.id = id;
		this.pin = pin;
		this.nombre=nombre;
	}
	
	

	@Override
	public String toString() {
		return "Persona [id=" + id + ", pin=" + pin + ", nombre=" + nombre + "]";
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	public boolean Login( int pin  ) {
		this.getPin();
		if(this.getPin() == pin) {
			return true;
		}
		return false;

	}
	
	
}
