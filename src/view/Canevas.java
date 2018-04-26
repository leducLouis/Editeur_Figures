package view;

import model.Polygone;
import model.Rectangle;

public interface Canevas extends Graphics{
	void drawRectangle(Rectangle rect);
	void drawPolygone(Polygone poly);
	//void drawCommand(Command commande);
	
}
