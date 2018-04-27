package view;
import java.awt.Color;

import javafx.application.Application;
import javafx.stage.Stage;
import model.ShapePolygone;
import model.ShapeRectangle;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;


public class CanevasJavaFx implements Canevas{

	public CanevasJavaFx(ShapeDrawer shapeDrawer, Scene scene, BorderPane rootPane) {
		Color couleur = new Color(50, 50, 200);
		
		ShapeRectangle rect = new ShapeRectangle(20.0, 20.0, 250, 100, 0.0, 0.0, 0.0, couleur , 0);
		ShapePolygone poly = new ShapePolygone(200, 30, 5, 10, 0.0, new Color(200,50,50));
		
		double canevasHeight =  (95*scene.getHeight())/100;
		double canevasWitdth = (95*scene.getWidth())/100;
		Pane canevas = new Pane();
		canevas.setPrefSize(canevasWitdth, canevasHeight);
		drawBorders(canevas, canevasHeight, canevasWitdth);
		shapeDrawer.drawRectangle(rect, canevas);
		shapeDrawer.drawPolygone(poly, canevas);
		//rootPane.getChildren().add(canevas);
		rootPane.setCenter(canevas);
	}
	
	
	private void drawBorders(Pane canevas, double height, double width){
		Line border1 = new Line(0,0,width,0);
		Line border2 = new Line (0,0, 0, height);
		Line border3 = new Line (width, 0,width, height );
		Line border4 = new Line (0, height, width, height);
		canevas.getChildren().addAll(border1, border2, border3, border4);
		
	}

}
