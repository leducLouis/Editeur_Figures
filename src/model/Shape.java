package model;

import java.awt.Color;

public interface Shape extends ShapeComposant {
	
	public int getRotation();
	public void setRotation(int rotation);
	public int getXCenter();
	public void setXCenter(int xcenter);
	public int getYCenter();
	public void setYCenter(int xcenter);
	public Color getColor();
	public void setColor(Color couleur);
	//iterator<Entity> getChildren();
	
}
