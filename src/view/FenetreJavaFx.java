package view;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FenetreJavaFx implements Fenetre {

	public FenetreJavaFx(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,1000,800);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			ShapeDrawer shapeDrawer = new ShapeDrawerFx();
			Canevas canevas = new CanevasJavaFx(shapeDrawer, scene);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Editeur de figures");
			primaryStage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void drawCanevas(Canevas canevas) {
		// TODO Auto-generated method stub
		
	}

	public void drawToolbar(Toolbar toolbar) {
		// TODO Auto-generated method stub
		
	}

}