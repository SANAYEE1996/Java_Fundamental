package java_20210511.step3;

public class StopNanoWatch {
	long start;
	long end;
	
	public void start() {
		start = System.nanoTime();
	}
	public void end() {
		end = System.nanoTime();
	}
	public double getTime() {
		return (double)(end-start)/1000000000;
	}
}
