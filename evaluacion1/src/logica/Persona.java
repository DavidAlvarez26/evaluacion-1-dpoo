package logica;

public abstract class Persona {
	protected int peso;
	protected int altura;
	protected int edad;
	public Persona(int peso, int altura, int edad) {
		this.edad=edad;
		this.altura=altura;
		this.peso=peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public abstract double calcularTMB();
	
}
