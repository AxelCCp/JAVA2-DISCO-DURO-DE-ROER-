package A0_Inicio;

// 26) Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.


import java.util.Scanner;

public class C4_Suma1aUnNum {
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		System.out.println("Ingresa un numero :");
		int numero = objSc.nextInt();
		
		if (numero>1) {
			System.out.println(numero+1);
		}
	}
}
