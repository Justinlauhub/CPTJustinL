import arc.*;
import java.awt.*;
import java.awt.image.*;
public class JustinCPT{
	public static void main(String[] args){
		Console con = new Console(1280, 720);	
	//variables		
	String strOption;
	String strTestOption;
	String strLinear;
	String strQuadradics;
	String strTrig;
	String strBMath;
	String strTest;
	String strName;
	boolean blnBack;
	int intPercentage;
	String strChoice;
	int intRandom;
	int intRCount;
	//arrays
	String strArrBmath[][];
	String strArrLinear[][];
	String strArrQuadradics[][];
	String strArrTrig[][];
	String strQuestion[];
	String strAnswer[];
	String strAnswer2[];
	String strAnswer3[];
	int intArrRandom[];

	strArrBmath = new String [20][4];
	strArrLinear = new String [20][4];
	strArrQuadradics = new String [20][4];
	strArrTrig = new String [20][4];
	strQuestion = new String [4];
	strAnswer = new String [4];
	strAnswer2 = new String [4];
	strAnswer3 = new String [4];
	intArrRandom = new int [20];
	
	//strArray[0][4] = int
	
	
	
	//File IO
	TextInputFile Tests = new TextInputFile("Tests.txt");
	TextInputFile Scores = new TextInputFile ("highscores.txt");
	TextInputFile Linear = new TextInputFile ("Linear.txt");
	TextInputFile Quadradics = new TextInputFile ("Quadradics.txt");
	TextInputFile Trig = new TextInputFile ("Trig.txt");
	TextInputFile BasicMath = new TextInputFile("BasicM.txt");
	
	//Initializing variables
	int intCountQ = 0;
	int intRow;
	int intCorrectAnswers = 0;
	blnBack = true;
	strOption = "";
	strTestOption = "";
	strName = "";
	
	//Main menu / title screen
	//Loop for cycling back to main program
	while(blnBack == true){	
	con.println("W e l c o m e  t o  B r a i n   G a m e!");
	con.println("");
	con.println("> Play game(P)");
	con.println("> View scores(V)");
	con.println("> Quit game(Q)");
	con.println("> Help(H)");
	con.println("");
	con.println("To select one of the options, please type the indicated letter"); 
	con.println("beside the option you want to choose.");
	strOption = con.readLine();
	con.clear();

	
	
	//Go into tests main file
	if(strOption.equalsIgnoreCase("P")){
		con.println("What is your name?");
		strName = con.readLine();
		con.clear();
		while(Tests.eof() == false){
			strBMath = Tests.readLine();
			strLinear = Tests.readLine();
			strQuadradics = Tests.readLine();
			strTrig = Tests.readLine();
		con.println("Hello,"+strName);
		con.println("Which of these tests would you like to pick?");
		con.println(strBMath);
		con.println(strLinear);
		con.println(strQuadradics);
		con.println(strTrig);
		strTestOption = con.readLine();	
		//con.clear();
		//B back loop
		//while(con.getChar() == 'b'){
		//System.out.println("Help Teggst");
		//blnBack = true;	
	}
	Tests.close();
	//break;
	
	//If player presses 1	
	}if(strTestOption.equalsIgnoreCase("1")){
		//blnBack = false;
		while(BasicMath.eof() == false){
			strQuestion[0] = BasicMath.readLine();
			strAnswer[0] = BasicMath.readLine();
			strAnswer2[0] = BasicMath.readLine();
			strAnswer3[0] = BasicMath.readLine();
			intCountQ = intCountQ + 1;
			
			
		}
		BasicMath.close();
	BasicMath = new TextInputFile("BasicM.txt");
		
		for(intRow = 0; intRow < intCountQ; intRow++){
			strArrBmath[intRow][0] = BasicMath.readLine();
			strArrBmath[intRow][1] = BasicMath.readLine();
			strArrBmath[intRow][2] = BasicMath.readLine();
			strArrBmath[intRow][3] = BasicMath.readLine();
			//intRandom = (int)(Math.random() * 100 + 1);
			//System.out.println(intRandom);
			con.println(strName);
			con.println("Basic math");
			con.println(strArrBmath[intRow][0]);
			strChoice = con.readLine();
			
			for(intRCount = 0; intRCount <= intArrRandom.length; intRCount++){
				intArrRandom[intRCount] = intRandom = (int)(Math.random() * 100 + 1);
				
			}
			
		if(strChoice.equalsIgnoreCase(strArrBmath[intRow][1])||strChoice.equalsIgnoreCase(strArrBmath [intRow][2])||strChoice.equalsIgnoreCase(strArrBmath [intRow][3])){
			con.println("Correct!");
			con.sleep(3000);
			con.clear();	
			intCorrectAnswers = intCorrectAnswers + 1;
			
	
		}else if(!strChoice.equalsIgnoreCase(strArrBmath[intRow][1])||!strChoice.equalsIgnoreCase(strArrBmath [intRow][2])||!strChoice.equalsIgnoreCase(strArrBmath [intRow][3])){
			con.println("Incorrect!");

		}
		intPercentage = (intCorrectAnswers / intCountQ) * 100;
		con.println("Congrats you completed the test!");
		con.println("Here are your results:");
		con.println(strName);
		//con.println(
		con.println(intPercentage);
		
			
		//BasicMath.close();
		blnBack = false;
		
	}


		//BasicMath.close();
		//strArray = new String[intCountQ][4];
	//	int intRow;
		//for(intRow = 0; intRow < intCountQ; intCountQ++){
		//}
		
		//con.clear();
		
	

		
		
	//}else if(intTestOption = 2){
	//}else if(intTestOption = 3){
	//}else if(intTestOption = 4){
	//}else if(intTestOption = 5){
	//}else if(intTestOption = 6){
	
		
		
	
	//View highscores
	}else if(strOption.equalsIgnoreCase("V")){
		while(Scores.eof() == false){
			strName = Scores.readLine();
			strTest = Scores.readLine();
			intPercentage = Scores.readInt();
			con.println("Highscores: ");
			//con.println(strName);
			//con.println(strTest);
			//con.println(intPercentage);
		
		//B back loop	
		while(con.getChar() != 'b'){
		System.out.println("Help Test");
		blnBack = true;
	}
	con.clear();
}
	


		
			
			
	//Quit option 3
	}else if(strOption.equalsIgnoreCase("Q")){
		con.println("Thanks for playing Brain Game!");
		con.sleep(1000);
		con.closeConsole();
		
	//Help option 4
	}else if(strOption.equalsIgnoreCase("H")){
		con.println("Welcome to the help screen.");
		con.println("Each question can either give you a higher or lower percentage mark.");
		con.println("Aim to get every question right");
		con.println("Don’t get under 20% or you will lose and your progress ends there! ");
		con.println("To go back to the main screen type b");
		//b back loop
		while(con.getChar() != 'b'){
		System.out.println("Help Test");
		blnBack = true;
	}
	con.clear();
	
		
	//Secret menu
	}else if(strOption.equalsIgnoreCase("Secret")){
		con.println("Wow!");
		con.sleep(1000);
		con.println("You found my funny little domain cheater…");
		con.sleep(1000);
		con.println("While you’re here I might as well tell you one of my hilarious jokes…");
		con.sleep(1000);
		con.println("Have you ever noticed what's odd");
		con.sleep(1000);
		con.println("...");
		con.sleep(1000);
		con.println("...");
		con.sleep(1000);
		con.println("...");
		con.sleep(1000);
		con.println("Every other number!");
		con.sleep(1000);
		con.println("Type b to go back to main screen.");	
		//con.clear();
		//B back loop
	while(con.getChar() != 'b'){
		System.out.println("Help Test");
		blnBack = true;
	}
	con.clear();
		
	//Invalid option input
	}else{
	con.println("Invalid option, please try again");
	blnBack = false;
	con.sleep(1000);
	con.clear();
	blnBack = true;	
		
	}	
	}	
}	
}













		
		
	



