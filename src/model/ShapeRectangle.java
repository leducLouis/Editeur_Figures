package model;

import java.awt.Color;

public class ShapeRectangle implements Shape{
	public ShapeRectangle(int xpos, int ypos, int width, int height, int rotation, int xCenter, int yCenter, Color color,
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
	private int xpos;
	private int ypos;
	private int width;
	private int height;
	private int rotation;
	private int xCenter;
	private int yCenter;
	private Color color;
	private int round;
	
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
