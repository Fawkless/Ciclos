package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		int i;
		
		Scanner datos = new Scanner(System.in);
		
		
		
		
		do {
			System.out.println("Ingrese un numero desde 0 a 500: ");
	        i = datos.nextInt();
			
		} while (i<= 500);
		System.out.println("Ese numero ("+ i +") no es valido" );
	}

}
