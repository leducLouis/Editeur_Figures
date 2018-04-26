package view;
import java.awt.Color;

import javafx.application.Application;
import javafx.stage.Stage;
import model.Polygone;
import model.Rectangle;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class CanevasJavaFx implements Canevas{
	public CanevasJavaFx(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void drawRectangle(Rectangle rect) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawPolygone(Polygone poly) {
		// TODO Auto-generated method stub
		
	}

	

}
