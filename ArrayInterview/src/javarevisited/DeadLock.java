package javarevisited;

interface Super1{
	String resource1="Mehar";
	String resource2="Singh";
	
}

class Thread1 extends Thread implements Super1{

	@Override
	public void run() {
		synchronized(resource1){
			System.out.println(resource1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(resource2){
				System.out.println(resource2);
			}
		}
		
	}
	public static void main(String[] args)  {
		System.out.println("dsa"); 
	}
	
}

class Thread2 extends Thread implements Super1{

	@Override
	public void run() {
		synchronized(resource2){
			System.out.println(resource2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(resource1){
				System.out.println(resource1);
			}
		}
		
	}
	
}



public class DeadLock  {

	
	public static void main(String[] args) throws InterruptedException {

		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		thread1.start();
		
		thread2.start();
	}

}
