package model;

import java.awt.Color;

public class ShapePolygone implements Shape {
	
	private double[] coord = new double[255];
	private double xpos;
	private double ypos;
	private int nbSides;
	private double sideLenght;
	private double rotation;
	private double xCenter;
	private double yCenter;
	private Color color;
	
	public ShapePolygone( double xpos, double ypos, int nbSides, double sideLenght, double rotation,
			Color color) {
		super();
		
		this.xpos = xpos;
		this.ypos = ypos;
		this.nbSides = nbSides;
		this.sideLenght = sideLenght;
		this.rotation = rotation;
		this.color = color;
		this.setXCenter();
		this.setYCenter();
		this.setCoord(nbSides);
	}
	
	public void setCoord(int nbSides) {
		coord[0] = this.getXpos();
		coord[1] = this.getYpos();
		double alpha = this.angleFromCenter();
		int indice = 2;
		int cpt = nbSides-1;
		while(cpt>0) {
			coord[indice] = this.getXCenter()+
					Math.cos(alpha)*(coord[indice-2]-this.getXCenter())
					+Math.sin(alpha)*(coord[indice-1]-this.getYCenter());
			coord[indice+1] = this.getYCenter()-
					Math.sin(alpha)*(coord[indice-2]-this.getXCenter())
					+Math.cos(alpha)*(coord[indice-1]-this.getYCenter());
			indice = indice+2;
			cpt--;
		}
	}
	
	public double angleFromCenter() {
		if(nbSides <= 0)
			nbSides = 1;
		double angleDeg = 360/nbSides;
		double radian = angleDeg*Math.PI/180;
		return radian;
	}
	
	public double angleFromCenterDegree() {
		if(nbSides <= 0)
			nbSides = 1;
		double angleDeg = 360/nbSides;
		return angleDeg;
	}
	
	public double calculateRay() {
		return Math.sqrt((1-Math.cos(this.angleFromCenterDegree())-sideLenght*sideLenght)/2);
	}
	
	public void setXCenter() {
		xCenter = this.getXpos()-this.calculateRay()*Math.cos(this.angleFromCenterDegree());
	}
	
	public void setYCenter() {
		yCenter = this.getYpos()-this.calculateRay()*Math.sin(this.angleFromCenterDegree());
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
	
	public double[] getCoord() {
		return coord;
	}

}
