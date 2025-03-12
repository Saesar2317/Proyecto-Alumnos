package Alumnos;

public class Persona 
{
	
	private String Nombre;
	private char Genero;
	
	public Persona() 
	{}
	public Persona(String nombre, char genero) {
		super();
		Nombre = nombre;
		Genero = genero;
	
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public char getGenero() {
		return Genero;
	}
	public void setGenero(char genero) {
		Genero = genero;
	}
	

}
