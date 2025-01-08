import arc.*;

public class JustinCPT{
	public static void main(String[] args){
		Console con = new Console();
		
	int intOption;
	int intTestOption;
	String strLinear;
	String strQuadradics;
	String strTrig;
	String strShapes;
	String strWordProblems;
	TextInputFile Tests = new TextInputFile("Tests.txt");

	
	//Main menu / title screen
	con.println("MATH GAME");
		
	
		
	con.println("> 1.Play game");
	con.println("> 2.View scores");
	con.println("> 3.Quit game");
	con.println("> 4.Help");
	con.println("To select one of the options, please type the indicated number"); 
	con.println("beside the option you want to choose.");
	
	intOption = con.readInt();
	
	if(intOption == 1){
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
		
		con.println("you suc");
		
			
		
		}
	}
}
}
