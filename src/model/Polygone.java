package model;

import java.awt.Color;

public class Polygone implements Shape{
	public Polygone( int xpos, int ypos, int nbSides, int sideLenght, int rotation, int xCenter, int yCenter,
			Color color) {
		super();
		
		this.xpos = xpos;
		this.ypos = ypos;
		this.nbSides = nbSides;
		this.sideLenght = sideLenght;
		this.rotation = rotation;
		this.xCenter = xCenter;
		this.yCenter = yCenter;
		this.color = color;
	}

	private int xpos;
	private int ypos;
	private int nbSides;
	private int sideLenght;
	private int rotation;
	private int xCenter;
	private int yCenter;
	private Color color;
	
	
	public int getXpos() {
		return xpos;
	}
	public void setXpos(int xpos) {
		this.xpos = xpos;
	}
	public int getYpos() {
		return ypos;
	}
	public void setYpos(int ypos) {
		this.ypos = ypos;
	}
	public int getRotation() {
		return rotation;
	}
	public void setRotation(int rotation) {
		this.rotation = rotation;
	}
	public int getXCenter() {
		return xCenter;
	}
	public void setXCenter(int xCenter) {
		this.xCenter = xCenter;
	}
	public int getYCenter() {
		return yCenter;
	}
	public void setYCenter(int yCenter) {
		this.yCenter = yCenter;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public void translation() {
		// TODO Auto-generated method stub
		
	}
	public int getNbSides() {
		return nbSides;
	}
	public void setNbSides(int nbSides) {
		this.nbSides = nbSides;
	}
	public int getSideLenght() {
		return sideLenght;
	}
	public void setSideLenght(int sideLenght) {
		this.sideLenght = sideLenght;
	}

}
