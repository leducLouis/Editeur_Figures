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
		Rectangle fxRect = new Rectangle((int)rect.getXpos(), (int)rect.getYpos(), rect.getWidth(), rect.getHeight());
		
		fxRect.setFill(Color.rgb(
			rect.getColor().getRed(),
			rect.getColor().getGreen(),
			rect.getColor().getBlue()));
		pane.getChildren().add(fxRect);
	}

	@Override
	public void drawPolygone(ShapePolygone poly, Pane pane) {
		Polygon fxPoly = new Polygon();
		
		for (int i =0; i< poly.getNbSides()*2; i++) {
			fxPoly.getPoints().addAll(poly.getCoord()[i]);
			//System.out.println(poly.getCoord()[i]);
		}
		pane.getChildren().add(fxPoly);
		
	}

}
