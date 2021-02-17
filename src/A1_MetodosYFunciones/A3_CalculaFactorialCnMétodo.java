package A1_MetodosYFunciones;

import javax.swing.JOptionPane;

//4) Crea una aplicación que nos calcule el factorial de un número pedido por teclado, 
//lo realizara mediante un método al que le pasamos el número como parámetro. 
//Para calcular el factorial, se multiplica los números anteriores hasta llegar a uno. 
//Por ejemplo, si introducimos un 5, realizara esta operación 5*4*3*2*1=120.


public class A3_CalculaFactorialCnMétodo {
	
	public static void main(String[]args) {
		
		String texto = JOptionPane.showInputDialog("Ingresa un numero para calcular el factorial: ");
		int numero = (int)Integer.parseInt(texto); 
		
		System.out.println(calFactorial(numero));
	}
	
	
	
	public static int calFactorial(int numero) {
		
		int factorial = numero; 
		
		for(int cont= (numero-1); cont>0; cont--) {
			factorial=factorial*cont;	
		}
		return factorial;
	}
}
