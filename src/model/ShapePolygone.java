package model;

import java.awt.Color;

public class ShapePolygone implements Shape{
	
	private double[] coord;
	
	public ShapePolygone( double xpos, double ypos, int nbSides, double sideLenght, double rotation, double xCenter, double yCenter,
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
		setCoord(nbSides);
	}

	private double xpos;
	private double ypos;
	private int nbSides;
	private double sideLenght;
	private double rotation;
	private double xCenter;
	private double yCenter;
	private Color color;
	
	public void setCoord(int nbSides) {
		coord[0] = xpos;
		coord[1] = ypos;
		int indice = 2;
		int cpt = nbSides-1;
		while(cpt!=0) {
			coord[indice] = getXCenter() + calculateRay()*Math.cos(angleFromCenter());
			coord[indice+1] = getYCenter() + calculateRay()*Math.sin(angleFromCenter());
			indice = indice+2;
			cpt--;
		}
	}
	
	public double angleFromCenter() {
		return 360/nbSides;
	}
	
	public double calculateRay() {
		return Math.sqrt((1-Math.cos(angleFromCenter())-sideLenght*sideLenght)/2);
	}
	
	public void setXCenter() {
		xCenter = getXpos()-calculateRay()*Math.cos(angleFromCenter());
	}
	
	public void setYCenter() {
		yCenter = getYpos()-calculateRay()*Math.sin(angleFromCenter());
	}
	
	public double getXpos() {
		return xpos;
	}
	public void setXpos(double xpos) {
		this.xpos = xpos;
	}
	public double getYpos() {
		return ypos;
	}
	public void setYpos(double ypos) {
		this.ypos = ypos;
	}
	public double getRotation() {
		return rotation;
	}
	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	public double getXCenter() {
		return xCenter;
	}
	public double getYCenter() {
		return yCenter;
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
	public double getSideLenght() {
		return sideLenght;
	}
	public void setSideLenght(double sideLenght) {
		this.sideLenght = sideLenght;
	}

}
