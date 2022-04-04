package hilos;

public class Primo implements Runnable{
	
	private int num;

	public Primo(int num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": " + esPrimo(num));
		
	}
	
	public boolean esPrimo(int num) {
		if(num == 0 || num == 1 || num == 4) { //el numero 1 no es primo porque solo tiene un divisor el mismo
			return false;
		}
		
		for(int i = 2; i < num/2; i++) {
			if(num%2 == 0) {
				return false;
			}
		}
		return true;
	}

}
