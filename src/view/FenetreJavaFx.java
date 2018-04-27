package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FenetreJavaFx implements Fenetre {

	public FenetreJavaFx(Stage primaryStage) {
		try {
			BorderPane rootPane = new BorderPane();
			Scene scene = new Scene(rootPane,1000,800);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			ShapeDrawer shapeDrawer = new ShapeDrawerFx();
			drawCommand(rootPane);
			
			
			Toolbar toolbar = new ToolbarJavaFx(shapeDrawer, scene, rootPane);
			Canevas canevas = new CanevasJavaFx(shapeDrawer, scene, rootPane);
			//scene.setRoot(rootPane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Editeur de figures");
			primaryStage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void drawCommand(BorderPane borderPane) {
		//affichage de la barre de commande
		Pane commandPane = new Pane();
		Button boutonSave = new Button("Save");
		Button boutonLoad = new Button("Load");
		boutonLoad.setTranslateX(50);
		Button boutonUndo = new Button("Undo");
		boutonUndo.setTranslateX(100);
		Button boutonRedo = new Button("Redo");
		boutonRedo.setTranslateX(150);
		commandPane.getChildren().addAll(boutonSave, boutonLoad, boutonUndo, boutonRedo);
		borderPane.setTop(commandPane);
	}

	public void drawCanevas(Canevas canevas) {
		// TODO Auto-generated method stub
		
	}

	public void drawToolbar(Toolbar toolbar) {
		// TODO Auto-generated method stub
		
	}

}