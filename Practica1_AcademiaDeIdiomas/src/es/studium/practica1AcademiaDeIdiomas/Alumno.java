package es.studium.practica1AcademiaDeIdiomas;

public class Alumno {

	// Atributos
	private String nombreAlumno;
	private String direccionAlumno;
	private int numeroMatriculaAlumno;
	private double notaAsignaturaAlumno;
	private Centro centroAlumno;
	private Asignatura asignaturaAlumno;

	// Constructores
	// Constructor vacío o por defecto
	public Alumno() {
		nombreAlumno = "";
		direccionAlumno = "";
		numeroMatriculaAlumno = 0;
		notaAsignaturaAlumno = 0;
		centroAlumno = new Centro();
		asignaturaAlumno = new Asignatura();
	}

	// Constructor por parámetros
	public Alumno(String nombreAlumno, String direccionAlumno, int numeroMatriculaAlumno, double notaAsignaturaAlumno,
			Centro centroAlumno, Asignatura asignaturaAlumno) {
		this.nombreAlumno = nombreAlumno;
		this.direccionAlumno = direccionAlumno;
		this.numeroMatriculaAlumno = numeroMatriculaAlumno;
		this.notaAsignaturaAlumno = notaAsignaturaAlumno;
		this.centroAlumno = centroAlumno;
		this.asignaturaAlumno = asignaturaAlumno;
	}

	// Métodos getters y setters
	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getDireccionAlumno() {
		return direccionAlumno;
	}

	public void setDireccionAlumno(String direccionAlumno) {
		this.direccionAlumno = direccionAlumno;
	}

	public int getNumeroMatriculaAlumno() {
		return numeroMatriculaAlumno;
	}

	public void setNumeroMatriculaAlumno(int numeroMatriculaAlumno) {
		this.numeroMatriculaAlumno = numeroMatriculaAlumno;
	}

	public double getNotaAsignaturaAlumno() {
		return notaAsignaturaAlumno;
	}

	public void setNotaAsignaturaAlumno(double notaAsignaturaAlumno) {
		this.notaAsignaturaAlumno = notaAsignaturaAlumno;
	}

	public Centro getCentroAlumno() {
		return centroAlumno;
	}

	public void setCentroAlumno(Centro centroAlumno) {
		this.centroAlumno = centroAlumno;
	}

	public Asignatura getAsignaturaAlumno() {
		return asignaturaAlumno;
	}

	public void setAsignaturaAlumno(Asignatura asignaturaAlumno) {
		this.asignaturaAlumno = asignaturaAlumno;
	}
}
