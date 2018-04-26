package view;


import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import model.ShapePolygone;
import model.ShapeRectangle;

public class ShapeDrawerFx implements ShapeDrawer{

	@Override
	public void drawRectangle(ShapeRectangle rect, Pane pane) {
		Rectangle fxRect = new Rectangle(rect.getXpos(), rect.getYpos(), rect.getWidth(), rect.getHeight());
		
		fxRect.setFill(Color.rgb(
			rect.getColor().getRed(),
			rect.getColor().getGreen(),
			rect.getColor().getBlue()));
		pane.getChildren().add(fxRect);
	}

	@Override
	public void drawPolygone(ShapePolygone poly) {
		// TODO Auto-generated method stub
		
	}

}
