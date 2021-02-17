package A0_Inicio;

// 28) Eliminar los espacios de una frase pasada por consola por el usuario.

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class C6_StringEliminaEspacios {
	public static void main(String[]args) {
	
		String texto = JOptionPane.showInputDialog(null, "inserta una frase", "Inserción",
													JOptionPane.INFORMATION_MESSAGE);
		
		String textoSin= "";
		char caracterActual;
		
		
		for(int i=0; i<texto.length(); i++) {
			
			caracterActual = texto.charAt(i);
			
			if (caracterActual != ' ') {
			
				textoSin += String.valueOf(caracterActual);
			}
		}
		
		JOptionPane.showMessageDialog(null, "La frase queda: ", textoSin, JOptionPane.INFORMATION_MESSAGE);
	
	}	
}
		
		
/*
		Scanner objSc = new Scanner(System.in);
		
		char caracter;
		String frase;
		String fraseSin;
		
		
		System.out.println("Ingresa una frase: ");
		frase = objSc.next();
		
		
		for(int i=0; i<frase.length(); i++){
			
			caracter=frase.charAt(i);
			
			if(caracter != ' '){
				
				fraseSin = String.valueOf(caracter);
				System.out.println(fraseSin);
			}
		}
		
		
	}
}
		
		**/