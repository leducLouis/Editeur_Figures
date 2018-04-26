package view;

import com.sun.javafx.geom.Rectangle;

import model.Polygone;

public interface ShapeDrawer {

	void drawRectangle(Rectangle Rect);
	void drawPolygone(Polygone poly);
}
