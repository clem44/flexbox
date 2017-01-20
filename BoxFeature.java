/**
 * Child Class; BoxFeature.java
 *
 *
 * @author 
 * @version 1.00 2014/1/10
 */
package layout;

public class BoxFeature extends TheBox{
	
	private boolean reinforceb;
	private boolean reinforcec;
	private boolean sealablet;
	private int colourNum;
	private int quantity;
	
	public static double cost;
	double price;
	
	BoxSize box = new BoxSize();
	

    public BoxFeature(boolean rb,boolean rc,boolean st/*,int c*/) {
       	
    	reinforceb=rb;
    	reinforcec=rc;
    	sealablet= st;
    	/*colourNum=c;*/
    }
    public BoxFeature() {
    	    	
    	reinforceb=false;
    	reinforcec=false;
    	sealablet= false;
    	colourNum=0;
    }
    public void setReinforceB(boolean rb){
    	reinforceb = rb;
    }
    public void setReinforceC(boolean rc){
    	reinforcec = rc;
    }
    public void setTop(boolean st){
    	sealablet = st;
    }
	public void setQuantity(int q){
		quantity = q;
	}
	public boolean getReinforceB(){
		return reinforceb;
	}
	public boolean getReinforceC(){
		return reinforcec;
	}
	
	
	public int getGrade(){    	   	
    	return box.getGrade();
    }
	
    public void calGradeCost(){
    	
    	double a = box.calSize();
    	int g = getGrade();    	    	
    	switch (g){    		
    		case 0:cost = (a*0.47);break;
    		case 1:cost = (a*0.59);break;
    		case 2:cost = (a*0.68);break;
    		case 3:cost = (a*0.92);break;
    		case 4:cost = (a*1.30);break;
    		
    	}cost = Math.round(cost*100)/100d;
    }
    public void ColourCost(int c){
    	colourNum =c;
    	price = cost+((double)colourNum/(double)100)*cost;
    }
    
    public void extraCost(int b,int c,int s){
    	int Num =b;
    	int Num1=c;
    	int Num2=s;
    	int percentage = (Num+Num1+Num2);
    	price = price+((double)percentage/(double)100)*price;
    }
    
    
    public double getArea(){    	   	
    	return box.calSize();
    }
    
    public double getCost(){    	   	
    	return cost;
    }
    public double getPrice(){    	   	
    	return Math.round((price*(double)quantity)*100)/100d ;
    }
    
    public void printQuote(){//polymorphism method
    	super.printQuote();
    	System.out.println(box.getBoxsize()+"\n Grade: "+(getGrade()+1)+"\n Quantity: "+ quantity +"\n Total cost: £"+getPrice());
    }
     public void printQuote(String value){//polymorphism method & constructor
    	super.printQuote();
    	System.out.println(box.getBoxsize()+"\n Grade: "+(getGrade()+1)+"\n Quantity: "+ quantity +"\n Total cost: £"+getPrice()+"\n"+value);
    }
    
    
}