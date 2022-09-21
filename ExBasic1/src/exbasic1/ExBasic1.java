package exbasic1;

import java.util.Scanner;

public class ExBasic1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduzca un número:");
		int numero= sc.nextInt();
		System.out.println(numero);
		
		sc.close();

	}

}
