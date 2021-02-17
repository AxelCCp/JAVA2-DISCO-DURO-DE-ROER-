package A0_Inicio;

//38) Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
//Al terminar, mostrará lo siguiente:

//mayor numero introducido
//– menor numero introducido
//– suma de todos los numeros
//– suma de los numeros positivos
//– suma de los numeros negativos
//– media de la suma (la primera que pido)

//El número -1 no contara como número.

import java.util.Scanner;
	
public class D7_PideNumeros {
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		int numeroUsuario = 0;
		int numeroMayor = 0;
		int numeroMenor = 0;
		int sumaPositivos = 0;
		int sumaNegativos = 0;
		int suma= 0;
		double promedio = 0;
		int contador = -1;
		
	do {
		
		
		
		if(numeroMayor<numeroUsuario) {
			numeroMayor=numeroUsuario;
		}
		
		if(numeroMenor>numeroUsuario) {
			numeroMenor=numeroUsuario;
		}
		
		if(numeroUsuario<0) {
			sumaNegativos+=numeroUsuario;
		}
		
		if(numeroUsuario>0) {
			sumaPositivos+=numeroUsuario;
		}
		
		suma+=numeroUsuario;
		contador++;
		
		System.out.println("introduce un número: ");
		numeroUsuario=objSc.nextInt();
		
		
	}while(numeroUsuario != -1);
	
	promedio = suma /contador;
	
	System.out.println("N° mayor " + numeroMayor);
	System.out.println("N° menor " + numeroMenor);
	System.out.println("Suma de negativos " + sumaNegativos);
	System.out.println("Suma de positivos " + sumaPositivos);
	System.out.println("Promedio " + promedio);
				
	}
}
