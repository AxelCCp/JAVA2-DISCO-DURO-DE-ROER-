package A0_Inicio;
import java.util.Scanner;
//13) Realiza una aplicación que nos pida un número de ventas a introducir, 
//después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
//Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
//https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-basicos-java/
public class B2_NumVentas {
	public static void main(String[]args) {
		
		Scanner ObjScan = new Scanner(System.in);
		
		System.out.println("Cuál es el número de ventas?");
		int nVentas = ObjScan.nextInt();
		
		int sumaVentas = 0;
		
		for(int a=1; a<=nVentas; a++) {
			
			System.out.println("monto de venta " + a + " :");
			int montoVta = ObjScan.nextInt();
			
			sumaVentas=sumaVentas+montoVta;
			
			//System.out.println(sumaVentas);
		}
		System.out.println("La suma de todas las ventas es: " + sumaVentas);
	}
	
	

}
