package A0_Inicio;

//29) Pedir al usuario que nos escriba frases de forma infinita 
//hasta que insertemos una cadena vacia. Mostrar la cadena resultante

import javax.swing.JOptionPane;

public class C7_PideCadenas{
	public static void main(String[]args) {
	
		String frase = JOptionPane.showInputDialog(null,"introduce una frase:", JOptionPane.INFORMATION_MESSAGE);
		
		String cadena=""; 
		
		
		while(!frase.isEmpty()) {
			
			cadena += frase;
			
			frase = JOptionPane.showInputDialog(null,"introduce otra frase:", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		JOptionPane.showInputDialog(null,cadena,JOptionPane.INFORMATION_MESSAGE);
		
	}
}
