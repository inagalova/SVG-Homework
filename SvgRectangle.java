package edu.school.models;

import java.awt.Color;

public class SvgRectangle extends SVGObject{
	private int width;
	private int height;
	private int strokeWidth;
	private Color fillColor;
	private int x;
	private int y;
	
	public SvgRectangle(int width, int height, int x, int y, Color strokeColor,Color fillColor, int strokeWidth) {
		super(x, y, strokeColor);
		setWidth(width);
		setHeight(height);
		setFillColor(fillColor);
		setStrokeWidth(strokeWidth);
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if (width > 0)
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if (height > 0)
		this.height = height;
	}
	public Color getFillColor() {
		return fillColor;
	}
	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}
	public int getStrokeWidth() {
		return strokeWidth;
	}
	public void setStrokeWidth(int strokeWidth) {
		if (strokeWidth > 0)
		this.strokeWidth = strokeWidth;
	}
	@Override
	public String toSvgCode() {
		String result = "<rect ";
		result += "x=\""+getX()+"\" ";
		result += "y=\""+getY()+"\" ";
		result += "width=\""+getWidth()+"\" ";
		result += "height=\""+getHeight()+"\" ";
		result += "style=\"fill:"+toRGB(getFillColor())+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\"/>";
		return result;
	}
}
