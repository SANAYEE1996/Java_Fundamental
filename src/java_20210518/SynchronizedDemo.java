package java_20210518;

public class SynchronizedDemo implements Runnable{
	int x;
	int y;
	@Override
	public void run() { // 메서드 전반에 synchronized 선언 하거나
		synchronized(SynchronizedDemo.class) {	//구간에 synchronized 블럭을 설계하거나 this를 한다.
			for(int i = 0; i < 100; i++) {
				x++;
				y++;
				String threadName = Thread.currentThread().getName();
				System.out.println(x + " " + y +" "+ threadName);
			}
		}
	}
	
	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		
		t2.start();
	
	
	}
	
}


//인스턴스 변수가 없으면 동기화를 할 필요가 없다.
