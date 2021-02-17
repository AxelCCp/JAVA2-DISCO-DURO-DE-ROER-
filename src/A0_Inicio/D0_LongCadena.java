package A0_Inicio;

//31) Mostrar la longitud de una cadena.

import javax.swing.JOptionPane;

public class D0_LongCadena {
	public static void main(String[]args){
		
		String cadena = JOptionPane.showInputDialog(null,"ingresa algo:", JOptionPane.INFORMATION_MESSAGE);
		
		
		
		//JOptionPane.showInputDialog(null,cadena.length(), JOptionPane.INFORMATION_MESSAGE);
		//System.out.println(cadena.length());
		
		for(int i=0; i<cadena.length(); i++) {
			
			
			System.out.print(i + " ");	
		}
		
		
		//System.out.println("\n"+cadena);
		
	}
}
