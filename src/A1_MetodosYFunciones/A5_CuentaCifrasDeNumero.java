package A1_MetodosYFunciones;

import javax.swing.JOptionPane;

//6) Crea una aplicaci�n que nos cuente el n�mero de cifras de un n�mero entero positivo 
//(hay que controlarlo) pedido por teclado. 
//Crea un m�todo que realice esta acci�n, pasando el n�mero por par�metro, devolver� el n�mero de cifras.

public class A5_CuentaCifrasDeNumero {
	public static void main(String[]args) {
		
		int numero=0;
		
		do {
			String texto = JOptionPane.showInputDialog("ingresa un numero entero positivo: ");
			numero = Integer.parseInt(texto);
			
		}while(numero<0);
		
		System.out.println(cuentaCifras(numero));
	}
	
	public static int cuentaCifras(int numero) {
	
		int contador = 0;
		for (int i=numero; i>0; i/=10) {
			contador++;
		}
		return contador;
	}
}

