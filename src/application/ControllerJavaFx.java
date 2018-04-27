package application;

<<<<<<< HEAD
import java.awt.Color;
import java.util.ArrayList;
import model.ShapeComposant;
import model.ShapeRectangle;

public class ControllerJavaFx implements Controller{
	
	private ArrayList<ShapeComposant> toolBarShapes;
	private ArrayList<ShapeComposant> canvasShapes;
	
=======
import view.Fenetre;

public class ControllerJavaFx implements Controller{

	private Fenetre fenetre ;
>>>>>>> 4a5eea24373fdd703ade382870bb3a9bcc40ad91
	public ControllerJavaFx() {
		toolBarShapes.add(new ShapeRectangle(5.0,5.0,25,10,0.0,new Color(10,220,30),0));
	}

	@Override
	public void createView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateView() {
		// TODO Auto-generated method stub
		
	}

}
