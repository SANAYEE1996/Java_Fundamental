package java_20210511.step4;

import java_20210511.step3.StopMilliWatch;
import java_20210511.step3.StopNanoWatch;

public class StopWatchDemo {
	public static void runn(StopNanoWatch s) {
		s.start();
		for(long i = 0; i < 30_000_000_000L;i++) {
			
		}
		s.end();
		System.out.println("경과 시간 : "+s.getTime());
	}
	public static void runm(StopMilliWatch s) {
		s.start();
		for(long i = 0; i < 30_000_000_000L;i++) {
			
		}
		s.end();
		System.out.println("나노 경과 시간 : "+s.getTime());
	}
	public static void main(String[] args) {
		StopNanoWatch s = new StopNanoWatch();
		runn(s);
		StopMilliWatch sm = new StopMilliWatch();
		runm(sm);
	}
}
