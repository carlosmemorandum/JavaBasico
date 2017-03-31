package net.memorandum.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;

import net.memorandum.beans.Persona;

public class Agenda {
	private final String path = "D:\\agenda.obj";
	Hashtable<String, Persona> tabla;
	
	public Agenda() throws IOException, ClassNotFoundException{
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		
		try {
			fi = new FileInputStream(path);
			oi = new ObjectInputStream(fi);
			tabla = (Hashtable)oi.readObject();
			
			
			//Cerramos el stream
			oi.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			tabla = new Hashtable<String, Persona>();
		}
	}
	
	public boolean agregar(Persona p){
		
		if(!tabla.containsKey(p.getDni())){
			tabla.put(p.getDni(), p);
			return true;
		}else{
			return false;
		}
	}
	
	public boolean eliminar(Persona p){
		if(tabla.containsKey(p.getDni())){
			tabla.remove(p.getDni());
			return true;
		}else{
			return false;
		}
	}
	public boolean eliminar(String dni){
		if(tabla.containsKey(dni)){
			tabla.remove(dni);
			return true;
		}else{
			return false;
		}
	}
	public Persona recuperar(String dni){
		if(tabla.containsKey(dni)){
			return tabla.get(dni);
		}else{
			return null;
		}
	}
	public Enumeration<String> total(){
		return tabla.keys();
	}
	public void guardar() throws IOException{
		File fichero = new File(path);
		if(!fichero.exists()){
			fichero.createNewFile();
		}
		
		FileOutputStream fo = new FileOutputStream(fichero);
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(tabla);
		os.close();
	}
}
