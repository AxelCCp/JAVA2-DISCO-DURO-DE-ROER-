package A0_Inicio;
import java.util.Scanner;

enum neuronas{
	//lugar(ordenSector,cantidad),
	A(1,50),
	B(2,60),
	C(3,70),
	D(4,50),
	F(5,60),
	G(6,70),
	H(7,50),
	I(8,60),
	J(9,70),
	K(10,80);
	private int ordenSector;
	private int cantidad;
	
	private neuronas(int ordenSector, int cantidad){
		this.ordenSector = ordenSector;
		this.cantidad = cantidad;
	}
	
	
	public int getOrden() {
		return ordenSector;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public String toString() {
		return "el lugar " + this.name() + " está en el sector " + ordenSector + " y tiene " + cantidad + " neuronas";
	}
}

public class D6_ENUMneuronasGetterArray_2 {
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		neuronas[] cantidad = neuronas.values();
		
		System.out.println("Ingresa la cantidad de neuronas(50, 60, 70 ú 80: ");
		int NEU = objSc.nextInt();
		
		for(int n=0; n<cantidad.length; n++) {
			
			if(cantidad[n].getCantidad()== NEU) {
			
				System.out.println(cantidad[n].toString());
				
			}
				
		}
		
	}

}





