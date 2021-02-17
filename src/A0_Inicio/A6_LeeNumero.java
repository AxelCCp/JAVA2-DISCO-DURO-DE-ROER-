package A0_Inicio;
import java.util.Scanner;

public class A6_LeeNumero {
	public static void main(String[]args) {
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Dame un número: ");
		int numero = lector.nextInt();
		
		if(numero%2==0) {
			System.out.println("El número es par");
		}else{
			System.out.println("El número es impar");
		}
		
		System.out.println("Dame OTRO un número: ");
		int numero2 = lector.nextInt();
		
		if(numero2%2==0) {
			System.out.println("El número es par");
		}else{
			System.out.println("El número es impar");
		}
		
	}
}

