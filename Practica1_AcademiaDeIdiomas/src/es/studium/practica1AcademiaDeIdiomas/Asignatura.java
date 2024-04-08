package es.studium.practica1AcademiaDeIdiomas;

public class Asignatura {

	// Atributos
	private String nombreAsignatura;
	private int numeroHorasImpartidas;
	private int idAsignatura;

	// Constructores
	// Constructor vacío o por defecto
	public Asignatura() {
		nombreAsignatura = "";
		numeroHorasImpartidas = 0;
		idAsignatura = 0;
	}

	// Constructor por parámetros
	public Asignatura(String nombreAsignatura, int numeroHorasImpartidas, int idAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
		this.numeroHorasImpartidas = numeroHorasImpartidas;
		this.idAsignatura = idAsignatura;
	}

	// Métodos getters y setters
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public int getNumeroHorasImpartidas() {
		return numeroHorasImpartidas;
	}

	public void setNumeroHorasImpartidas(int numeroHorasImpartidas) {
		this.numeroHorasImpartidas = numeroHorasImpartidas;
	}

	public int getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
}
