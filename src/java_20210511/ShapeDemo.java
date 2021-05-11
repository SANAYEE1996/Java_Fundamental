package java_20210511;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.draw();
		
		s = new Triangle();
		s.draw();
		
		s = new Circle();
		s.draw();
		
		ShapeManager ma = ShapeManager.getInstance();
		ma.run();
	}

}
