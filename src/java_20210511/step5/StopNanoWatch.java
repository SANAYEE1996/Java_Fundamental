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
	public void execute(StopNanoWatch s) {
		s.start();
		for(long i = 0; i < 30_000_000_000L;i++) {
			
		}
		s.end();
		System.out.println("경과 시간 : "+s.getTime());
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
}
