package edu.school.models;

import java.awt.Color;
import java.util.ArrayList;

public class SvgPolygon extends SVGObject{

	private int[] points;
	private int strokeWidth;
	private Color fillColor;
	private int x;
	private int y;
	
	public SvgPolygon(int x, int y, Color strokeColor,Color fillColor, int strokeWidth, int... points) {
		super(x, y, strokeColor);
		setFillColor(fillColor);
		setStrokeWidth(strokeWidth);
		setPoints(points);
	}
	
	@Override
	public String toSvgCode() {
		String result = "<polygon ";
		String pn = "";
		result += "points=\"";
		for (int i = 0; i < points.length; i++) {
			pn += points[i] + " ";
		}
		result += pn + "\"";
		result += "style=\"fill:"+toRGB(getFillColor())+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\"/>"; 
		return result;
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

	public int[] getPoints() {
		return points;
	}

	public void setPoints(int[] points) {
		if (points.length % 2 == 0)
		this.points = points;
	}
}
