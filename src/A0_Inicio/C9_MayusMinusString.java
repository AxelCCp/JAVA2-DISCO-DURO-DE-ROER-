package A0_Inicio;

//30) Convertir una frase a mayúsculas o minúsculas, 
//que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla.

import javax.swing.JOptionPane;

public class C9_MayusMinusString {
	public static void main(String[]args) {
	
		String frase = JOptionPane.showInputDialog(null, "ingresa una frase", JOptionPane.INFORMATION_MESSAGE);
		
		String option = JOptionPane.showInputDialog(null,"Favor elegir una de las siguientes opciones: "
													+ "\nPara imprimir en mayúscula, escribir 1"
													+ "\nPara imprimir en minúscula, escribir 2",
													JOptionPane.INFORMATION_MESSAGE);
		
		int numero = Integer.parseInt(option);
		
		if(numero == 1) {
			
			JOptionPane.showInputDialog(null,frase.toUpperCase(),JOptionPane.INFORMATION_MESSAGE);
			//System.out.println(frase.toUpperCase());
		
		}else if(numero== 2){
			
			JOptionPane.showInputDialog(null,frase.toLowerCase(),JOptionPane.INFORMATION_MESSAGE);
			//System.out.println(frase.toLowerCase());
			
		}else {
			
			JOptionPane.showInputDialog(null,"Ingresa un valor correcto: (1) ó (2)",JOptionPane.INFORMATION_MESSAGE);
			//System.out.println("Ingresa un valor correcto, \n(1) ó (2)");
		}
		
		
			
		
		
		
	}
}
