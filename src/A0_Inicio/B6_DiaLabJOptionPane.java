package A0_Inicio;

//17) Crea una aplicaci�n que nos pida un d�a de la semana 
//y que nos diga si es un dia laboral o no. Usa un switch para ello.

import javax.swing.JOptionPane;

public class B6_DiaLabJOptionPane {
	public static void main(String[]args) {
		
	String dia = JOptionPane.showInputDialog("ingresa un d�a de la semana: ");
	
		switch(dia) {
		
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("es d�a laboral");
			break;
		case "s�bado":
		case "domingo":
			System.out.println("es fin de semana");	 
			break;
		default:
			System.out.println("Ingresa otro d�a de la semana");
		}
	}
}
