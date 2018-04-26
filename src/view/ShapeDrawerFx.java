package view;

import com.sun.javafx.geom.Rectangle;

import javafx.scene.Scene;
import model.ShapePolygone;
import model.ShapeRectangle;

public class ShapeDrawerFx implements ShapeDrawer{

	@Override
	public void drawRectangle(ShapeRectangle rect, Scene primaryScene) {
		Rectangle fxRect = new Rectangle(rect.getXpos(), rect.getYpos(), rect.getWidth(), rect.getHeight());
		
	}

	@Override
	public void drawPolygone(ShapePolygone poly) {
		// TODO Auto-generated method stub
		
	}

}
