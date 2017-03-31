package net.memorandum.ui;

import net.memorandum.beans.Empleado;
import net.memorandum.beans.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado e;
		e = new Empleado(new Persona("73671282", "Juan", 978822950), 31, "448282828");
		
		e.getDni();

	}

}
