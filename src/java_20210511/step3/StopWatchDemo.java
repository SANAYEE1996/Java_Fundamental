package java_20210511.step3;

public class StopWatchDemo {

	public static void main(String[] args) {
		
		StopMilliWatch sm = new StopMilliWatch();
		StopNanoWatch sn = new StopNanoWatch();
		sm.start();
		sn.start();
		for(long i = 0; i < 30_000_000_000L;i++) {
			
		}
		sm.end();
		sn.end();
		System.out.println("경과 시간 : "+sm.getTime());
		System.out.println("나노 경과 시간 : "+sn.getTime());
		
		
		
	}

}
