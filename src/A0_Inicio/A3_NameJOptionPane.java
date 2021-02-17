package A0_Inicio;
import javax.swing.JOptionPane;

public class A3_NameJOptionPane {
	public static void main(String[]args) {
		
		String name = JOptionPane.showInputDialog("Dime tu nombre");
		System.out.println("hola " + name);
		
		String edad = JOptionPane.showInputDialog("Y tu edad?");
		int años = Integer.parseInt(edad);
		
		System.out.println("Ahá!... con que " + años + " años!");
		
		int proximo = años + 1;
		
		System.out.println("El próximo año tendrás " + proximo + " años!");
	}
}
