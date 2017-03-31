package net.memorandum.beans;

public abstract class Figura {
	
	private String color;
	
	public Figura(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	public abstract float calcularArea();

}
