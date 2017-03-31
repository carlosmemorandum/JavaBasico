package net.memorandum.hilos;

public class SegundoHilo extends Thread {
	public void run(){
		for (int i = 100; i >= 1; i--) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
