package A0_Inicio;
import java.util.Scanner;

//17) Crea una aplicaci�n que nos pida un d�a de la semana 
//y que nos diga si es un dia laboral o no. Usa un switch para ello.

public class B5_DiaLaboral {
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		for(int i=1; i<=3; i++) {
			//i++;
		
		System.out.println("dime un d�a de la semana: ");
		String dia = objSc.next();
		
		//for(int i=; i<=3; i++) {
		
		switch(dia) {
		
		case "lunes":
			System.out.println("es un d�a laboral");	
			break;
		case "martes":
			System.out.println("es un d�a laboral");	
			break;
		case "mi�rcoles":
			System.out.println("es un d�a laboral");	
			break;
		case "jueves":
			System.out.println("es un d�a laboral");	
			break;
		case "viernes":
			System.out.println("es un d�a laboral");	
			break;
		case "sabado":
			System.out.println("es fin de semana");	
			break;
		case "domingo":
			System.out.println("es fin de semana");	
			break;
		}
		}
	}
}
