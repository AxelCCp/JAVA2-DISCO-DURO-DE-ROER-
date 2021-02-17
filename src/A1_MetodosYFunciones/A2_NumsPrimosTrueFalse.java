package A1_MetodosYFunciones;

//3) Crea una aplicaci�n que nos pida un n�mero por teclado y con un m�todo se lo pasamos por 
//par�metro para que nos indique si es o no un n�mero primo, debe devolver true si es primo sino false.
//Un n�mero primo es aquel solo puede dividirse entre 1 y si mismo. 
//Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//Un buen truco para calcular la ra�z cuadrada del numero e ir comprobando que si es divisible 
//desde ese numero hasta 1.

import javax.swing.JOptionPane;

public class A2_NumsPrimosTrueFalse {
	
	public static void main(String[]args) {		

		String texto = JOptionPane.showInputDialog("ingresa un n�mero: ");
		int numero = (int)Integer.parseInt(texto);
		
		if(esPrimo(numero)) {
			System.out.println("el n�mero" + numero + "es primo");

		}else {
			System.out.println("el n�mero no es primo");
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
