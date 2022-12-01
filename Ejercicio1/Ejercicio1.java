package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
        int numero, resultado;
        
        Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese el número que desea: ");
            numero = datos.nextInt();
        

        for(int i = 1; i<= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + "*" + i + " = " + resultado);

        }
    }
}


