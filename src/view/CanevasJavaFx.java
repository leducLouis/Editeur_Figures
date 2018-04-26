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


public class CanevasJavaFx implements Canevas{

	public CanevasJavaFx(ShapeDrawer shapeDrawer, Scene scene) {
		Color couleur = new Color(50, 50, 200);
		ShapeRectangle rect = new ShapeRectangle(20, 20, 250, 100, 0, 0, 0, couleur , 0);
		ShapePolygone poly = new ShapePolygone(0, 0, 0, 0, 0, 0, 0, null);
		VBox vb= new VBox();
		Pane canevas = new Pane();
		canevas.setPrefSize(300, 400);
		shapeDrawer.drawPolygone(poly, canevas);
		scene.setRoot(canevas);
	}
	

}
