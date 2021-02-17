package A0_Inicio;
//15) Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
//si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

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
			System.out.println("El número es mayor o igual a cero");	
			System.out.println("El nummero digitado fue: " + x );
	}
}

