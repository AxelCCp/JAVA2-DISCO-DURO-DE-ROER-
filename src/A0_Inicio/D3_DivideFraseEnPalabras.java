package A0_Inicio;

//34) Dada una frase, separarlo en palabras.
import java.util.Scanner;

public class D3_DivideFraseEnPalabras {
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		//Hace que podamos escribir espacios en la frase y coja todo el String
		objSc.useDelimiter("\n");
		
		System.out.println("Ingresa una frase:");
		String frase = objSc.next(); 
		
		//con esto se divide la frase en palabras
		String[]palabras = frase.split(" ");
		
	
		for(int i=0; i<palabras.length; i++) {
			
			System.out.println(palabras[i]);
			
		}
	}
}
