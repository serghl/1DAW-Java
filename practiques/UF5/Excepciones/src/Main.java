import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

// exception.printStackTrace(); --> Esto nos printa un track de sobre donde viene la excepcion

	public static void main(String[] args) throws Exception {
		int choice = 0;
		int value = 0;
		System.out.println("Qué quieres hacer??");
		System.out.println("-------------------");
		System.out.println("1 - FACTORIAL");
		System.out.println("2 - FIBONACCI");
		System.out.println("3 - SALIR");		
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		switch(choice) {
		case 1 : 
			System.out.println("FACTORIAL () : ");
			System.out.println("Introduce el valor : ");
			try {
			value = s.nextInt();			
			Factorial.factorial(value);
			} catch (InputMismatchException e) {
				System.out.println("Introduce un valor numérico");
				e.printStackTrace();
			}
			break;
		case 2 :
			System.out.println("FIBONACCI () : ");
			System.out.println("Introduce el valor tope : ");
			try {
			value = s.nextInt();			
			Fibonacci.fibonacci(value);
			} catch (InputMismatchException e) {
				System.out.println("Introduce un valor numérico");
				e.printStackTrace();
			}
			break;
		case 3 :
			System.out.println("Chao pescao");
			break;			
		}

	}

		
	

}
