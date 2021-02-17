package A0_Inicio;
import java.util.Scanner;

public class A2_ConcatStringNom {
	public static void main(String[]args) {
		
		Scanner myObj =new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String name = myObj.next();
		
		System.out.println("hola " + name);
		
		//String name = "Fantasma lenovo";
		//System.out.println("hola " + name); 
	}
}
