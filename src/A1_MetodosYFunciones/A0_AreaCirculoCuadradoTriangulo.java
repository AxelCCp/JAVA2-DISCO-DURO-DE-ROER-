package A1_MetodosYFunciones;

//1) Crea una aplicaci�n que nos calcule el �rea de un circulo, cuadrado o triangulo.
//Pediremos que figura queremos calcular su �rea y seg�n lo introducido pedir� los valores 
//necesarios para calcular el �rea. Crea un m�todo por cada figura para calcular cada �rea, 
//este devolver� un n�mero real. Muestra el resultado por pantalla

//Circulo: (radio^2)*PI
//Triangulo: (base * altura) / 2
//Cuadrado: lado * lado

import java.util.Scanner;
import java.util.Random;

public class A0_AreaCirculoCuadradoTriangulo {
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		System.out.println("Hola!... �Qu� quieres hacer?");
			
		System.out.println("\nPor ahora solo puedo calcular las �reas de un "
								+ "tri�ngulo, circulo y cuadrado."
								+ "\nAh!!! y tambi�n puedo generar numeros aleatorios");
			
		System.out.println("\nDime qu� calculo: "
					+ "\n Apreta 1, para tri�ngulo."
					+ "\n Apreta 2, para c�rculo."
					+ "\n Apreta 3, para cuadrado."
					+ "\n\n Apreta 10 y pasa a los n�meros aleatorios");
		
		int resp1 = objSc.nextInt();
		
		if(resp1 == 1) {
			System.out.println("OK!... la f�rmula es: (base*altura)/2 "
								+ "...necesito entonces los siguientes datos...");
			
			System.out.println("\nBase del triangulo: ");
			int baseTri = objSc.nextInt();
			
			System.out.println("Altura del tri�ngulo: ");
			int altTri = objSc.nextInt();
			
			double areaTri = (baseTri*altTri)/2;
			
			System.out.println("Ok!... el �rea del triangulo es: " + areaTri);
			
		}else if(resp1 == 2){
			
			System.out.println("Ok!... la f�rmula del �rea de un c�rculo es PI*Radio^2.");
			System.out.println("\nNecesito el radio del c�rculo");
			int radio = objSc.nextInt();
			
			double areaCirc = radio*(Math.pow(radio, 2));	
			
			System.out.println("El �rea del circulo es :" + areaCirc);
		
		}else if(resp1 ==3) {
			System.out.println("F�cil!,... la f�rmula es base*altura");
			
			System.out.println("\ndame la base!: ");
			int baseCua = objSc.nextInt();
			
			System.out.println("Y la altura???");
			int alturaCua = objSc.nextInt();
			
			double areaCua = baseCua*alturaCua; 
			
			System.out.println("El �rea del cuadrado es: " + areaCua);
	
		
		}else if(resp1 == 10){
			
			System.out.println("Ok!... n�meros aleatorios... "
								+ "necesitar� los par�metros y "
								+ "cantidad de n�meros...");
			
			System.out.println("Par�metro menor ?");
			int para1 = objSc.nextInt();
			System.out.println("Par�metro mayor?");
			int para2 = objSc.nextInt();
			
			System.out.println("Y la cantidad de n�meros?");
			int  cantidadNum = objSc.nextInt();
			
			for(int i=0; i<=cantidadNum; i++) {
				
				int randomNum = (int)Math.floor(Math.random()*(para1-para2)+para2);
				
				System.out.println(randomNum);
			}
			
		}else {
			System.out.println("ingresa un numero valido XD");
		
		}
	}
}
