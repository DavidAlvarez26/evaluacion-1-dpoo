package logica;

public class Mujer extends Persona{

	public Mujer(int peso, int altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularTMB() {
		if((40<=this.peso&&this.peso<=80)&&(140<=this.altura&&this.altura<=180)&&edad>15) {
			return 447.593 + (9.247 * this.peso) + (3.098 * this.altura) - (4.33 * this.edad);
		}
		else
		return 0;
	}

}
