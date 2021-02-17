package A0_Inicio;

import javax.swing.JOptionPane;

public class D1_PalabrasIguales {
	
	public static void main(String[]args) {
	
	String palabra1 = JOptionPane.showInputDialog(null,"ingresa una palabra", JOptionPane.INFORMATION_MESSAGE);
	String palabra2 = JOptionPane.showInputDialog(null,"ingresa una palabra", JOptionPane.INFORMATION_MESSAGE);

		if(palabra1.equals(palabra2)) {
			
			JOptionPane.showInputDialog(null,"las palabras son iguales", JOptionPane.INFORMATION_MESSAGE);
		}else {
			
			JOptionPane.showInputDialog(null,"las palabras son diferentes", JOptionPane.INFORMATION_MESSAGE);	
		}
	}
}
