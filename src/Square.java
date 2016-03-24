import java.awt.Color;
import java.util.Random;

public class Square extends Shape {

	private int shapeWidth;


	public Square(int width){
		this.shapeWidth = width ;
	}


	@Override
	public Color getRandomColor() {
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		Color randomColor = new Color(r, g, b);

		return new Color(r, g, b);
	}

	@Override
	public int getShapeWidth(){
		return shapeWidth ;
	}

	@Override
	public int getShapeHeight(){
		return shapeWidth ;
	}


	@Override
	public int getCenterX(int mouseX) {
		// TODO Input mouse X position and return center X of square
		return mouseX - shapeWidth/2;
	}


	@Override
	public int getCenterY(int mouseY) {
		// TODO Input mouse Y position and return center Y of square
		return mouseY - shapeWidth/2;
	}


}
