


package layout;

public class BoxType extends  BoxFeature{
	
	//BoxFeature box1 = new BoxFeature();	
	private static String type = "";
	private int grade;
	private boolean Colour1 ;
	private boolean Colour2 ;
	private boolean Colour3 ;
		
	BoxSize box2 = new BoxSize();
	
	public BoxType(boolean rb,boolean rc,boolean st, int g){	
		super(rb,rc,st);
		grade = g;
	}
	public BoxType(){			
		grade = 1;
		
	}
	
	public void setColour1(boolean a){
		Colour1 = a;
	}
	public void setColour2(boolean b){
		Colour2 = b;
	}
	public void setColour3(boolean c){
		Colour3 = c;
	}
	public void setRB(boolean rb){
		super.setReinforceB(rb) ;
	}
	public void setRC(boolean rc){
		super.setReinforceC(rc) ;
	}
	public void setTop(boolean t){
		super.setTop(t) ;
	}
	public String getType(){
		return " Box type: "+type;
	}
	
	
	public String Type(){
		grade = box2.getGrade();
		/*boolean valueB = getReinforceB();
		boolean valueC = getReinforceC();*/
		switch(grade)
		{
			case 0: 
				if (Colour1=true){
					type = "I";	
				}
				break;
			case 1:
				if ((Colour1==true)&&(getReinforceB()==false)&&(getReinforceC()==false)){
					type = "I";
				}
				else if ((Colour2==true)&&(getReinforceB()==false)&&(getReinforceC()==false)){
					type = "II";
				}
				else if ((Colour3=true)&&(getReinforceB()==false)&&(getReinforceC()==false)){
					type = "III";
				}
				else if ((Colour1==true)||(Colour2==true)||(Colour3==true)&&(getReinforceB()==true)&&(getReinforceC()==false)){
					type = "IV";
				}break;
			case 2:
				if ((Colour1==true)&&(getReinforceB()==false)&&(getReinforceC()==false)){
					type = "I";
				}
				else if ((Colour2==true)&&(getReinforceB()==false)&&(getReinforceC()==false)){
					type = "II";
				}
				else if ((Colour3==true)&&(getReinforceB()==false)&&(getReinforceC()==false)){
					type = "III";
				}
				else if ((Colour1==true)||(Colour2==true)||(Colour3==true)&&(getReinforceB()==true)&&(getReinforceC()==false)){
					type = "IV";
				}
				else if ((Colour1==true)||(Colour2==true)||(Colour3==true)&&(getReinforceB()==true||getReinforceB()==false)&&(getReinforceC()==false ||getReinforceC()==true)){
					type = "V";
				}break;
			case 3:
				if ((Colour1==true)&&(getReinforceB()==false)&&(getReinforceC()==false)){
					type = "I";
				}
				else if ((Colour2==true)&&(getReinforceB()==false)&&(getReinforceC()==false)){
					type = "II";
				}
				else if ((Colour3==true)&&(getReinforceB()==false)&&(getReinforceC()==false)){
					type = "III";
				}
				else if ((Colour1==true)||(Colour2==true)||(Colour3==true)&&(getReinforceB()==true)&&(getReinforceC()==false)){
					type = "IV";
				}
				else if ((Colour1==true)||(Colour2==true)||(Colour3==true)&&(getReinforceB()==true||getReinforceB()==false)&&(getReinforceC()==false ||getReinforceC()==true)){
					type = "V";
				}break;
			case 4:
				
				if ((Colour3==true)&&(getReinforceB()==false)&&(getReinforceC()==false)){
					type = "III";
				}
				else if ((Colour3==true)&&(getReinforceB()==true)&&(getReinforceC()==false)){
					type = "IV";
				}
				else if ((Colour3==true)&&(getReinforceB()==true||getReinforceB()==false)&&(getReinforceC()==false ||getReinforceC()==true)){
					type = "V";
				}break;
			default:
				System.err.println("Sorry but FlexBox does not supply the type requested");
			
		}
		//String num = box.getGrade();
		if(type.equals("")){
			System.err.println("Sorry but FlexBox does not supply the type requested");
		}	return type;
		
		
	}
	public void printQuote(){
		super.printQuote();		
		System.out.println("\n"+ type);
	}
	 /*public static void main(String []arg){
	 	BoxType tile = new BoxType(false,false,false, 4);
	 	/*tile.setRB(false);
	 	tile.setRC(false);
	 	tile.setColour2(false);
	 	tile.setColour1(true);
	 	tile.setColour3(false);
	 	tile.Type();
	 	tile.printQuote();
	 }*/
}