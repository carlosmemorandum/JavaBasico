package net.memorandum.beans;

public class Coche {
	private String color;
	private String marca;
	private String modelo;
	
	protected int puertas; 
	
	public Coche(String color, String marca, String modelo) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	protected void montarTresPuestas(){
		this.puertas = 3;
	}
	
}
