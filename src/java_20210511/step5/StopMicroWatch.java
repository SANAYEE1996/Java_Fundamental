package java_20210511.step5;

public class StopMicroWatch extends StopWatch{

	
	public void start() {
		start = System.nanoTime();
	}
	public void end() {
		end = System.nanoTime();
	}
	public double getTime() {
		return (double)(end-start)/1000000;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	public void execute(StopMicroWatch s) {
		s.start();
		for(long i = 0; i < 30_000_000_000L;i++) {
			
		}
		s.end();
		System.out.println("경과 시간 : "+s.getTime());
	}
}
