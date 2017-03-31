package net.memorandum.beans;

public class Rectangulo extends Figura {

	private int base, altura;

	
	public Rectangulo(String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}


	@Override
	public float calcularArea() {
		return base*altura;
	}

}
