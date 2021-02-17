package A0_Inicio;

//27) Crear una aplicación que nos permite insertar números hasta que insertemos un -1. 
//Calcular el numero de números introducidos.

import java.util.Scanner;

public class C5_insertarYsumarNums {
	public static void main(String[]args) {
		
	Scanner objSc = new Scanner(System.in);
	
	int suma= 0; 
	int numero; 
	
	do {
		System.out.println("Ingresa un número para sumarlo: ");
		numero = objSc.nextInt();
		
		suma += numero;
		
		System.out.println("Suma de los numeros: " + suma);
		
	}while(numero != -1);
		
	}
}

