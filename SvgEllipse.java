package edu.school.models;

import java.awt.Color;

public class SvgEllipse extends SVGObject{
	private int strokeWidth;
	private Color fillColor;
	private int rx;
	private int ry;
	
	public SvgEllipse(int x, int y, Color strokeColor, int strokeWidth, Color fillColor, int rx, int ry) {
		super(x, y, strokeColor);
		setStrokeWidth(strokeWidth);
		setFillColor(fillColor);
		setRX(rx);
		setRY(ry);
	}
	
	public int getStrokeWidth() {
		return strokeWidth;
	}
	public void setStrokeWidth(int strokeWidth) {
		if (strokeWidth > 0)
		this.strokeWidth = strokeWidth;
	}
	public Color getFillColor() {
		return fillColor;
	}
	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}
	public int getRX() {
		return rx;
	}
	public void setRX(int rx) {
		if (rx > 0)
		this.rx = rx;
	}
	public int getRY() {
		return ry;
	}
	public void setRY(int ry) {
		if (ry > 0)
		this.ry = ry;
	}

	@Override
	public String toSvgCode() {
		String result = "<ellipse ";
		result += "cx=\""+getX()+"\" ";
		result += "cy=\""+getY()+"\" ";
		result += "rx=\""+getRX()+"\" ";
		result += "rx=\""+getRY()+"\" ";
		result += "style=\"fill:"+toRGB(getFillColor())+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\"/>";
		return result;
	}
}
