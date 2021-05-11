package java_20210511.step5;

public class StopMilliWatch extends StopWatch{
	
	
	public void start() {
		start = System.currentTimeMillis();
	}
	public void end() {
		end = System.currentTimeMillis();
	}
	public double getTime() {
		return (double)(end-start)/1000;
	}
	
	public void execute() {
		start();
		for(long i = 0; i < 30_000_000_000L;i++) {
			
		}
		end();
		System.out.println("경과 시간 : "+getTime());
	}
}
