package view;


import java.awt.Color;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import model.Shape;
import model.ShapePolygone;
import model.ShapeRectangle;

public class ToolbarJavaFx implements Toolbar{

	public ToolbarJavaFx(ShapeDrawer shapeDrawer, Scene scene, BorderPane rootPane) {
		Color couleur = new Color(50, 50, 200);
		
		ShapeRectangle rect = new ShapeRectangle(5.0, 5.0, 25, 10, 0.0, couleur , 0);
		//ShapePolygone poly = new ShapePolygone(0, 0, 0, 0, 0, 0, 0, null);
		
		double canevasHeight = (5*scene.getHeight())/100;
		double canevasWitdth = (5*scene.getWidth())/100;
		Pane canevas = new Pane();
		canevas.setPrefSize(canevasWitdth, canevasHeight);
		shapeDrawer.drawRectangle(rect, canevas);
		rootPane.setLeft(canevas);
		//scene.setRoot(canevas);	
	}

	@Override
	public void resize(Shape s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Shape s) {
		// TODO Auto-generated method stub
		
	}



}
