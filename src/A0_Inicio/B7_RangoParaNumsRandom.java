package A0_Inicio;

//18) Pide por teclado dos n�mero y genera 10 n�meros aleatorios entre esos n�meros. 
//Usa el m�todo Math.random para generar un n�mero entero aleatorio 
//(recuerda el casting de double a int).

import java.util.Scanner;

public class B7_RangoParaNumsRandom {
	
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		System.out.println("Ingresa 2 n�meros, de tal forma que se puedan escoger 10 n�meros "
							+ "\naleatorios entre estos 2 n�meros.");

		System.out.println("ingresa el primer n�mero: ");
		int num1 = objSc.nextInt();
		
		System.out.println("ingresa el segundo n�mero: ");
		int num2 = objSc.nextInt();
		
		for(int i=0; i<10;i++) {
			
			int randomNum = (int)Math.floor(Math.random()* (num1-num2)+num2);
			System.out.println(randomNum);
		}
	}
}
