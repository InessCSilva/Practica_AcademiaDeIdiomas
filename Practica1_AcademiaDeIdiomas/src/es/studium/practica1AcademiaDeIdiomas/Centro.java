package es.studium.practica1AcademiaDeIdiomas;

public class Centro {

	// Atributos
	private String nombreCentro;
	private String direccionCentro;
	private int idCentro;

	// Constructores
	// Constructor vacío o por defecto
	public Centro() {
		nombreCentro = "";
		direccionCentro = "";
		idCentro = 0;
	}

	// Constructor por parámetros
	public Centro(String nombreCentro, String direccionCentro, int idCentro) {
		this.nombreCentro = nombreCentro;
		this.direccionCentro = direccionCentro;
		this.idCentro = idCentro;
	}

	// Métodos getters y setters
	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

	public String getDireccionCentro() {
		return direccionCentro;
	}

	public void setDireccionCentro(String direccionCentro) {
		this.direccionCentro = direccionCentro;
	}

	public int getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(int idCentro) {
		this.idCentro = idCentro;
	}
}
