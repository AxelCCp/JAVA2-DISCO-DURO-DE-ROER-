package A0_Inicio;
import javax.swing.JOptionPane;

public class A3_NameJOptionPane {
	public static void main(String[]args) {
		
		String name = JOptionPane.showInputDialog("Dime tu nombre");
		System.out.println("hola " + name);
		
		String edad = JOptionPane.showInputDialog("Y tu edad?");
		int a�os = Integer.parseInt(edad);
		
		System.out.println("Ah�!... con que " + a�os + " a�os!");
		
		int proximo = a�os + 1;
		
		System.out.println("El pr�ximo a�o tendr�s " + proximo + " a�os!");
	}
}
