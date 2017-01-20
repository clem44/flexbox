/**
 * @(#)Box.java
 *
 *
 * @author 
 * @version 1.00 2014/1/6
 */


public class Box {
	
	private double height;
	private double width;
	private double length;
	double area;
	private int grade;

    public Box(double a, int g ) {
    	
    	this.area = a;
    	this.grade = g;    	
    	
    }
    public Box(double h, double w, double  l, int g ) {
    	
    	this.height = h;
    	this.width = w;
    	this.length = l;
    	this.grade = g;    	
    	
    }
    
    public double getBoxsize(){
    	//double area = (height*width)*2 +(length*height)*2 +(width*length)*2;
    	return area;
    }
    public void setArea(double  h, double w, double l){
    	area = (h*w)*2 +(l*h)*2 +(w*l)*2; //calculates area of 6 sides
    	
    }
    public void setGrade(int g){
    	grade = g;
    }
    
    
}