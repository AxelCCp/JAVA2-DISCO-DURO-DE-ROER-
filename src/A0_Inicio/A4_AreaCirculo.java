package A0_Inicio;
import java.util.Scanner;

public class A4_AreaCirculo {
	public static void main(String[]args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Dime el radio del círculo: ");
		double radio = myObj.nextDouble();
		
		double area = Math.PI*(Math.pow(radio, 2));
		
		System.out.println("el área del circulo es: " + area);
		
	}
}
