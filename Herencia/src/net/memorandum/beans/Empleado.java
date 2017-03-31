package net.memorandum.beans;

public class Empleado extends Persona {

	private int edad;
	private String nSegSocial;

	public Empleado(String dni, String nombre, long telefono, int edad,
			String nSegSocial) {
		super(dni, nombre, telefono);
		this.edad = edad;
		this.nSegSocial = nSegSocial;

	}

	public Empleado(Persona p, int edad, String nSegSocial) {
		super(p.getDni(), p.getNombre(), p.getTelefono());
		this.edad = edad;
		this.nSegSocial = nSegSocial;

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getnSegSocial() {
		return nSegSocial;
	}

	public void setnSegSocial(String nSegSocial) {
		this.nSegSocial = nSegSocial;
	}

}
