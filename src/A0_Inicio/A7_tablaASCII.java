package A0_Inicio;
import javax.swing.JOptionPane;

public class A7_tablaASCII {
	public static void main(String[]args){
		
		String codigo = JOptionPane.showInputDialog("dime un código de la tabla ASCII");

		int cod = Integer.parseInt(codigo);
		
		char mycod = (char)cod;
		
		System.out.println(cod);
		
	}

}
