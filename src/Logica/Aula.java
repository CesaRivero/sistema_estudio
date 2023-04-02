package Logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aula {
	
	ArrayList <Alumno> ListaAlumnos = new ArrayList <Alumno> ();
	
	private int numero;
	private String titulo;
	private String tema;
	private Profesor profesor;
	
	public Aula( int numero, String titulo, String tema) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.tema = tema;
	}

	public Aula( int numero, String titulo, String tema,Profesor profesor) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.tema = tema;
		this.profesor=profesor;
	}

	public ArrayList<Alumno> getListaAlumnos() {
		return ListaAlumnos;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		ListaAlumnos = listaAlumnos;
	}



	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public boolean AgregarAlumno(Alumno alumno) {
		
		if (alumno.isHabilitado()) {
			this.getListaAlumnos().add(alumno);
			return true;
		}else {
			return false;
		}

	}


	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Profesor getProfesor() {
		return profesor;
	}
	//preguntar mejor manera de agregar profesor a la clase o solo dejar el set
	public void agregarProfesor(Profesor profesor){

	}
}
