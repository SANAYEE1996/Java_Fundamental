package java_20210511.step5;

public class StopNanoWatch extends StopWatch{

	
	public void start() {
		start = System.nanoTime();
	}
	public void end() {
		end = System.nanoTime();
	}
	public double getTime() {
		return (double)(end-start)/1000000000;
	}
	public void execute() {
		start();
		for(long i = 0; i < 30_000_000_000L;i++) {
			
		}
		end();
		System.out.println("경과 시간 : "+getTime());
	}
}
