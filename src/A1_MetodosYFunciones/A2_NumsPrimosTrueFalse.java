package A1_MetodosYFunciones;

//3) Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos por 
//parámetro para que nos indique si es o no un número primo, debe devolver true si es primo sino false.
//Un número primo es aquel solo puede dividirse entre 1 y si mismo. 
//Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible 
//desde ese numero hasta 1.

import javax.swing.JOptionPane;

public class A2_NumsPrimosTrueFalse {
	
	public static void main(String[]args) {		

		String texto = JOptionPane.showInputDialog("ingresa un número: ");
		int numero = (int)Integer.parseInt(texto);
		
		if(esPrimo(numero)) {
			System.out.println("el número" + numero + "es primo");

		}else {
			System.out.println("el número no es primo");
		}
	}
	
	
	public static boolean esPrimo(int numero) {
		
		if(numero<=1) {
			return false;
		}
		
			int cont=0;
		for(int divisor=(int)Math.sqrt(numero); divisor>1; divisor--) {
			
			if(numero%divisor==0) {
				cont+=1;
			}
		}
		
		if(cont>=1) {
			return false;
		}else{
			return true;
		}
	}
	
}
