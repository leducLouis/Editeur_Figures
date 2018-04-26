package view;

import com.sun.javafx.geom.Rectangle;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import model.ShapePolygone;
import model.ShapeRectangle;


public interface ShapeDrawer {

	void drawPolygone(ShapePolygone poly);
	void drawRectangle(ShapeRectangle rect, Pane pane);
}
