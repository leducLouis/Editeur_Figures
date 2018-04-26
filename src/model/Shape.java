package model;

import java.awt.Color;

public interface Shape extends ShapeComposant {
	
	public double getRotation();
	public void setRotation(double rotation);
	public double getXCenter();
	public void setXCenter();
	public double getYCenter();
	public void setYCenter();
	public Color getColor();
	public void setColor(Color couleur);
	//iterator<Entity> getChildren();
	
}
