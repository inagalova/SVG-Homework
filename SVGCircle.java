package edu.school.models;

import java.awt.Color;

public class SVGCircle extends SVGObject{
	private int strokeWidth;
	private Color fillColor;
	private int r;
	
	public SVGCircle(int x, int y, Color strokeColor, int strokeWidth, Color fillColor, int r) {
		super(x, y, strokeColor);
		setStrokeWidth(strokeWidth);
		setFillColor(fillColor);
		setR(r);
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
	public int getR() {
		return r;
	}
	public void setR(int r) {
		if (r > 0)
		this.r = r;
	}

	@Override
	public String toSvgCode() {
		String result = "<circle ";
		result += "cx=\""+getX()+"\" ";
		result += "cy=\""+getY()+"\" ";
		result += "r=\""+getR()+"\" ";
		result += "style=\"fill:"+toRGB(getFillColor())+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\"/>";
		return result;
	}
	
}
