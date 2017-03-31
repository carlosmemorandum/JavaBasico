package net.memorandum.beans;

public class Circulo extends Figura {

	private int radio;

	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public float calcularArea() {
		return (float)Math.PI*radio*radio;
	}

}
