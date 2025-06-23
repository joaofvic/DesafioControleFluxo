package application;

import java.util.Scanner;

import model.exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int numberOne = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o segundo n�mero: ");
		int numberTwo = sc.nextInt();
		sc.nextLine();
		
		try {
			count(numberOne, numberTwo);
		}
		catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
	
	static void count(int numberOne, int numberTwo) throws ParametrosInvalidosException {
		if (numberOne > numberTwo) {
			throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro");
		}
		int counter = numberTwo - numberOne;
		for (int i = 1; i <= counter; i++) {
			System.out.println("Imprimindo o n�mero " + i);
		}
	}
}
