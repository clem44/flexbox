
package layout;

public class BoxSize extends TheBox{
	
	private static double height;
	private static double width;
	private static double length;
	private static int grade;
	static double area;
	
	public BoxSize(double h, double w, double l){
		height = h;
    	width = w;
    	length = l; 
	}
	 public BoxSize(double h, double w, double  l, int g ) {
    	
    	height = h;
    	width = w;
    	length = l;    	
    	grade = g;     	
    }
	public BoxSize(){
		height = 0;
    	width = 0;
    	length = 0;
	}
	public String getBoxsize(){
    	//double area = (height*width)*2 +(length*height)*2 +(width*length)*2;
    	return "Dimensions: "+ " Height: "+height+" Width: "+width+" Length: "+length;
    }
    public int getGrade(){
    	return grade;
    }
    public double calSize(){
    	double size = (height*width)*2 +(length*height)*2 +(width*length)*2;
    	return size;
    }
    public void calculateArea(){
    	super.calculateArea();
    	area = (height*width)*2 +(length*height)*2 +(width*length)*2;
    }

}