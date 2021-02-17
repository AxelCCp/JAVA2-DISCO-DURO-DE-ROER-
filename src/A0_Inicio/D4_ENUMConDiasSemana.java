package A0_Inicio;

//35) Crea un enum con los d�as de la semana, pide un d�a de la semana 
//e indica si es laboral o no (en el main).

import java.util.Scanner;

enum dias{ 
	
	LUNES,
	MARTES, 
	MIERCOLES,
	JUEVES,
	VIERNES,
	SABADO, 
	DOMINGO
}

public class D4_ENUMConDiasSemana {
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		System.out.println("ingresa un d�a de la semana:");
		String dia = objSc.next();
		
		dias objDia = dias.valueOf(dia.toUpperCase()); 
		
		switch(objDia){
			
			case LUNES:
			case MARTES:
			case MIERCOLES:
			case JUEVES:
			case VIERNES:
				System.out.println("Es d�a de semana");
				break;
			
			case SABADO:
			case DOMINGO:
				System.out.println("Es fin de semana");
				break;
		}		
	}
}
