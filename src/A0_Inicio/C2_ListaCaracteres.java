package A0_Inicio;

//Del siguiente String �La lluvia en Sevilla es una maravilla� 
//24) Recorre el String del ejercicio 22 y transforma cada 
//car�cter a su c�digo ASCII. Muestralos en linea recta, 
//separados por un espacio entre cada car�cter.

public class C2_ListaCaracteres {
	public static void main(String[]args) {
		
		String cadena = "La lluvia en Sevilla es una maravilla";
		
		for(int i=0; i<cadena.length(); i++){
			
			System.out.print((int)cadena.charAt(i)+ "  ");
			
		}
	}
}
