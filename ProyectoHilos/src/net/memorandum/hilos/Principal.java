package net.memorandum.hilos;

public class Principal {

	public static void main(String[] args) {
		PrimerHilo h1 = new PrimerHilo();
		SegundoHilo h2 = new SegundoHilo();
		
		h1.start();
		h2.start();

	}

}
