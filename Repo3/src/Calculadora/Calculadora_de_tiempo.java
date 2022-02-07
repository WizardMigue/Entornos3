package Calculadora;

import java.util.Scanner;

public class Calculadora_de_tiempo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double segundos;
		double minutos;
		double horas;
		
	    System.out.print("Cuantos segundos quieres: ");
	    segundos = s.nextDouble();
	    
	    minutos = (segundos / 60);
	    horas = (minutos / 60);

	    System.out.println("La equivalencia en minutos es: "+ minutos);
	    System.out.println("La equivalencia en horas son: "+ horas);

	}

}
