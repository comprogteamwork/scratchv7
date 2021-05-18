package AirlineReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public  class passenger extends AirlineType{
	
   int passengerCount[]= new int[3];
    JFrame jonnyMain;
    JTextField inputAge,inputName, childTextField, adultTextField, seniorCitizenTextField;
    JButton passengerButtonNext1, cancelPassenger;
    JPanel passengerDetails;
    JLabel passengerAge,passengerName, childLabel, adultLabel, seniorCitizenLabel;
    
    String userInputName, userInputAge, childStore, adultStore, seniorStore, totalPassengerConvert;
    
    int maximumCapacity, childCount, adultCount, seniorCount, totalPassengerCount, userAge, taxConvert;
    
    double passengerPayment;
	
    static int privateMaximumA=0, privateMaximumB=0,privateMaximumC=0, privateMaximumD=0,
    		privateMaximumE=0, privateMaximumF=0, privateMaximumG=0, privateMaximumH=0,
    		privateMaximumI=0,privateMaximumJ=0,
    		businessMaximumA=0, businessMaximumB=0,businessMaximumC=0,businessMaximumD=0,
    		businessMaximumE=0, businessMaximumF=0, businessMaximumG=0, businessMaximumH=0,
    		businessMaximumI=0, businessMaximumJ=0,
    		regularMaximumA=0, regularMaximumB=0, regularMaximumC=0, regularMaximumD=0,
    		regularMaximumE=0, regularMaximumF=0, regularMaximumG=0, regularMaximumH=0,
    		regularMaximumI=0, regularMaximumJ=0;
    
	
	
    public void passengerDetails(){ 
    	

        jonnyMain = new JFrame("PASSENGER FRAME");
        jonnyMain.setBounds(400,100,500,500);
        jonnyMain.setVisible(true);
        jonnyMain.setLayout(null);
        jonnyMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jonnyMain.getContentPane().setBackground(Color.LIGHT_GRAY);
        jonnyMain.setResizable(false);
        
        passengerDetails = new JPanel();
        jonnyMain.getContentPane().add(passengerDetails);
        passengerDetails.setLayout(null);
        passengerDetails.setBackground(Color.GRAY);
        passengerDetails.setBounds(17,15,450,430);
        
    
        
        passengerName = new JLabel("Name");
        passengerDetails.add(passengerName);
        passengerName.setBounds(20,40,90,30);
        
        inputName = new JTextField();
        passengerDetails.add(inputName);
        inputName.setBounds(70,40,160,30);
        inputName.addActionListener(this);
        
        
        JLabel passengerAge = new JLabel("Age");
        passengerDetails.add(passengerAge);
        passengerAge.setBounds(20,80,90,30);
        	
        inputAge = new JTextField();
        passengerDetails.add(inputAge);
        inputAge.setBounds(70,80,160,30);
        inputAge.addActionListener(this);
          
        
        childLabel = new JLabel("CHILD");
        passengerDetails.add(childLabel);
        childLabel.setBounds(15,130,80,30);
        
        childTextField = new JTextField();
        passengerDetails.add(childTextField);
        childTextField.setBounds(7,160,80,30);
        childTextField.addActionListener(this);
        
        
        adultLabel = new JLabel("ADULT");
        passengerDetails.add(adultLabel);
        adultLabel.setBounds(127,130,80,30);
        
        adultTextField = new JTextField();
        passengerDetails.add(adultTextField);
        adultTextField.setBounds(110,160,80,30);
        adultTextField.addActionListener(this);
        
        
        seniorCitizenLabel = new JLabel("SENIOR");
        passengerDetails.add(seniorCitizenLabel);
        seniorCitizenLabel.setBounds(235,130,80,30);
        
        seniorCitizenTextField = new JTextField();
        passengerDetails.add(seniorCitizenTextField);
        seniorCitizenTextField.setBounds(217,160,80,30);
        seniorCitizenTextField.addActionListener(this);
   
        
        passengerButtonNext1 = new JButton("Next");
        passengerDetails.add(passengerButtonNext1);  
        passengerButtonNext1.setBounds(20,270,120,30);
        passengerButtonNext1.addActionListener(this);
        
        cancelPassenger = new JButton("Cancel");
        passengerDetails.add(cancelPassenger);  
        cancelPassenger.setBounds(160,270,120,30);
        cancelPassenger.addActionListener(this);
        
        
        
       
    }public void privateTravelA() {
    	//manila to batanes private
    	privateMaximumA += totalPassengerCount ;
    	
    	if(privateMaximumA > 14) {
			privateMaximumA = privateMaximumA - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    	
    	
    }public void privateTravelB() {
    	//batanes to manila private
    	privateMaximumB += totalPassengerCount ;
    	
    	if(privateMaximumB > 14) {
			privateMaximumB = privateMaximumB - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    	
    	
    } public void privateTravelC() {
    	// manila  to palawan private
    	privateMaximumC += totalPassengerCount ;
    	
    	if(privateMaximumC > 14) {
    		privateMaximumC = privateMaximumC - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    
    
    
    } public void privateTravelD() {
    	//palawan to manila private
    	privateMaximumD += totalPassengerCount ;
    	
    	if(privateMaximumD > 14) {
    		privateMaximumD = privateMaximumD - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    }public void privateTravelE() {
    	//manila to SouthKorea private
    	privateMaximumE += totalPassengerCount ;
    	
    	if(privateMaximumE > 14) {
    		privateMaximumE = privateMaximumE - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    	
    	
    }public void privateTravelF() {
    	//SouthKore to manila private
    	privateMaximumF += totalPassengerCount ;
    	
    	if(privateMaximumF > 14) {
    		privateMaximumF = privateMaximumF - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    	
    	
    } public void privateTravelG() {
    	// manila  to Japan private
    	privateMaximumG += totalPassengerCount ;
    	
    	if(privateMaximumG > 14) {
    		privateMaximumG = privateMaximumG - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
  
    } public void privateTravelH() {
    	//Japan to manila private
    	privateMaximumH += totalPassengerCount ;
    	
    	if(privateMaximumH > 14) {
    		privateMaximumH = privateMaximumH - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    } public void privateTravelI() {
    	// manila  to vietnam private
    	privateMaximumI += totalPassengerCount ;
    	
    	if(privateMaximumI > 14) {
    		privateMaximumI = privateMaximumI - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
  
    } public void privateTravelJ() {
    	//vietman to manila private
    	privateMaximumJ += totalPassengerCount; 	
    	if(privateMaximumJ > 14) {
    		privateMaximumJ = privateMaximumJ - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    	
    } public void businessTravelA() {
    	//manila to batanes business
    	businessMaximumA += totalPassengerCount;
    	if(businessMaximumA > 23) {
    		businessMaximumA = businessMaximumA - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}
    	
    }public void businessTravelB(){
    	businessMaximumB += totalPassengerCount;
    	//batanes to manila business
    	if(businessMaximumB > 23){
    		businessMaximumB = businessMaximumB - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}
    	
    	
    }public void businessTravelC(){
    	businessMaximumC += totalPassengerCount;
    	//  manila to palawan business
    	if(businessMaximumC > 23) {
    		businessMaximumC = businessMaximumC - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}
    
    }public void businessTravelD() {
    	// palawan to manila business
    	businessMaximumD += totalPassengerCount;
    	if(businessMaximumD > 23) {
    		businessMaximumD = businessMaximumD - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}
    }public void businessTravelE() {
    	//manila to SouthKorea business
    	businessMaximumE += totalPassengerCount ;
    	
    	if(businessMaximumE > 23) {
    		businessMaximumE = businessMaximumE - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    	
    	
    }public void businessTravelF() {
    	//SouthKore to manila business
    	businessMaximumF += totalPassengerCount ;
    	
    	if(businessMaximumF > 23) {
    		businessMaximumF = businessMaximumF - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    	
    	
    } public void businessTravelG() {
    	// manila  to Japan business
    	businessMaximumG += totalPassengerCount ;
    	
    	if(businessMaximumG > 23) {
    		businessMaximumG = businessMaximumG - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
  
    } public void businessTravelH() {
    	//Japan to manila business
    	businessMaximumH += totalPassengerCount ;
    	
    	if(businessMaximumH > 23) {
    		businessMaximumH = businessMaximumH - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    } public void businessTravelI() {
    	// manila  to vietnam business
    	businessMaximumI += totalPassengerCount ;
    	
    	if(businessMaximumI > 23) {
    		businessMaximumI = businessMaximumI - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
  
    } public void businessTravelJ() {
    	//vietman to manila business
    	businessMaximumJ += totalPassengerCount ;
    	
    	if(businessMaximumJ > 23) {
    		businessMaximumJ = businessMaximumJ - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    	
    }public void regularTravelA(){
    	regularMaximumA += totalPassengerCount;
    	//manila to batanes regular
    	if(regularMaximumA > 48) {
    		regularMaximumA = regularMaximumA - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}
    	
    	
    }public void regularTravelB() {
    	regularMaximumB += totalPassengerCount;
    	//batanes to manila regular
    	if(regularMaximumB > 48) {
    		regularMaximumB = regularMaximumB - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}
    	
    }public void regularTravelC() {
    	//manila to palawan regular
    	if(regularMaximumC > 48) {
    		regularMaximumC = regularMaximumC - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}	
    	
    }public void regularTravelD() {
    	//palawan to manila regular
    	if(regularMaximumD > 48) {
    		regularMaximumD = regularMaximumD - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}	
    	
    }public void regularTravelE() {
    	//manila to SouthKorea regular
    	regularMaximumE += totalPassengerCount ;
    	
    	if(regularMaximumE > 48) {
    		regularMaximumE = regularMaximumE - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    	
    	
    }public void regularTravelF() {
    	//SouthKore to manila regular
    	regularMaximumF += totalPassengerCount ;
    	
    	if(regularMaximumF > 48) {
    		regularMaximumF = regularMaximumF - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    	
    	
    } public void regularTravelG() {
    	// manila  to Japan regular
    	regularMaximumG += totalPassengerCount ;
    	
    	if(regularMaximumG > 48) {
        	regularMaximumG = regularMaximumG - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
  
    } public void regularTravelH() {
    	//Japan to manila regular
    	regularMaximumH += totalPassengerCount ;
    	
    	if(regularMaximumH > 48) {
    		regularMaximumH = regularMaximumH - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    } public void regularTravelI() {
    	// manila  to vietnam regular
    	regularMaximumI += totalPassengerCount ;
    	
    	if(regularMaximumI > 48) {
    		regularMaximumI = regularMaximumI - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
  
    } public void regularTravelJ() {
    	//vietman to manila regular
    	regularMaximumJ += totalPassengerCount ;
    	
    	if(regularMaximumJ > 48) {
    		regularMaximumJ = regularMaximumJ - totalPassengerCount;
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    	
    	
    }public void userClickAirplaneandTravel() {
    	if(knowingTypeofAirplane == 0) { // Take note private pa lang
    			if(knowingDestination == 0){
    					privateTravelA();
	    		}else if(knowingDestination==1) {
	    				privateTravelB();
	    		}else if(knowingDestination==2) {
	    				privateTravelC();
	    		}else if(knowingDestination==3) {
	    				privateTravelD();
	    		}else if(knowingDestination==4) {
	    				privateTravelE();
	    		}else if(knowingDestination==5) {
	    				privateTravelF();
	    		}else if(knowingDestination==6) {
	    				privateTravelG();
	    		}else if(knowingDestination==7){
	    				privateTravelH();
	    		}else if(knowingDestination==8) {
	    				privateTravelI();
	    		}else if(knowingDestination==9) {
	    				privateTravelJ();
	    		}
	    		
    		
    	}else if(knowingTypeofAirplane==1) {
    			if(knowingDestination == 0){
    					businessTravelA();
				}else if(knowingDestination==1) {
						businessTravelB();
				}else if(knowingDestination==2) {
						businessTravelC();
				}else if(knowingDestination==3) {
						businessTravelD();
				}else if(knowingDestination==4) {
						businessTravelE();
				}else if(knowingDestination==5) {
						businessTravelF();
				}else if(knowingDestination==6) {
						businessTravelG();
				}else if(knowingDestination==7){
						businessTravelH();
				}else if(knowingDestination==8) {
					businessTravelI();
				}else if(knowingDestination==9) {
						businessTravelJ();
				}
		    	
    	}else if(knowingTypeofAirplane==2) {
    			if(knowingDestination == 0){
					regularTravelA();
				}else if(knowingDestination==1) {
					regularTravelB();
				}else if(knowingDestination==2) {
					regularTravelC();
				}else if(knowingDestination==3) {
					regularTravelD();
				}else if(knowingDestination==4) {
					regularTravelE();
				}else if(knowingDestination==5) {
					regularTravelF();
				}else if(knowingDestination==6) {
					regularTravelG();
				}else if(knowingDestination==7){
					regularTravelH();
				}else if(knowingDestination==8) {
					regularTravelI();
				}else if(knowingDestination==9) {
					regularTravelJ();
				}
    	}
    }
    
    
    
    public void errorPromptExceed() {
    	JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required");
    	
    }
    
    public void errorNeedsDeduction() {
    	int deductionConvert = Integer.parseInt(PassengerAll[TransactionCounting][12]);
    	deductionConvert = deductionConvert	- totalPassengerCount;    	
    	PassengerAll[TransactionCounting][12]=String.valueOf(deductionConvert);
		
    	
    }
    
    public void insurancePrompt() {
    	Transaction Transaction = new Transaction();
	int insuranceQuestioning = JOptionPane.showConfirmDialog(null,  "Would you like to avail travel insureance?");
	
	if(insuranceQuestioning == 0) {
		if(PassengerAll[TransactionCounting][3] == "Private") {
			PassengerAll[TransactionCounting][10] = "4500";
		}else if(PassengerAll[TransactionCounting][3] == "Business"){
			PassengerAll[TransactionCounting][10] = "6500";
		}else if(PassengerAll[TransactionCounting][3] == "Regular"){
			PassengerAll[TransactionCounting][10] = "950";
		}
		
		
		Transaction.transactionMethod();
		Transaction.insurance.setVisible(true);
		jonnyMain.dispose();
	}else if(insuranceQuestioning == 1 ) {
		Transaction.transactionMethod();
		Transaction.printInsuranceFee.setVisible(false);
		jonnyMain.dispose();
		

	}
    
  }   
    
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Transaction Transaction = new Transaction();
	
		if(e.getSource()== passengerButtonNext1 ){
			
			
			userInputName =  inputName.getText();
			PassengerAll[TransactionCounting][1] = userInputName;
			
			userInputAge = inputAge.getText();
			PassengerAll[TransactionCounting][2] = userInputAge;
			
			
			
			
		
			
			childStore = childTextField.getText();
			adultStore = adultTextField.getText();
			seniorStore = seniorCitizenTextField.getText();
			
			childCount = Integer.parseInt(childStore);
			adultCount = Integer.parseInt(adultStore);
			seniorCount = Integer.parseInt(seniorStore);
			
			passengerCount[0] = 	childCount;			
			
			System.out.println(passengerPayment);
			
			totalPassengerCount = childCount + adultCount + seniorCount + 1;
			System.out.println(totalPassengerCount);
			
			totalPassengerConvert = String.valueOf(totalPassengerCount);
			PassengerAll[TransactionCounting][12] = totalPassengerConvert;
			
	
			userClickAirplaneandTravel();

			
		}
		else if(e.getSource()==cancelPassenger) {
			Destination Destination = new Destination();
            Destination.DestinationInformation();
			jonnyMain.dispose();
		}	
		
	}
	
}

