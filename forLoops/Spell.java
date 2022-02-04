package forLoops;

import java.util.Iterator;
import java.util.Scanner;

public class Spell {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		String userName;
		
		System.out.print("Introduce tu nombre: ");
		userName = enter.nextLine();
		
		for(int i = 0; i < userName.length(); i++) {
			System.out.println(userName.charAt(i)); //charAt() con su indice, determina que caracter es dentro de la cadena
 		}
		

	}

}
