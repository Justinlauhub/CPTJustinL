import arc.*;
import java.awt.*;
import java.awt.image.*;
public class JustinCPT{
	public static void main(String[] args){
		Console con = new Console(1280, 720);	
	//variables		
	String strOption;
	int intTestOption;
	String strLinear;
	String strQuadradics;
	String strTrig;
	String strShapes;
	String strWordProblems;
	String strTest;
	String strName;
	boolean blnBack;
	int intPercentage;
	String strQAAAR;
	TextInputFile Tests = new TextInputFile("Tests.txt");
	TextInputFile Scores = new TextInputFile ("highscores.txt");
	blnBack = true;
	
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
	con.println("To select one of the options, please type the indicated number"); 
	con.println("beside the option you want to choose.");
	strOption = con.readLine();
	con.clear();
	
	
	//Go into tests
	if(strOption.equalsIgnoreCase("P")){
		con.println("What is your name?");
		strName = con.readLine();
		con.clear();
		while(Tests.eof() == false){
			strLinear = Tests.readLine();
			strQuadradics = Tests.readLine();
			strTrig = Tests.readLine();
			strShapes = Tests.readLine();
			strWordProblems = Tests.readLine();
		con.println("Hello,"+strName);
		con.println("Which of these tests would you like to pick?");
		con.println(strLinear);
		con.println(strQuadradics);
		con.println(strTrig);
		con.println(strShapes);
		con.println(strWordProblems);
		intTestOption = con.readInt();	
		//B back loop
		while(con.getChar() != 'b'){
		System.out.println("Help Test");
		blnBack = true;
	}
	con.clear();
		
		
	}
	//View highscores
	}else if(strOption.equalsIgnoreCase("V")){
		
		while(Scores.eof() == false){
			strName = Scores.readLine();
			strTest = Scores.readLine();
			intPercentage = Scores.readInt();
			con.println("Highscores");
			con.println(strName);
			con.println(strTest);
			con.println(intPercentage);
			
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
		con.println("...");
		con.sleep(1000);
		con.println("...");
		con.sleep(1000);
		con.println("...");
		con.sleep(1000);
		con.println("Every other number!");
		con.sleep(1000);
		con.println("Before you go, I have a riddle for you that I've heard may grant a special surprise…");
		con.sleep(1000);
		con.println("“I’m not a gem, but I’m prized just the same, ");
		con.sleep(1000);
		con.println("Found by those who travel, i’m part of the game");
		con.sleep(1000);
		con.println("I’m small and light, but i hold great worth");
		con.sleep(1000);
		con.println("Collected by wanderers all around the earth");
		con.sleep(1000);
		con.println("Type your answer in the main menu if you dare…");
		con.sleep(1000);
		con.println("Type b to go back to main screen.");	
		//con.clear();
		//B back loop
	while(con.getChar() != 'b'){
		System.out.println("Help Test");
		blnBack = true;
	}
	con.clear();
	//Secret code for an additional secret test
	}else if(strOption.equalsIgnoreCase("Treasure")){
		con.println("Code has been successfully registered");
		con.sleep(2000);
		con.clear();
	//Invalid option input
	}else{
	blnBack = true;
	con.println("Invalid option, please try again");
	blnBack = false;
	con.sleep(1000);
	con.clear();
	blnBack = true;	
		
		
	}	
}	
}
}










		
		
	



