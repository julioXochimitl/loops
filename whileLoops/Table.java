package whileLoops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
        Scanner console = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
      //TODO implementa el bucle While para obtener el resultado de la impresión
        
        int count = 1;
        
        while( count < 11) {
        	
        	System.out.println(num * count);
        	
        	count++;
        	
        }

	}

}
