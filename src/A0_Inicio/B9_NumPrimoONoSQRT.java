package A0_Inicio;
//20) Pide un número por teclado e indica si es un número primo o no. 
//Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, 
//ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible 
//desde ese numero hasta 1.
//NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.

import java.util.Scanner;

public class B9_NumPrimoONoSQRT {
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		System.out.println("Ingresa un número: ");
		int numero = objSc.nextInt();
		
		int raiz = (int) Math.sqrt(numero);
		int contador = 0; 
		
		
		for(int i=raiz; i>1; i--) {
			
			if(raiz%i==0) {
				contador++;
			}
		}
		
		System.out.println(">>" + contador);
		
		if (contador < 1) {
			System.out.println("El numero " + numero + " es primo");
		}else {
			System.out.println("El numero " + numero + " no es primo");
			
			
		}
		
	}

}
