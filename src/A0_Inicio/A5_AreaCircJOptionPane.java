package A0_Inicio;
import javax.swing.JOptionPane;

public class A5_AreaCircJOptionPane {
	public static void main(String[]args){
	
		String radio = JOptionPane.showInputDialog("el radio del c�rculo?");
		double medida = Double.parseDouble(radio);
		
		double area = Math.PI*(Math.pow(medida, 2));
		
		System.out.println("el �rea del circulo es: " + area);
		
	}
}
