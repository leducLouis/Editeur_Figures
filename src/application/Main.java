package application;


	
import javafx.application.Application;
import javafx.stage.Stage;
import view.CanevasJavaFx;
import view.ShapeDrawer;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	ShapeDrawer shapeDrawer;
	@Override

	public void start(Stage primaryStage) {
		/*try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		CanevasJavaFx canevas = new CanevasJavaFx(shapeDrawer);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
