package A0_Inicio;
//15) Lee un n�mero por teclado y comprueba que este numero es mayor o igual que cero,
//si no lo es lo volver� a pedir (do while), despu�s muestra ese n�mero por consola.

import java.util.Scanner;

public class B3_DoWhile {
	public static void main(String[]args) {
		
		int x;
		Scanner myObj = new Scanner(System.in);
		
		do {
			System.out.println("Dame un numero: ");
			x = myObj.nextInt();
			
			
		}
		while(x<0);
			System.out.println("El n�mero es mayor o igual a cero");	
			System.out.println("El nummero digitado fue: " + x );
	}
}

