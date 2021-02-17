package A0_Inicio;

import javax.swing.JOptionPane;

//33) Dada una cadena, extraer la cuarta y quinta letra usando el método substring.

public class D2_ExtraerLetrasdeCadena {
	
	public static void main(String[]args) {
		
		String cadena= JOptionPane.showInputDialog(null,"ingresa una frase:", JOptionPane.INFORMATION_MESSAGE);
		
		for(int i=0; i<cadena.length(); i++){
			
			//System.out.print(i);
		}
		
		//hay que extraer la letra en índice (3) y (4)

		String nuevaCadena = cadena.substring(3,5);
		
		System.out.println(nuevaCadena);
			
	}
}
