package A1_MetodosYFunciones;

//5) Crea una aplicación que nos convierta un número en base decimal a binario. Esto lo realizara un
//método al que le pasaremos el numero como parámetro, devolverá un String con el numero convertido a binario. 
//Para convertir un numero decimal a binario, debemos dividir entre 2 el numero y el resultado de esa división
//se divide entre 2 de nuevo hasta que no se pueda dividir mas, el resto que obtengamos de cada división 
//formara el numero binario, de abajo a arriba.

//Veamos un ejemplo: si introducimos un 8 nos deberá devolver 1000.

import javax.swing.JOptionPane;

public class A4_ConvierteABinario {
	public static void main(String[]args) {
		
		String texto = JOptionPane.showInputDialog("Ingresa un número para convertirlo en binario: ");
		int numero = (int)Integer.parseInt(texto);
		
		String binario = decimalBinario(numero);
		System.out.println(numero + " = " + binario);	
	}
	
	public static String decimalBinario(int numero) {
		
		String binario = "";
		String digito;
		
		for(int i=numero; i>0; i/=2) {
			
			if(i%2==1) {
				digito="1";
			}else {
				digito="0";
			}
			binario = digito + binario;
		}
		return binario;
		
	}

}
