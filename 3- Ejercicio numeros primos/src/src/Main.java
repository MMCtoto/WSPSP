package src;

public class Main {

	public static void main(String[] args) {
		PrimoRunnable h1 = new PrimoRunnable(3);
		Thread t1 = new Thread(h1);
		t1.setName("Hilo 1");
		
		PrimoRunnable h2 = new PrimoRunnable(25);
		Thread t2 = new Thread(h2);
		t2.setName("Hilo 2");
		
		PrimoRunnable h3 = new PrimoRunnable(34);
		Thread t3 = new Thread(h3);
		t3.setName("Hilo 3");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.start();
		t2.start();
		t3.start();

	}

}

