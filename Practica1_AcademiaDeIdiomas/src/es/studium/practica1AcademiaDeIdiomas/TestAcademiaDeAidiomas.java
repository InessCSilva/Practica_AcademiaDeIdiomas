package es.studium.practica1AcademiaDeIdiomas;

public class TestAcademiaDeAidiomas {

	public static void main(String[] args) {

		// Creamos 2 objetos de tipo centro usando el constructor por parámetros
		Centro centro1 = new Centro("Escuela de inglés", "Reyes Católicos 14", 12345);

		Centro centro2 = new Centro("Escuela de francés", "Cristóbal Colón 92", 12346);

		// Creamos 2 objetos de tipo asignatura usando el constructor por parámetros y
		// otros 2 usando el constructor vacío o por defecto
		Asignatura asignatura1 = new Asignatura("Inglés B1", 3, 9876);

		Asignatura asignatura2 = new Asignatura("Inglés B2", 3, 8765);

		Asignatura asignatura3 = new Asignatura();
		asignatura3.setNombreAsignatura("Francés B1");
		asignatura3.setNumeroHorasImpartidas(3);
		asignatura3.setIdAsignatura(7654);

		Asignatura asignatura4 = new Asignatura();
		asignatura4.setNombreAsignatura("Francés A2");
		asignatura4.setNumeroHorasImpartidas(3);
		asignatura4.setIdAsignatura(6543);

		// Creamos 5 objetos de tipo alumno usando el constructor vacío o por defecto
		Alumno alumno1 = new Alumno();
		alumno1.setNombreAlumno("Anabel Abel");
		alumno1.setDireccionAlumno("Paseo de América 15");
		alumno1.setNumeroMatriculaAlumno(1213);
		alumno1.setNotaAsignaturaAlumno(7);
		alumno1.setCentroAlumno(centro1);
		alumno1.setAsignaturaAlumno(asignatura1);

		Alumno alumno2 = new Alumno();
		alumno2.setNombreAlumno("Benito Bueno");
		alumno2.setDireccionAlumno("Reyes Católicos 16");
		alumno2.setNumeroMatriculaAlumno(1214);
		alumno2.setNotaAsignaturaAlumno(6);
		alumno2.setCentroAlumno(centro1);
		alumno2.setAsignaturaAlumno(asignatura2);

		Alumno alumno3 = new Alumno();
		alumno3.setNombreAlumno("Carmen Cano");
		alumno3.setDireccionAlumno("Reyes Católicos 2");
		alumno3.setNumeroMatriculaAlumno(1215);
		alumno3.setNotaAsignaturaAlumno(5);
		alumno3.setCentroAlumno(centro1);
		alumno3.setAsignaturaAlumno(asignatura1);

		Alumno alumno4 = new Alumno();
		alumno4.setNombreAlumno("Esteban Escalera");
		alumno4.setDireccionAlumno("Isabel la Católica 28");
		alumno4.setNumeroMatriculaAlumno(1216);
		alumno4.setNotaAsignaturaAlumno(9);
		alumno4.setCentroAlumno(centro2);
		alumno4.setAsignaturaAlumno(asignatura3);

		Alumno alumno5 = new Alumno();
		alumno5.setNombreAlumno("Francisco Farfán");
		alumno5.setDireccionAlumno("Cristóbal Colón s/n");
		alumno5.setNumeroMatriculaAlumno(1217);
		alumno5.setNotaAsignaturaAlumno(8.5);
		alumno5.setCentroAlumno(centro2);
		alumno5.setAsignaturaAlumno(asignatura4);

		// Imprimimos por pantalla usando el objeto centro
		System.out.println("La dirección del centro 1 es " + centro1.getDireccionCentro() + " y la del centro 2 es "
				+ centro2.getDireccionCentro());

		// Imprimimos por pantalla usando el objeto centro y alumno
		System.out.println("La alumna " + alumno3.getNombreAlumno() + " está matriculada en el Centro "
				+ centro1.getNombreCentro());

		//Imprimimos por pantalla usando el método get de los objetos alumno y asignatura
		System.out.println("La nota que ha sacado " + alumno2.getNombreAlumno() + " en "
				+ asignatura2.getNombreAsignatura() + " es un " + alumno2.getNotaAsignaturaAlumno());

	}
}
