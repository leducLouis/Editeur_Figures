package view;

import com.sun.javafx.geom.Rectangle;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import model.ShapePolygone;
import model.ShapeRectangle;


public interface ShapeDrawer {

	void drawRectangle(ShapeRectangle rect, Pane pane);
	void drawPolygone(ShapePolygone poly, Pane pane);
}
