/**
 * @(#)FlexBox.java
 *
 *
 * @author 
 * @version 1.00 2014/1/1
 */
package layout; 
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Jframe extends JFrame {
	
	 static final String gradeList[] = {"1", "2", "3", "4","5"};
	 private JComboBox <String> ComboBox; //= new JComboBox(gradeList);	 
	 private JTextField text1, text2,text3,text4;	 
	 private JRadioButton colourbox0, colourbox1, colourbox2; 	 
	 private ButtonGroup group;
	 JCheckBox tickbox1,tickbox2,tickbox3;	
	 JButton apply;
	 JButton order;
	 int N=0;
        
    public Jframe(){    	
    	super("FlexBox");
    	//setSize(450,200);
    	setLocation(640,175);//setWindow location
    	setResizable(false);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	//this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.PAGE_AXIS));
   
    }
    
    public void init() {
        ComboBox = new JComboBox <String>(gradeList);
        ComboBox.setPreferredSize(new Dimension(60,20));    
        text1 = new JTextField(4);
        text2 = new JTextField(4);
        text3 = new JTextField(4);
        text4 = new JTextField("1",3);
        colourbox0 = new JRadioButton("NON", true);        
        colourbox1 = new JRadioButton("One");
        colourbox2 = new JRadioButton("Two");
        tickbox1 = new JCheckBox("Reinforce bottom");
        tickbox2 = new JCheckBox("Reinforce corner");
        tickbox3 = new JCheckBox("Sealable tops");
        apply = new JButton("print Quote");
        order = new JButton("Make another order");
        
        group = new ButtonGroup(); //states that only one button can be selected at a time.
        group.add(colourbox0);
        group.add(colourbox1);
        group.add(colourbox2);       
    }
    
    public void componentPane(){   	
    	
    	setLayout(new GridBagLayout()); 
    	GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2,2,2,2);   //spacing         	
    	init();
    	
    /**********************Grade panel***************************/
    	JPanel grade = new JPanel(new GridBagLayout());    	
    	grade.setBorder(BorderFactory.createTitledBorder("Choose Box grade"));   	  	
    	   	    	
    	grade.add(new JLabel("Grade:  "),gbc);    	   	
    	grade.add(ComboBox);
    	ComboBox.setSelectedIndex(2);
    	//ComboBox.addActionListener(new MyActionListener());
    	
     /**********************colour panel***************************/	
    	JPanel ColorPicker = new JPanel();
    	ColorPicker.setBorder(BorderFactory.createTitledBorder("How many colours?"));
    	
    	ColorPicker.add(colourbox0);    	   	
    	ColorPicker.add(colourbox1);   	    	
    	ColorPicker.add(colourbox2);       	
    		
        
     /**********************BoxSize panel***************************/	
    	JPanel dimension = new JPanel();
    	dimension.setLayout(new GridLayout(0,3,2,0)); 
    	dimension.setBorder(BorderFactory.createTitledBorder("Enter box measurements"));
    	
    	dimension.add(new JLabel("Height:"));
    	dimension.add(new Label("Width:"));
    	dimension.add(new Label("Length:"));
    	dimension.add(text1);
    	dimension.add(text2);
    	dimension.add(text3);
    	
    	JPanel boxAmt = new JPanel();    	
    	boxAmt.setBorder(BorderFactory.createTitledBorder("Quantity"));
    	boxAmt.add(new Label("Amt:"));
    	boxAmt.add(text4);
    	
    /**********************BoxFeature panel***************************/
     	JPanel features = new JPanel();
     	features.setBorder(BorderFactory.createTitledBorder("Additions"));
     	features.add(tickbox1);
     	features.add(tickbox2);
     	features.add(tickbox3);
     	
     	JPanel applyButton = new JPanel();
     	//applybutton.setBorder(BorderFactory.createTitledBorder(""));
     	applyButton.add(apply);
     	//apply.setVisible(false);
     	JPanel orderButton = new JPanel();
     	orderButton.add(order);     
     	order.setVisible(false);
     /*****************actionlisteners**************************** */
      	ComboBox.addActionListener(new MyActionListener());
      	apply.addActionListener(new MyActionListener());
     	order.addActionListener(new MyActionListener());
    /**********************ADD to JFrame***************************/
    
     	gbc.fill = GridBagConstraints.HORIZONTAL;
      	gbc.ipadx = 20;
      	gbc.ipady = 12;
      	gbc.gridx =0;
      	gbc.gridy =0;
      	gbc.anchor = GridBagConstraints.WEST;       		       
        add(grade,gbc);
        
        gbc.ipadx = 0;gbc.ipady = 0; 
        gbc.gridx =1;
      	gbc.gridy =0;
      	gbc.gridwidth = GridBagConstraints.REMAINDER;      	        
        add(ColorPicker,gbc);
        
        gbc.ipadx = -10;gbc.ipady = 0;
        gbc.gridx =0;
      	gbc.gridy =1;      	     		     	        
        add(dimension,gbc);
        
               
        gbc.ipadx = 0;gbc.ipady = 0;
        gbc.gridx =0;
      	gbc.gridy =2;        
        add(features,gbc);
                
	    gbc.ipadx = 0;gbc.ipady = 0;
	    gbc.gridx =1;
	    gbc.gridy =3;	   
	    add(applyButton,gbc);
      			
      
	    gbc.ipadx = 0;gbc.ipady = 0;
	    gbc.gridx =1;
	    gbc.gridy =3;
	    add(orderButton,gbc); //order button set invisable
        
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = -100;gbc.ipady = 0;
        gbc.gridx =0;
      	gbc.gridy =3;
      	gbc.gridwidth = -10;  //GridBagConstraints.RELATIVE; 
      	//gbc.anchor = GridBagConstraints.WEST; 	
        add(boxAmt,gbc);       
       
                               
    }
    
    private class MyActionListener implements ActionListener{
    	double num1, num2, num3;
    	int numB =0, numC=0, numS=0, numQ =0;
        @Override
        public void actionPerformed(ActionEvent e){
        			BoxFeature grade = new BoxFeature();
        			BoxType Boxtype = new BoxType();      			
        		       			
	            	if(e.getSource() == ComboBox){	
	            		            	
		            	if(ComboBox.getSelectedIndex() == 0 ){
		            		colourbox0.setEnabled(true);colourbox0.setSelected(true);colourbox1.setEnabled(false);
			    			colourbox2.setEnabled(false);tickbox1.setEnabled(false);	 
			    			tickbox2.setEnabled(false);tickbox3.setEnabled(true);tickbox1.setSelected(false);	 
			    			tickbox2.setSelected(false);         	
		            	}	 	    				 	  	
		    				    				 	   
			    		else if(ComboBox.getSelectedIndex() == 1 ){
			    			tickbox2.setEnabled(false);tickbox2.setSelected(false);colourbox1.setEnabled(true);
			    			colourbox2.setEnabled(true);tickbox1.setEnabled(true);		
			    			tickbox3.setEnabled(true);
			    		}
			    		else if(ComboBox.getSelectedIndex() == 4 ){
		    				colourbox0.setEnabled(false);colourbox1.setEnabled(false);
		    				colourbox2.setEnabled(true);colourbox2.setSelected(true);tickbox1.setEnabled(true);	
		    				tickbox3.setEnabled(true);tickbox2.setEnabled(true);
			    		}
		    			else{colourbox0.setEnabled(true);tickbox1.setEnabled(true);
		    				colourbox1.setEnabled(true);colourbox2.setEnabled(true);
		    				tickbox2.setEnabled(true);	tickbox3.setEnabled(true); 
		    			}
		   			}
		   			if((e.getSource() == apply)||(e.getSource() == order)){
		   				
		   				try {		   							   				
			   				num1 = Double.parseDouble(text1.getText());
			   				num2 = Double.parseDouble(text2.getText());
			   				num3 = Double.parseDouble(text3.getText());
							numQ = Integer.parseInt(text4.getText());
						}catch (NumberFormatException ignored){JOptionPane.showMessageDialog(null, "Please specify all box dimensions");};
						
						if((num1!= 0)&&(num2!= 0)&&(num3!= 0)){
							N++;						
			   				TheBox box = new BoxSize(num1,num2,num3,ComboBox.getSelectedIndex());						
			   				box.calculateArea();
							grade.setQuantity(numQ);
			   						   				
			   				grade.calGradeCost();
			   				if (colourbox0.isSelected()){
			   					grade.ColourCost(0);
			   					Boxtype.setColour1(true);
			   				}
			   				if (colourbox1.isSelected()){
			   					grade.ColourCost(12);
			   					Boxtype.setColour2(true);
			   				}
			   				if (colourbox2.isSelected()){
			   					grade.ColourCost(15);
			   					Boxtype.setColour3(true);
			   				}
			   				if (tickbox1.isSelected()){
			   					numB=10;
			   					Boxtype.setRB(true);
			   				}
			   				if (tickbox2.isSelected()){
			   					numC=7;
			   					Boxtype.setRC(true);
			   				}
			   				if (tickbox3.isSelected()){
			   					 numS=5;
			   				}
			   				grade.extraCost(numB,numC,numS);
			   				Boxtype.Type();		   				
			   				//JOptionPane.showMessageDialog(null,"Your Quote: £"+ grade.getPrice());
			   				grade.printQuote(Boxtype.getType());
			   				
			   				
			   				if(N!=0){ //after clicking the apply button once it changes to "Make another order" button
			   					apply.setVisible(false);
			     				order.setVisible(true);
			   				}
			   				
			   				
			   			}else{ JOptionPane.showMessageDialog(null,"Size cannot be specified as [0]");} 
			   	}
	    	
    	}
    }
    /*private class MyActionListener2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
        	
        	
        }
    }*/
    public static void main(String []arg){
    	Jframe frame = new Jframe();
    	frame.componentPane();
    	frame.pack();
    	frame.setVisible(true);  	
    	
    }    
}