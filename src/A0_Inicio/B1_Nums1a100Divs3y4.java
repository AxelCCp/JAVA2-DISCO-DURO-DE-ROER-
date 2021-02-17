package A0_Inicio;
//Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
public class B1_Nums1a100Divs3y4 {
	public static void main(String []args) {
		
		int M = 1;
		
		while(M<=100){
			if(M%2==0 || M%3==0) {
				System.out.println(M);
			}
			M++;
		}
	}
}
