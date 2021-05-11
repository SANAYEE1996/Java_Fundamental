package java_20210511.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s = new StopWatch();
		s.start();
		s.nanostart();
		for (long i = 0; i < 30000000000L; i++) {
			
		}
		s.end();
		s.nanoend();
		System.out.println("경과 시간 : " +s.getElapsedTime());
		System.out.println("나노 경과 시간 : " +s.getElapsedNanoTime());
		
	}
}
