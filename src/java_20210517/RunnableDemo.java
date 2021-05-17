package java_20210517;

public class RunnableDemo implements Runnable{
	
	//Runnable 인터페이스에서는 run만 오버라이딩 해주면 된다.
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " " + i);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Start");
		
		RunnableDemo r1 = new RunnableDemo();
		Thread t1 = new Thread(r1,"first Thread");
		t1.start();
		
		RunnableDemo r2 = new RunnableDemo();
		Thread t2 = new Thread(r2,"second Thread");
		t2.start();
		
		System.out.println("END");
	}

}
