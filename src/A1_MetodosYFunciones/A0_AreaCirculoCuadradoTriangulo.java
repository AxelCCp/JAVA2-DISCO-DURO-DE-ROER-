package A1_MetodosYFunciones;

//1) Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo.
//Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores 
//necesarios para calcular el área. Crea un método por cada figura para calcular cada área, 
//este devolverá un número real. Muestra el resultado por pantalla

//Circulo: (radio^2)*PI
//Triangulo: (base * altura) / 2
//Cuadrado: lado * lado

import java.util.Scanner;
import java.util.Random;

public class A0_AreaCirculoCuadradoTriangulo {
	public static void main(String[]args) {
		
		Scanner objSc = new Scanner(System.in);
		
		System.out.println("Hola!... ¿Qué quieres hacer?");
			
		System.out.println("\nPor ahora solo puedo calcular las áreas de un "
								+ "triángulo, circulo y cuadrado."
								+ "\nAh!!! y también puedo generar numeros aleatorios");
			
		System.out.println("\nDime qué calculo: "
					+ "\n Apreta 1, para triángulo."
					+ "\n Apreta 2, para círculo."
					+ "\n Apreta 3, para cuadrado."
					+ "\n\n Apreta 10 y pasa a los números aleatorios");
		
		int resp1 = objSc.nextInt();
		
		if(resp1 == 1) {
			System.out.println("OK!... la fórmula es: (base*altura)/2 "
								+ "...necesito entonces los siguientes datos...");
			
			System.out.println("\nBase del triangulo: ");
			int baseTri = objSc.nextInt();
			
			System.out.println("Altura del triángulo: ");
			int altTri = objSc.nextInt();
			
			double areaTri = (baseTri*altTri)/2;
			
			System.out.println("Ok!... el área del triangulo es: " + areaTri);
			
		}else if(resp1 == 2){
			
			System.out.println("Ok!... la fórmula del área de un círculo es PI*Radio^2.");
			System.out.println("\nNecesito el radio del círculo");
			int radio = objSc.nextInt();
			
			double areaCirc = radio*(Math.pow(radio, 2));	
			
			System.out.println("El área del circulo es :" + areaCirc);
		
		}else if(resp1 ==3) {
			System.out.println("Fácil!,... la fórmula es base*altura");
			
			System.out.println("\ndame la base!: ");
			int baseCua = objSc.nextInt();
			
			System.out.println("Y la altura???");
			int alturaCua = objSc.nextInt();
			
			double areaCua = baseCua*alturaCua; 
			
			System.out.println("El área del cuadrado es: " + areaCua);
	
		
		}else if(resp1 == 10){
			
			System.out.println("Ok!... números aleatorios... "
								+ "necesitaré los parámetros y "
								+ "cantidad de números...");
			
			System.out.println("Parámetro menor ?");
			int para1 = objSc.nextInt();
			System.out.println("Parámetro mayor?");
			int para2 = objSc.nextInt();
			
			System.out.println("Y la cantidad de números?");
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
