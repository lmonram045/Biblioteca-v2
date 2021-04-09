package org.iesalandalus.programacion.biblioteca.mvc.controlador;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.biblioteca.mvc.modelo.Modelo;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Alumno;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Curso;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Libro;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Prestamo;
import org.iesalandalus.programacion.biblioteca.mvc.vista.Vista;

public class Controlador {
	
	// CODIGO PARA PRUEBAS BORRAR!!!!!!!!!!
	private static Alumno alumno1;
	private static Alumno alumno2;
	private static Alumno alumno3;
	private static Alumno alumno4;
	private static Alumno alumno5;
	private static Alumno alumno6;
	private static Alumno alumno7;
	private static Alumno alumno8;
	private static Alumno alumno9;
	private static Alumno alumno10;
	private static Libro libro1;
	private static Libro libro2;
	private static Libro libro3;
	private static Libro libro4;
	private static Libro libro5;
	private static Libro libro6;
	private static Libro libro7;
	private static Libro libro8;
	private static Libro libro9;
	private static Libro libro10;
	private static Prestamo prestamo1;
	private static Prestamo prestamo2;
	private static Prestamo prestamo3;
	private static Prestamo prestamo4;
	private static Prestamo prestamo5;
	private static Prestamo prestamo6;
	private static Prestamo prestamo7;
	private static Prestamo prestamo8;
	private static Prestamo prestamo9;
	private static Prestamo prestamo10;
	private static LocalDate hoy = LocalDate.now();
	private static LocalDate mesPasado = hoy.minusWeeks(1);
	//----------------------------------------------------------
	
	
	private Vista vista;
	private Modelo modelo;
	
	public Controlador(Modelo modelo, Vista vista) {
		if (modelo == null)
			throw new NullPointerException("ERROR: El modelo no puede ser nulo.");
		
		if (vista == null)
			throw new NullPointerException("ERROR: La vista no puede ser nula.");
		
		this.modelo = modelo;
		this.vista = vista;
		this.vista.setControlador(this);
		
		// CODIGO PARA PRUEBAS BORRAR!!!!!!!!!!!!!!
		alumno1 = new Alumno("alumno uno", "correo1@gmail.com", Curso.PRIMERO);
		try {
			insertar(alumno1);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		alumno2 = new Alumno("alumno dos", "correo2@gmail.com", Curso.PRIMERO);
		try {
			insertar(alumno2);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		alumno3 = new Alumno("alumno tres", "correo3@gmail.com", Curso.PRIMERO);
		try {
			insertar(alumno3);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		alumno4 = new Alumno("alumno cuatro", "correo4@gmail.com", Curso.SEGUNDO);
		try {
			insertar(alumno4);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		alumno5 = new Alumno("alumno cinco", "correo5@gmail.com", Curso.SEGUNDO);
		try {
			insertar(alumno5);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		alumno6 = new Alumno("alumno seis", "correo6@gmail.com", Curso.SEGUNDO);
		try {
			insertar(alumno6);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		alumno7 = new Alumno("alumno siete", "correo7@gmail.com", Curso.TERCERO);
		try {
			insertar(alumno7);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		alumno8 = new Alumno("alumno ocho", "correo8@gmail.com", Curso.TERCERO);
		try {
			insertar(alumno8);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		alumno9 = new Alumno("alumno nueve", "correo9@gmail.com", Curso.CUARTO);
		try {
			insertar(alumno9);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		alumno10 = new Alumno("alumno diez", "correo10@gmail.com", Curso.CUARTO);
		try {
			insertar(alumno10);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		libro1 = new Libro("libro uno", "autor uno", 10);
		try {
			insertar(libro1);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		libro2 = new Libro("libro dos", "autor uno", 99);
		try {
			insertar(libro2);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		libro3 = new Libro("libro tres", "autor dos", 109);
		try {
			insertar(libro3);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		libro4 = new Libro("libro cuatro", "autor cuatro", 330);
		try {
			insertar(libro4);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		libro5 = new Libro("libro cinco", "autor cuatro", 170);
		try {
			insertar(libro5);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		libro6 = new Libro("libro seis", "autor seis", 100);
		try {
			insertar(libro6);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		libro7 = new Libro("libro siete", "autor uno", 98);
		try {
			insertar(libro7);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		libro8 = new Libro("libro ocho", "autor ocho", 1403);
		try {
			insertar(libro8);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		libro9 = new Libro("libro nueve", "autor uno", 215);
		try {
			insertar(libro9);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		libro10 = new Libro("libro diez", "autor tres", 127);
		try {
			insertar(libro10);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}

		prestamo1 = new Prestamo(alumno1, libro1, mesPasado);
		try {
			prestar(prestamo1);
			devolver(prestamo1, LocalDate.now() );
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		prestamo2 = new Prestamo(alumno2, libro2, hoy);
		try {
			prestar(prestamo2);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		prestamo3 = new Prestamo(alumno3, libro3, mesPasado);
		try {
			prestar(prestamo3);
			devolver(prestamo3, LocalDate.now() );
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		prestamo4 = new Prestamo(alumno4, libro4, hoy);
		try {
			prestar(prestamo4);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		prestamo5 = new Prestamo(alumno5, libro5, mesPasado);
		try {
			prestar(prestamo5);
			devolver(prestamo5, LocalDate.now() );
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		prestamo6 = new Prestamo(alumno6, libro6, hoy);
		try {
			prestar(prestamo6);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		prestamo7 = new Prestamo(alumno7, libro7, hoy);
		try {
			prestar(prestamo7);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		prestamo8 = new Prestamo(alumno8, libro8, mesPasado);
		try {
			prestar(prestamo8);
			devolver(prestamo8, LocalDate.now() );
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		prestamo9 = new Prestamo(alumno9, libro9, mesPasado);
		try {
			prestar(prestamo9);
			devolver(prestamo9, LocalDate.now() );
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		prestamo10 = new Prestamo(alumno10, libro10, mesPasado);
		try {
			prestar(prestamo10);
			devolver(prestamo10, LocalDate.now() );
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
		//-----------------------------------------------------------------------------   
	}
	
	public void comenzar() {
		vista.comenzar();
	}
	
	public void terminar() {
		System.out.println("Hasta luego Maricarmen.");
	}
	
	public void insertar(Alumno alumno) throws OperationNotSupportedException {
		modelo.insertar(alumno);
	}
	
	public void insertar(Libro libro) throws OperationNotSupportedException {
		modelo.insertar(libro);
	}
	
	public void prestar(Prestamo prestamo) throws OperationNotSupportedException {
		modelo.prestar(prestamo);
	}
	
	public void devolver(Prestamo prestamo, LocalDate fecha) throws OperationNotSupportedException {
		modelo.devolver(prestamo, fecha);
	}
	
	public Alumno buscar(Alumno alumno) {
		return modelo.buscar(alumno);
	}
	
	public Libro buscar(Libro libro) {
		return modelo.buscar(libro);
	}
	
	public Prestamo buscar(Prestamo prestamo) {
		return modelo.buscar(prestamo);
	}
	
	public void borrar(Alumno alumno) throws OperationNotSupportedException {
		modelo.borrar(alumno);
	}
	
	public void borrar(Libro libro) throws OperationNotSupportedException {
		modelo.borrar(libro);
	}
	
	public void borrar(Prestamo prestamo) throws OperationNotSupportedException {
		modelo.borrar(prestamo);
	}
	
	public List<Alumno> getAlumnos() {
		return modelo.getAlumnos();
	}
	
	public List<Libro> getLibros() {
		return modelo.getLibros();
	}
	
	public List<Prestamo> getPrestamos() {
		return modelo.getPrestamos();
	}
	
	public List<Prestamo> getPrestamos(Alumno alumno) {
		return modelo.getPrestamos(alumno);
	}
	
	public List<Prestamo> getPrestamos(Libro libro) {
		return modelo.getPrestamos(libro);
	}
	
	public List<Prestamo> getPrestamos(LocalDate fecha) {
		return modelo.getPrestamos(fecha);
	}
	
	public Map<Curso, Integer> getEstadisticaMensualPorCurso(LocalDate mes) {
		return modelo.getEstadisticaMensualPorCurso(mes);
	}

}
