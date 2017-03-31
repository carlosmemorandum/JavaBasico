package net.memorandum.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;

import net.memorandum.beans.Persona;
import net.memorandum.controller.Agenda;

public class Principal {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int opcion = 0;
		
		try {
			Agenda ag = new Agenda();
			String dni, nombre;
			long telefono;
			Persona persona;
			
			do{
				imprimeMenu();
				System.out.println("Introduce tu opción: ");
				opcion = Integer.parseInt(br.readLine());
				
				switch (opcion) {
					case 1:
						System.out.println("Nombre persona: ");
						nombre = br.readLine();
						System.out.println("Dni persona: ");
						dni = br.readLine();
						System.out.println("Teléfono persona: ");
						telefono = Long.parseLong(br.readLine());
						
						persona = new Persona(dni, nombre, telefono);
						if(ag.agregar(persona)){
							System.out.println("Persona añadida a la agenda");
						}else{
							System.out.println("DNI repetido");
						}
						break;
					case 2:
						System.out.println("Dni persona para buscar: ");
						dni = br.readLine();
						persona = ag.recuperar(dni);
						if(persona != null){
							System.out.println("Datos persona: " + persona.getDni() + " - " + persona.getNombre() + " - " + persona.getTelefono());
						}else{
							System.out.println("Persona no encontrada");
						}
						break;
					case 3:
						System.out.println("Dni persona para eliminar: ");
						dni = br.readLine();
						if(ag.eliminar(dni) == true){
							System.out.println("Persona eliminada");
						}else{
							System.out.println("Persona no encontrada");
						}
						break;
					case 4:
						System.out.println("Listando agenda:");
						Enumeration<String> listadoDeClaves = ag.total();
						while(listadoDeClaves.hasMoreElements()){
							dni = (String)listadoDeClaves.nextElement();
							persona = ag.recuperar(dni);
							System.out.println("Datos persona: " + persona.getDni() + " - " + persona.getNombre() + " - " + persona.getTelefono());
//							System.out.println(persona.toString());
						}
						break;
					case 5:
						ag.guardar();
						break;
					default:
						System.out.println("Opción no contemplada");
						break;
				}
			}while(opcion!=5);
			
			System.out.println("Adios!");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("El dato no es compatible");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Problema al acceder al fichero");
			e.printStackTrace();
		}
	}

	public static void imprimeMenu(){
		System.out.println("1.- Añadir persona");
		System.out.println("2.- Buscar persona");
		System.out.println("3.- Eliminar persona");
		System.out.println("4.- Motrar todas las personas");
		System.out.println("5.- Salir");
		
		
	}
}
