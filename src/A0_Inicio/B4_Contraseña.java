package A0_Inicio;

//16) Escribe una aplicación con un String que contenga una contraseña cualquiera.
//Después se te pedirá que introduzcas la contraseña, con 3 intentos.
//Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”. 
//Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

import java.util.Scanner;

public class B4_Contraseña {
	public static void main(String[]args) {
		
		Scanner obj = new Scanner(System.in);
		 
		String clave = "xxx";
		
		for(int i=1; i<=3; i++) {
			System.out.println("Introduce contraseña: ");
			String pass = obj.next();
			
			if(clave.equals(pass) == false) {
				System.out.println("Contraseña incorrecta");
				
			}else {
				System.out.println("contraseña correcta");
				break;
			}
		}
		
		
			
		
	}
}
			
			
	



