package A0_Inicio;

//16) Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera.
//Despu�s se te pedir� que introduzcas la contrase�a, con 3 intentos.
//Cuando aciertes ya no pedir� mas la contrase�a y mostrara un mensaje diciendo �Enhorabuena�. 
//Piensa bien en la condici�n de salida (3 intentos y si acierta sale, aunque le queden intentos).

import java.util.Scanner;

public class B4_Contrase�a {
	public static void main(String[]args) {
		
		Scanner obj = new Scanner(System.in);
		 
		String clave = "xxx";
		
		for(int i=1; i<=3; i++) {
			System.out.println("Introduce contrase�a: ");
			String pass = obj.next();
			
			if(clave.equals(pass) == false) {
				System.out.println("Contrase�a incorrecta");
				
			}else {
				System.out.println("contrase�a correcta");
				break;
			}
		}
		
		
			
		
	}
}
			
			
	



