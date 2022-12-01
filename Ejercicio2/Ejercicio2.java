package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		 
		        Scanner datos = new Scanner(System.in);
		        int opcion;
		       

		        while (true) {
		        	 System.out.println("Elija una opcion");
		            System.out.println("1- Seguir en bucle"+" "+"2- Salir del bucle");
		           
		            opcion = datos.nextInt();
		           
		           
		            if(opcion!=1) {
		             	System.out.println("Game over");
		           
		           
		                break;
		            }
		        }


		    }
		
	}


