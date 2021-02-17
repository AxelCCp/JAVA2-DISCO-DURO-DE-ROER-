//20) Pide un n�mero por teclado e indica si es un n�mero primo o no. 
//Un n�mero primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, 
//ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//Un buen truco para calcular la ra�z cuadrada del numero e ir comprobando que si es divisible 
//desde ese numero hasta 1.
//NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
package A0_Inicio;

import java.util.Scanner;

public class B8_NumPrimoONo {
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		System.out.println("Ingresa un n�mero: ");
		int num = objSc.nextInt();
		
		//num se debe poder dividir por num y por uno.
		
		if(num <=1) {
			System.out.println("El n�mero no es primo");
		}else if(num%2==0) {
			System.out.println("El n�mero no es primo");
		}else if (num%3==0){
			System.out.println("El n�mero no es primo");
		}else if (num%5==0){
			System.out.println("El n�mero no es primo");
		}else if (num%5==0){
			System.out.println("El n�mero no es primo");
		}else if (num%7==0){
			System.out.println("El n�mero no es primo");
		}else {
			System.out.println("El n�mero es primo");
		}
	}
}
