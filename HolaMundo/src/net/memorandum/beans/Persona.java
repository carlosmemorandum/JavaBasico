package net.memorandum.beans;

public class Persona {    
	//ATRIBUTOS
	   
	private String nombre;
	private String sexo;
	private int altura;
	private float peso;
	
	private Coche miCoche;
	
	//CONSTRUCTOR
	public Persona(String nombrePersona, String sexoPersona, int alturaPersona, float pesoPersona){
	    this.nombre = nombrePersona;
	    this.sexo = sexoPersona;
	    this.altura = alturaPersona;
	    this.peso = pesoPersona;
	}        
	
	public Persona(String nombrePersona, String sexoPersona, int alturaPersona, float pesoPersona, Coche miCoche){
		this.nombre = nombrePersona;
		this.sexo = sexoPersona;
		this.altura = alturaPersona;
		this.peso = pesoPersona;  
		this.miCoche = miCoche;
		this.miCoche.montarTresPuestas();
	}        
	public Persona(String nombre) {        
	    this.nombre = nombre;
	}
	
	//METODOS GETTER Y SETTER
	public String getNombre(){
	    return nombre;
	}
	
	public void setNombre(String nombre){
	    this.nombre=nombre;
	}    
	
	public String getSexo() {
	    return sexo;
	}    
	
	public void setSexo(String sexo) {
	    this.sexo = sexo;
	}    
	
	public int getAltura() {
	    return altura;
	}    
	
	public void setAltura(int altura) {
	    this.altura = altura;
	}    
	
	public float getPeso() {
	    return peso;
	}    
	
	public void setPeso(float peso) {
	    this.peso = peso;
	}
	public Coche getMiCoche() {
		return miCoche;
	}
	public void setMiCoche(Coche miCoche) {
		this.miCoche = miCoche;
	}
	
	
}