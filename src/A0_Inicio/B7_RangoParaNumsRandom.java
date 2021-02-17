package A0_Inicio;

//18) Pide por teclado dos número y genera 10 números aleatorios entre esos números. 
//Usa el método Math.random para generar un número entero aleatorio 
//(recuerda el casting de double a int).

import java.util.Scanner;

public class B7_RangoParaNumsRandom {
	
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		System.out.println("Ingresa 2 números, de tal forma que se puedan escoger 10 números "
							+ "\naleatorios entre estos 2 números.");

		System.out.println("ingresa el primer número: ");
		int num1 = objSc.nextInt();
		
		System.out.println("ingresa el segundo número: ");
		int num2 = objSc.nextInt();
		
		for(int i=0; i<10;i++) {
			
			int randomNum = (int)Math.floor(Math.random()* (num1-num2)+num2);
			System.out.println(randomNum);
		}
	}
}
