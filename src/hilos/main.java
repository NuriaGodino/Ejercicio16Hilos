package hilos;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero 1 - (Hilo 1)");
		int num1 = sc.nextInt();
		System.out.println("Introduce el numero 2- (Hilo 2)");
		int num2 = sc.nextInt();
		System.out.println("Introduce el numero 3 - (Hilo 3)");
		int num3 = sc.nextInt();
		
		Runnable n1 = new Primo(num1);
		Runnable n2 = new Primo(num2);
		Runnable n3 = new Primo(num3);
		Thread a1 = new Thread(n1);
		Thread a2 = new Thread(n2);
		Thread a3 = new Thread(n3);
		
		a1.setName("Hilo 1");
		a2.setName("Hilo 2");	
		a3.setName("Hilo 3");
		
		a1.start();
		a2.start();	
		a3.start();
		
		sc.close();

	}

}
