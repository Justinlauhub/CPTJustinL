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
	String strName;
	String strTest;
	boolean blnBack2;
	String strBack1;
	int intPercentage;
	//Ask marcus about getChar and getKey
	TextInputFile Tests = new TextInputFile("Tests.txt");
	TextInputFile Scores = new TextInputFile ("highscores.txt");
	blnBack2 = true;
	strBack1 = "";
	//Main menu / title screen
	
	//Loop for 
	while(blnBack2 = true){	
	con.println("> 1.Play game");
	con.println("> 2.View scores");
	con.println("> 3.Quit game");
	con.println("> 4.Help");
	con.println("To select one of the options, please type the indicated number"); 
	con.println("beside the option you want to choose.");
	
	strOption = con.readLine();
	
	if(strOption.equalsIgnoreCase("1")){
		while(Tests.eof() == false){
			strLinear = Tests.readLine();
			strQuadradics = Tests.readLine();
			strTrig = Tests.readLine();
			strShapes = Tests.readLine();
			strWordProblems = Tests.readLine();
		con.println("Which of these tests would you like to pick?");
		con.println(strLinear);
		con.println(strQuadradics);
		con.println(strTrig);
		con.println(strShapes);
		con.println(strWordProblems);
		intTestOption = con.readInt();	
		
	}

	}else if(strOption.equalsIgnoreCase("2")){
		while(Scores.eof() == false){
			strName = Scores.readLine();
			strTest = Scores.readLine();
			intPercentage = Scores.readInt();
			con.println(strName);
			con.println(strTest);
			con.println(intPercentage);
			strBack1 = con.readLine();
	}		

	}else if(strOption.equalsIgnoreCase("3")){
		con.println("Thanks for playing Brain Game!");
		con.sleep(1000);
		con.closeConsole();
		
	}else if(strOption.equalsIgnoreCase("4")){
		con.println("Welcome to the help screen.");
		con.println("Each question can either give you a higher or lower percentage mark.");
		con.println("Aim to get every question right");
		con.println("Don’t get under 20% or you will lose and your progress ends there! ");
		con.println("To go back to the main screen type back");
		strBack1 = con.readLine();
		
	}else if(strOption.equalsIgnoreCase("Secret")){
		con.println("Wow!");
		con.println("You found my funny little domain cheater…");
		con.println("While you’re here I might as well tell you one of my hilarious jokes…");
		con.println("...");
		con.println("...");
		con.println("...");
		con.println("Every other number!");
		con.println("Before you go, I have a riddle for you that I've heard may grant a special surprise…");
		con.println("“I’m not a gem, but I’m prized just the same, ");
		con.println("Found by those who travel, i’m part of the game");
		con.println("I’m small and light, but i hold great worth");
		con.println("Collected by wanderers all around the earth");
		con.println("Type your answer in the main menu if you dare…");
		con.println("Type b to go back to main screen.");
		strBack1 = con.readLine();
	}else if(strBack1.equalsIgnoreCase("B")){
		blnBack2 = true;
		
	}else{
		con.println("Invalid option for Brain Game");
		
		
}
}
}
}







		
		
	



