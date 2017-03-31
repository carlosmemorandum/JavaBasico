package net.memorandum.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import net.memorandum.beans.*;

public class GestionFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String color = "blanco";
		int opcion = 0;
		int base, altura, radio;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			imprimeMenu();
			System.out.println("Introduce tu opción");
			try {
				opcion = Integer.parseInt(br.readLine());
				switch(opcion) {
				case 1:
					System.out.println("Introduce base: ");
					base = Integer.parseInt(br.readLine());
					System.out.println("Introduce altura: ");
					altura = Integer.parseInt(br.readLine());
					pintaFigura(new Triangulo(color, base, altura));
					break;
				case 2:
					System.out.println("Introduce base: ");
					base = Integer.parseInt(br.readLine());
					System.out.println("Introduce altura: ");
					altura = Integer.parseInt(br.readLine());
					pintaFigura(new Rectangulo(color, base, altura));
					break;
				case 3: 
					System.out.println("Introduce radio: ");
					radio = Integer.parseInt(br.readLine());
					pintaFigura(new Circulo(color, radio));
					break;
				}
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} while(opcion!=4);

	}
	
	public static void imprimeMenu() {
		System.out.println("1.- Crear Triangulo");
		System.out.println("2.- Crear Rectangulo");
		System.out.println("3.- Crear circulo");
		System.out.println("4.- Salir");
	}
	
	// Polimorfismo
	
	public static void pintaFigura(Figura f) {
		System.out.println("Color: " + f.getColor());
		System.out.println("Area: " + f.calcularArea());
	}
	

}
