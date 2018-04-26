package view;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SceneJavaFx implements Fenetre {

	public SceneJavaFx(Stage primaryStage) {
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

	public void drawCanevas(Canevas canevas) {
		// TODO Auto-generated method stub
		
	}

	public void drawToolbar(Toolbar toolbar) {
		// TODO Auto-generated method stub
		
	}

}
