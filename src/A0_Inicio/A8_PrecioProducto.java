package A0_Inicio;
import java.util.Scanner;

class externa{
	
	protected class interna{
		double iva = 0.21;	
	}
}
	
public class A8_PrecioProducto {
	public static void main(String[]args) {

		Scanner lector = new Scanner(System.in);
		
		System.out.println("Cuál es el precio del producto?...:");
		double precio = lector.nextDouble();
		
		externa myExt = new externa();
		externa.interna myInt = myExt. new interna();
		
		double valorIva = myInt.iva * precio;
		
		double valorTotal= precio + valorIva;
		
		System.out.println("El precio con IVA es: " + valorTotal);
	
	}
}
