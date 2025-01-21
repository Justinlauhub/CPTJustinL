import arc.*;
import java.awt.*;
import java.awt.image.*;
public class JustinCPT{
	public static void main(String[] args){
		Console con = new Console(1280, 720);	
	//Variables		
	String strOption;
	String strTestOption;
	String strLinear;
	String strQuadradics;
	String strTrig;
	String strBMath;
	String strTest;
	String strName;
	boolean blnBack;
	String strChoice;
	int intRandom;
	int intRCount;
	int inti;
	int intj;
	String strBack;
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
	//File IO
	TextInputFile Tests = new TextInputFile("Tests.txt");
	TextInputFile Scores = new TextInputFile ("highscores.txt");
	TextInputFile Linear = new TextInputFile ("Linear.txt");
	TextInputFile Quadradics = new TextInputFile ("Quadradics.txt");
	TextInputFile Trig = new TextInputFile ("Trig.txt");
	TextInputFile BasicMath = new TextInputFile("BasicM.txt");	
	TextOutputFile Pastescores = new TextOutputFile("highscores.txt",true);

	//Initializing variables
	int intCountQ = 0;
	int intRow;
	int intCorrectAnswers = 0;
	int intPercentage = 0;
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
		con.clear();
	}
	Tests.close();
	//If player presses 1	
	}if(strTestOption.equalsIgnoreCase("1")){
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
		}
		for(inti = 0; inti < intCountQ; inti++){
			intArrRandom [inti] = (int)(Math.random() * 100 + 1);
		}
	     // Bubble Sort: Sorting questions based on random numbers
         for (int i = 0; i < intCountQ - 1; i++) {
         for (int j = 0; j < intCountQ - i - 1; j++) {
         if (intArrRandom[j] > intArrRandom[j + 1]) {
         // Swap random numbers
         int tempNum = intArrRandom[j];
         intArrRandom[j] = intArrRandom[j + 1];
         intArrRandom[j + 1] = tempNum;

         // Swap corresponding questions and answers
         String tempQuestion = strArrBmath[j][0];
         strArrBmath[j][0] = strArrBmath[j + 1][0];
         strArrBmath[j + 1][0] = tempQuestion;

         String tempAnswer1 = strArrBmath[j][1];
         strArrBmath[j][1] = strArrBmath[j + 1][1];
         strArrBmath[j + 1][1] = tempAnswer1;

         String tempAnswer2 = strArrBmath[j][2];
         strArrBmath[j][2] = strArrBmath[j + 1][2];
         strArrBmath[j + 1][2] = tempAnswer2;

         String tempAnswer3 = strArrBmath[j][3];
         strArrBmath[j][3] = strArrBmath[j + 1][3];
         strArrBmath[j + 1][3] = tempAnswer3;
         }
     }
}
            for(intRow = 0; intRow < intCountQ; intRow++){
			con.println(strName);
			con.println("Basic math test");
			con.println(intPercentage+"%");
			con.println("");
			con.println("");
			con.println("");
			con.println(strArrBmath[intRow][0]);
			con.println("Type your answer");
			strChoice = con.readLine();
		
			
		if(strChoice.equalsIgnoreCase(strArrBmath[intRow][1])||strChoice.equalsIgnoreCase(strArrBmath [intRow][2])||strChoice.equalsIgnoreCase(strArrBmath [intRow][3])){
			con.println("Correct!");
			con.sleep(3000);
			con.clear();	
			intCorrectAnswers = intCorrectAnswers + 1;
			intPercentage = (intCorrectAnswers * 100) / intCountQ ;
			
	
		}else{
			con.println("Incorrect! the correct answer is "+strArrBmath[intRow][1]);

		}		
		//BasicMath.close();
		blnBack = false;
		
	}
	intPercentage = (intCorrectAnswers * 100) / intCountQ ;
		con.println("Congrats you completed the test!");
		con.println("Here are your results:");
		con.println(strName);
		con.println("Basic math test");
		con.println(intPercentage+"%");
		con.println("To go back type b and enter key");

	
		
	

		
		
	}else if(strTestOption.equalsIgnoreCase("2")){
	while(Linear.eof() == false){
			strQuestion[1] = Linear.readLine();
			strAnswer[1] = Linear.readLine();
			strAnswer2[1] = Linear.readLine();
			strAnswer3[1] = Linear.readLine();
			intCountQ = intCountQ + 1;				
		}
		Linear.close();
		Linear = new TextInputFile("Linear.txt");
			for(intRow = 0; intRow < intCountQ; intRow++){
			strArrLinear[intRow][0] = Linear.readLine();
			strArrLinear[intRow][1] = Linear.readLine();
			strArrLinear[intRow][2] = Linear.readLine();
			strArrLinear[intRow][3] = Linear.readLine();
		}
		for(inti = 0; inti < intCountQ; inti++){
			intArrRandom [inti] = (int)(Math.random() * 100 + 1);
		}
	     // Bubble Sort: Sorting questions based on random numbers
         for (int i = 0; i < intCountQ - 1; i++) {
         for (int j = 0; j < intCountQ - i - 1; j++) {
         if (intArrRandom[j] > intArrRandom[j + 1]) {
         // Swap random numbers
         int tempNum = intArrRandom[j];
         intArrRandom[j] = intArrRandom[j + 1];
         intArrRandom[j + 1] = tempNum;

         // Swap corresponding questions and answers
         String tempQuestion = strArrLinear[j][0];
         strArrLinear[j][0] = strArrLinear[j + 1][0];
         strArrLinear[j + 1][0] = tempQuestion;

         String tempAnswer1 = strArrLinear[j][1];
         strArrLinear[j][1] = strArrLinear[j + 1][1];
         strArrLinear[j + 1][1] = tempAnswer1;

         String tempAnswer2 = strArrLinear[j][2];
         strArrLinear[j][2] = strArrLinear[j + 1][2];
         strArrLinear[j + 1][2] = tempAnswer2;

         String tempAnswer3 = strArrLinear[j][3];
         strArrLinear[j][3] = strArrLinear[j + 1][3];
         strArrLinear[j + 1][3] = tempAnswer3;
         }
     }
}
            for(intRow = 0; intRow < intCountQ; intRow++){
			con.println(strName);
			con.println("Linear test");
			con.println(intPercentage+"%");
			con.println("");
			con.println("");
			con.println("");
			con.println(strArrLinear[intRow][0]);
			con.println("Type your answer");
			strChoice = con.readLine();
		
			
		if(strChoice.equalsIgnoreCase(strArrLinear[intRow][1]) || strChoice.equalsIgnoreCase(strArrLinear[intRow][2]) || strChoice.equalsIgnoreCase(strArrLinear[intRow][3])){
			con.println("Correct!");
			con.sleep(3000);
			con.clear();	
			intCorrectAnswers = intCorrectAnswers + 1;
			intPercentage = (intCorrectAnswers * 100) / intCountQ ;
			
	
		}else{
			con.println("Incorrect! the correct answer is "+strArrLinear[intRow][1]);
			con.sleep(3000);
			con.clear();

		}		
		//BasicMath.close();
		blnBack = false;
		
	}
	intPercentage = (intCorrectAnswers * 100) / intCountQ ;
		con.println("Congrats you completed the test!");
		con.println("Here are your results:");
		con.println(strName);
		con.println("Linear test");
		con.println(intPercentage+"%");
		con.println("To go back type b and enter key");
		strBack = con.readLine();
		if(strBack.equalsIgnoreCase("b")){
			blnBack = true;
			con.clear();
	}
	}else if(strTestOption.equalsIgnoreCase("3")){
	while(Quadradics.eof() == false){
			strQuestion[2] = Quadradics.readLine();
			strAnswer[2] = Quadradics.readLine();
			strAnswer2[2] = Quadradics.readLine();
			strAnswer3[2] = Quadradics.readLine();
			intCountQ = intCountQ + 1;				
		}
		Quadradics.close();
		Quadradics = new TextInputFile("Quadradics.txt");
			for(intRow = 0; intRow < intCountQ; intRow++){
			strArrQuadradics[intRow][0] = Quadradics.readLine();
			strArrQuadradics[intRow][1] = Quadradics.readLine();
			strArrQuadradics[intRow][2] = Quadradics.readLine();
			strArrQuadradics[intRow][3] = Quadradics.readLine();
		}
		for(inti = 0; inti < intCountQ; inti++){
			intArrRandom [inti] = (int)(Math.random() * 100 + 1);
		}
	     // Bubble Sort: Sorting questions based on random numbers
         for (int i = 0; i < intCountQ - 1; i++) {
         for (int j = 0; j < intCountQ - i - 1; j++) {
         if (intArrRandom[j] > intArrRandom[j + 1]) {
         // Swap random numbers
         int tempNum = intArrRandom[j];
         intArrRandom[j] = intArrRandom[j + 1];
         intArrRandom[j + 1] = tempNum;

         // Swap corresponding questions and answers
         String tempQuestion = strArrQuadradics[j][0];
         strArrQuadradics[j][0] = strArrQuadradics[j + 1][0];
         strArrQuadradics[j + 1][0] = tempQuestion;

         String tempAnswer1 = strArrQuadradics[j][1];
         strArrQuadradics[j][1] = strArrQuadradics[j + 1][1];
         strArrQuadradics[j + 1][1] = tempAnswer1;

         String tempAnswer2 = strArrQuadradics[j][2];
         strArrQuadradics[j][2] = strArrQuadradics[j + 1][2];
         strArrQuadradics[j + 1][2] = tempAnswer2;

         String tempAnswer3 = strArrQuadradics[j][3];
         strArrQuadradics[j][3] = strArrQuadradics[j + 1][3];
         strArrQuadradics[j + 1][3] = tempAnswer3;
         }
     }
}
            for(intRow = 0; intRow < intCountQ; intRow++){
			con.println(strName);
			con.println("Quadradics test");
			con.println(intPercentage+"%");
			con.println("");
			con.println("");
			con.println("");
			con.println(strArrQuadradics[intRow][0]);
			con.println("Type your answer");
			strChoice = con.readLine();
		
			
		if(strChoice.equalsIgnoreCase(strArrQuadradics[intRow][1]) || strChoice.equalsIgnoreCase(strArrQuadradics[intRow][2]) || strChoice.equalsIgnoreCase(strArrQuadradics[intRow][3])){
			con.println("Correct!");
			con.sleep(3000);
			con.clear();	
			intCorrectAnswers = intCorrectAnswers + 1;
			intPercentage = (intCorrectAnswers * 100) / intCountQ ;
			
	
		}else{
			con.println("Incorrect! the correct answer is "+strArrQuadradics[intRow][1]);
			con.sleep(3000);
			con.clear();

		}		
		//BasicMath.close();
		blnBack = false;
		
	}
	intPercentage = (intCorrectAnswers * 100) / intCountQ ;
		con.println("Congrats you completed the test!");
		con.println("Here are your results:");
		con.println(strName);
		con.println("Quadradics test");
		con.println(intPercentage+"%");
		con.println("To go back type b and enter key");
		strBack = con.readLine();
		if(strBack.equalsIgnoreCase("b")){
			con.println("Score succesfully saved to scores file");
			Pastescores.println(strName);
			Pastescores.println("Quadradics test");
			Pastescores.println(intPercentage);
			Pastescores.close();
			con.sleep(2000);
			blnBack = true;
			con.clear();
		}else{
			con.println("Invalid option");
			
	}
	}else if(strTestOption.equalsIgnoreCase("4")){
	while(Trig.eof() == false){
			strQuestion[3] = Trig.readLine();
			strAnswer[3] = Trig.readLine();
			strAnswer2[3] = Trig.readLine();
			strAnswer3[3] = Trig.readLine();
			intCountQ = intCountQ + 1;				
		}
		Trig.close();
		Trig = new TextInputFile("Quadradics.txt");
			for(intRow = 0; intRow < intCountQ; intRow++){
			strArrTrig[intRow][0] = Trig.readLine();
			strArrTrig[intRow][1] = Trig.readLine();
			strArrTrig[intRow][2] = Trig.readLine();
			strArrTrig[intRow][3] = Trig.readLine();
		}
		for(inti = 0; inti < intCountQ; inti++){
			intArrRandom [inti] = (int)(Math.random() * 100 + 1);
		}
	     // Bubble Sort: Sorting questions based on random numbers
         for (int i = 0; i < intCountQ - 1; i++) {
         for (int j = 0; j < intCountQ - i - 1; j++) {
         if (intArrRandom[j] > intArrRandom[j + 1]) {
         // Swap random numbers
         int tempNum = intArrRandom[j];
         intArrRandom[j] = intArrRandom[j + 1];
         intArrRandom[j + 1] = tempNum;

         // Swap corresponding questions and answers
         String tempQuestion = strArrTrig[j][0];
         strArrTrig[j][0] = strArrTrig[j + 1][0];
         strArrTrig[j + 1][0] = tempQuestion;

         String tempAnswer1 = strArrTrig[j][1];
         strArrTrig[j][1] = strArrTrig[j + 1][1];
         strArrTrig[j + 1][1] = tempAnswer1;

         String tempAnswer2 = strArrTrig[j][2];
         strArrTrig[j][2] = strArrTrig[j + 1][2];
         strArrTrig[j + 1][2] = tempAnswer2;

         String tempAnswer3 = strArrTrig[j][3];
         strArrTrig[j][3] = strArrTrig[j + 1][3];
         strArrTrig[j + 1][3] = tempAnswer3;
         }
     }
}
            for(intRow = 0; intRow < intCountQ; intRow++){
			con.println(strName);
			con.println("Trigonometry test");
			con.println(intPercentage+"%");
			con.println("");
			con.println("");
			con.println("");
			con.println(strArrTrig[intRow][0]);
			con.println("Type your answer");
			strChoice = con.readLine();
		
			
		if(strChoice.equalsIgnoreCase(strArrTrig[intRow][1]) || strChoice.equalsIgnoreCase(strArrTrig[intRow][2]) || strChoice.equalsIgnoreCase(strArrTrig[intRow][3])){
			con.println("Correct!");
			con.sleep(3000);
			con.clear();	
			intCorrectAnswers = intCorrectAnswers + 1;
			intPercentage = (intCorrectAnswers * 100) / intCountQ ;
			
	
		}else{
			con.println("Incorrect! the correct answer is "+strArrTrig[intRow][1]);
			con.sleep(3000);
			con.clear();

		}		
		//BasicMath.close();
		blnBack = false;
		
	}
	intPercentage = (intCorrectAnswers * 100) / intCountQ ;
		con.println("Congrats you completed the test!");
		con.println("Here are your results:");
		con.println(strName);
		con.println("Trig test");
		con.println(intPercentage+"%");
		con.println("To go back type b and enter key");
		strBack = con.readLine();
		if(strBack.equalsIgnoreCase("b")){
			con.println("Score succesfully saved to scores file");
			Pastescores.println(strName);
			Pastescores.println("Quadradics test");
			Pastescores.println(intPercentage);
			Pastescores.close();
			con.sleep(2000);
			blnBack = true;
			con.clear();
		}else{
			con.println("Invalid option");
			
	}
	
	
		
		
	
	//View highscores
	}else if(strOption.equalsIgnoreCase("V")){
		while(Scores.eof() == false){
			strName = Scores.readLine();
			strTest = Scores.readLine();
			intPercentage = Scores.readInt();
			con.println("Highscores: ");
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













		
		
	



