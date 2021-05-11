package java_20210511;

public class ShapeManager {
	
	private static ShapeManager single;
	private ShapeManager() {}
	public static ShapeManager getInstance() {
		if(single == null) single = new ShapeManager();
		return single;
	}
	
	public void run() {
		Rectangle r = new Rectangle();
		r.draw();
	}
	public void run1() {
		Circle t = new Circle();
		t.draw();
	}
	public void run2() {
		Triangle y = new Triangle();
		y.draw();
	}
}
