package view;
import java.awt.Color;

import javafx.application.Application;
import javafx.stage.Stage;
import model.ShapePolygone;
import model.ShapeRectangle;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;


public class CanevasJavaFx implements Canevas{

	public CanevasJavaFx(ShapeDrawer shapeDrawer, Scene scene) {
		Color couleur = new Color(50, 50, 200);
		
		ShapeRectangle rect = new ShapeRectangle(20, 20, 250, 100, 0, 0, 0, couleur , 0);
		ShapePolygone poly = new ShapePolygone(0, 0, 0, 0, 0, 0, 0, null);
		
		double canevasHeight = 400;
		double canevasWitdth = 500;
		Pane canevas = new Pane();
		canevas.setPrefSize(canevasWitdth, canevasHeight);
		drawBorders(canevas, canevasHeight, canevasWitdth);
		shapeDrawer.drawRectangle(rect, canevas);
		
		scene.setRoot(canevas);
	}
	
	
	private void drawBorders(Pane canevas, double height, double width){
		Line border1 = new Line(0,0,canevas.getWidth(),0);
		System.out.println(canevas.getWidth());
		Line border2 = new Line (0,0,canevas.getHeight(), canevas.getWidth());
		canevas.getChildren().add(border2);
		
	}

}
