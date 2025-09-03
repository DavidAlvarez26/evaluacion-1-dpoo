package logica;

public class Hombre extends Persona{

	public Hombre(int peso, int altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularTMB() {
		if((60<=this.peso&&this.peso<=110)&&(160<=this.altura&&this.altura<=195)&&edad>15) {
			return 88.362 + (13.397 * this.peso) + (4.799 * this.altura) - (5.677 * this.edad);
		}
		else
		return 0;
	}

}
