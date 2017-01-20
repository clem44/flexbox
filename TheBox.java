/**
 * SuperClass; Box.java
 *
 *
 * @author 
 * @version 1.00 2014/1/6
 */
package layout;

public abstract class TheBox {
	
	private static int grade;   
    private String name;
    
    /*public TheBox(String n){
    	this.name=n;
    }*/
    
    //public abstract double calSize();
    	/*double size = (height*width)*2 +(length*height)*2 +(width*length)*2;
    	return size;*/
    
    //public abstract void setArea();
    
    public abstract int getGrade();   	
    	
    
    /*public void setGrade(int g){
    	grade = g;
    }*/
    public void calculateArea(){    	
    }  	
    
    
    public void printQuote(){//polymorphism method
    	System.out.println("ESTIMATE\n "+ "Quote 1:\n");
    }
}