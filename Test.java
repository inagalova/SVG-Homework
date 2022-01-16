package edu.school.tests;

import java.awt.Color;

import edu.school.models.SVGCircle;
import edu.school.models.SVGLine;
import edu.school.models.SVGPicture;
import edu.school.models.SvgEllipse;
import edu.school.models.SvgPolygon;
import edu.school.models.SvgRectangle;

public class Test {

	public static void main(String[] args) {
		SVGPicture pic = new SVGPicture();
		pic.add(new SVGLine(10, 10, 180, 250, Color.red, 5));
		pic.add(new SVGLine(280, 10, 0, 368, Color.blue, 1));
		pic.add(new SvgRectangle(100, 200, 250, 250, Color.pink, Color.blue,  4));
		pic.add(new SvgPolygon(10, 10, Color.pink, Color.blue, 3, 200 ,10, 250, 190, 160, 210, 80, 90));
		pic.add(new SVGCircle(80, 80, Color.blue, 2, Color.pink, 40));
		pic.add(new SvgEllipse(100, 100, Color.green, 6, Color.yellow, 20, 70));
		System.out.println(pic);
		
		pic.saveToFile("C:\\Users\\35989\\Documents\\svg.svg");
	}
}
