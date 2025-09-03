package presentacion;

import logica.Hombre;
import logica.Mujer;
import logica.Persona;

public class principal {
	public static String validar(double respuesta) {
		if(respuesta==0) {
			return "No cumple con las condiciones requeridas";
		}
		return "si cumple y su tasa metabolica es de " ;
		
	}

	public static void main(String[] args) {
		Persona p;
		double s;
		//casos validos
		System.out.println("Casos validos:");
		p=new Hombre(70, 195, 18);
		s=p.calcularTMB();
		System.out.println(validar(s)+p.calcularTMB());
		
		p=new Mujer(60, 160, 16);
		s=p.calcularTMB();
		System.out.println(validar(s)+p.calcularTMB());
		
		//casos con excepciones
		System.out.println("Casos con excepciones :");
		p=new Hombre(80, 196, 18);
		s=p.calcularTMB();
		System.out.println(validar(s));
		
		p=new Mujer(30, 160, 18);
		s=p.calcularTMB();
		System.out.println(validar(s));
		
		p=new Mujer(30, 160, 180);
		s=p.calcularTMB();
		System.out.println(validar(s));
	}

}
