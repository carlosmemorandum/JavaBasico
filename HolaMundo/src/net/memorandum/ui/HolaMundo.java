package net.memorandum.ui;

import net.memorandum.beans.Coche;
import net.memorandum.beans.Persona;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		
		Coche unCoche = new Coche("Rojo", "KIA", "Creed");
		Coche otroCoche = new Coche("Azul", "AUDI", "A3");
		
		Persona personaSaludar = new Persona("Juan", "Hombre", 172, 70.10F, unCoche);
		Persona segundaPersona = new Persona("Jose Manuel");
		
		System.out.println("Primera persona NOMBRE: " + personaSaludar.getNombre());
		System.out.println("Segunda persona NOMBRE: " + segundaPersona.getNombre());
		System.out.println("Segunda persona ALTURA: " + segundaPersona.getAltura());
		
		System.out.println("Primera persona COLOR COCHE: " + personaSaludar.getMiCoche().getColor());
		unCoche.setColor("Rosa");
		System.out.println("Primera persona COLOR COCHE (Cambiado en el objeto coche): " + personaSaludar.getMiCoche().getColor());
		
		Coche cocheDos = unCoche;
		cocheDos.setColor("Verde");
		System.out.println("Primera persona COLOR COCHE (Cambiado en el objeto igualado): " + personaSaludar.getMiCoche().getColor());
		
	}

}
