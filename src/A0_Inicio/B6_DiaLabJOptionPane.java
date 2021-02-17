package A0_Inicio;

//17) Crea una aplicación que nos pida un día de la semana 
//y que nos diga si es un dia laboral o no. Usa un switch para ello.

import javax.swing.JOptionPane;

public class B6_DiaLabJOptionPane {
	public static void main(String[]args) {
		
	String dia = JOptionPane.showInputDialog("ingresa un día de la semana: ");
	
		switch(dia) {
		
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("es día laboral");
			break;
		case "sábado":
		case "domingo":
			System.out.println("es fin de semana");	 
			break;
		default:
			System.out.println("Ingresa otro día de la semana");
		}
	}
}
