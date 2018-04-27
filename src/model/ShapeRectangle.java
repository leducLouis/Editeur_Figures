package model;

import java.awt.Color;

public class ShapeRectangle implements Shape{
	public ShapeRectangle(double xpos, double ypos, int width, int height, double rotation, Color color,
			int round) {
		super();
		this.xpos = xpos;
		this.ypos = ypos;
		this.width = width;
		this.height = height;
		this.rotation = rotation;
		this.xCenter = xCenter;
		this.yCenter = yCenter;
		this.color = color;
		this.round = round;
	}
	private double xpos;
	private double ypos;
	private int width;
	private int height;
	private double rotation;
	private double xCenter;
	private double yCenter;
	private Color color;
	private int round;
	
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
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
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
	public void setXCenter(){
		xCenter = this.getXpos()+this.getWidth()/2;
	}
	public double getYCenter() {
		return yCenter;
	}
	public void setYCenter() {
		yCenter = this.getYpos()+this.getHeight()/2;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	@Override
	public void translation() {
		
		
	}

	
	

	
}
