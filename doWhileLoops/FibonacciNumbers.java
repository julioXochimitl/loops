package doWhileLoops;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		long userNum, numUno = 0, numDos = 1, aux = 0;
		
		System.out.print("Ingresa un numero: ");
		userNum = enter.nextInt();
		
		System.out.println(numUno);
		System.out.println(numDos);
		
		int count = 0;
		
		do {
			
			aux = numUno + numDos;
			System.out.println(aux);
			
			numUno = numDos;
			numDos = aux;
			
			count++;
			
		}while(userNum > count);
		

	}

}
