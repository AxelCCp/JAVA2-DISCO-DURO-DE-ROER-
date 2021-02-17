package A0_Inicio;

//25) Crea una aplicación llamada CalculadoraPolacaInversaApp, 
//nos pedirá 2 operandos (int) y un signo aritmético (String), 
//según este último se realizara la operación correspondiente. 
//Al final mostrara el resultado en un cuadro de dialogo

import java.util.Scanner;
import javax.swing.JOptionPane;

public class C3_CalculadoraPolaca {
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		System.out.println("ingresa el 1er operando (int): ");
		int num1 = objSc.nextInt();
		
		System.out.println("ingresa el 2do operando (int): ");
		int num2 = objSc.nextInt();
		
		System.out.println("Ahora ingresa un operando, "
				           + "para hacer la peración "
				           + "correspondiente."
				           + "los signos aritméticos pueden ser +,-,*,/,%,^.");
		String operador = objSc.next();
		
		switch(operador) {
		
			case "+":
				System.out.println(num1 + num2);
				break;
			case "-":
				System.out.println(num1 - num2);
				break;
			case "*":
				System.out.println(num1 * num2);
				break;
			case "/":
				System.out.println(num1 / num2);
				break;
			case "%":
				System.out.println(num1 % num2);
				break;
			case "^":
				System.out.println((int)Math.pow(num1, num2));
				break;
			default:
				System.out.println("ingresa un operador valido");
		
		}		
	}
}
