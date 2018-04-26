package view;


import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
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
	public void drawPolygone(ShapePolygone poly, Pane pane) {
		Polygon fxPoly = new Polygon();
		fxPoly.getPoints().addAll(new Double[]{
			    0.0, 0.0,
			    20.0, 10.0,
			    10.0, 20.0 });
		pane.getChildren().add(fxPoly);
		
	}

}
