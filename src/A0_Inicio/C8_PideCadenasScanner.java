package A0_Inicio;

//29) Pedir al usuario que nos escriba frases de forma infinita 
//hasta que insertemos una cadena vacia. Mostrar la cadena resultante

import java.util.Scanner;

public class C8_PideCadenasScanner {
	public static void main(String[]args) {
	
		Scanner objSc = new Scanner(System.in);
		
		System.out.println("ingresa una frase:");
		String frase = objSc.next();
		
		String cadena="";
		
		while(!frase.isEmpty() ) {
			
			System.out.println("Ingresa otra frase:");
			String otraFrase = objSc.next();
			
			cadena+=otraFrase;	
			System.out.println("\n" + frase + "\n" + cadena + "\n");
		}
		
		//System.out.println(frase + cadena);
		
	}
}
