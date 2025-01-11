import arc.*;

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
	int intPercentage;
	TextInputFile Tests = new TextInputFile("Tests.txt");
	TextInputFile Scores = new TextInputFile ("highscores.txt");
	
	//Main menu / title screen
	
	
	con.println("Welcome to Brain Game!");
	con.println("");

		
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
		con.println("Rumors say that if you type a “certain percentage”, you can unlock an additional test option. ");
		con.println("To go back to the main screen type back");
		
}
}
}







		
		
	



