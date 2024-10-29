package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Introduce un numero: ");
	     double numero = scanner.nextDouble();
	     
	     System.out.print("Introduce otro numero: ");
	     double numero2 = scanner.nextDouble();
	     
	     double resultadoFinal = numero + numero2;
	     
	     System.out.print("La suma es: " + resultadoFinal);

	 
	 scanner.close();

	}
}
