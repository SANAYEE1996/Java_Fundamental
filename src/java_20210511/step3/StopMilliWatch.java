package java_20210511.step3;

public class StopMilliWatch {
	long start;
	long end;
	
	public void start() {
		start = System.currentTimeMillis();
	}
	public void end() {
		end = System.currentTimeMillis();
	}
	public double getTime() {
		return (double)(end-start)/1000;
	}
	
}
