package view;

import com.sun.javafx.geom.Rectangle;

import javafx.scene.Scene;
import model.ShapePolygone;
import model.ShapeRectangle;


public interface ShapeDrawer {

	void drawRectangle(ShapeRectangle Rect, Scene primaryScene);
	void drawPolygone(ShapePolygone poly);
}
