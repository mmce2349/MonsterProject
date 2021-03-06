package monster.controller;

import monster.model.MarshmallowMonster; 
import java.util.Scanner;
import monster.view.MonsterDisplay;
import java.util.List;
import java.util.ArrayList;
//Retrieves certain things from other classes

public class MonsterController 
{
	private MonsterDisplay popup;
	private List<MarshmallowMonster> monsterList;
	
	public MonsterController ()
		{
			popup = new MonsterDisplay ();
			monsterList = new ArrayList<MarshmallowMonster>();
		}
	
	public void start()//where coding can begin
	{
//			boolean finished = true;
//			int count = 0;
//			while(count < 100)
//			{
//				popup.displayText("I am so neat! " + count);
//				count++;
//			}
//		
//		for(int looper = 0; looper < 15; looper += 1)
//		{
//			popup.displayText("I am looping " + (looper + 1) + " times out of 15");
//		}
		
			MarshmallowMonster sample = new MarshmallowMonster();
//			System.out.println(sample);
			popup.displayText(sample.toString());
			MarshmallowMonster realMonster = new MarshmallowMonster("Bob", 4, 2, 3.5, true);
			
//			System.out.println(realMonster);
			popup.displayText(realMonster.toString());
//			System.out.println("Mitch is hungry, so he is going to eat a  tentacle");
			popup.displayText("Mitch is hungry, so he is going to eat a  tentacle");
			realMonster.setTentacleAmount(1);
//			System.out.println(realMonster);
			popup.displayText(realMonster.toString());
			
			monsterList.add(realMonster);
			monsterList.add(sample);
			testList();
			
			interactWithTheMonster(realMonster);
			//a series of text and statements followed about user prompting
	}
	private void testList()
	{
		for(int index = 0; index < monsterList.size(); index++)
		{
			MarshmallowMonster currentMonster = monsterList.get(index);
			popup.displayText(currentMonster.getName());
			String newName = popup.getResponse("What should my new name be??");
			currentMonster.setName(newName);
			popup.displayText(currentMonster.getName());
		}
		
		for(MarshmallowMonster current : monsterList)
		{
			popup.displayText(current.getName());
			String newName = popup.getResponse("What should my new new name be?");
			current.setName(newName);
			popup.displayText(current.getName());
		}
	}
	
	private void interactWithTheMonster(MarshmallowMonster currentMonster)// interaction

	{
//		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		popup.displayText(currentMonster.getName() + " wants to know what to eat next");
//		System.out.println(currentMonster.getName() + " suggests arms, they have "+ currentMonster.getArmCount());
		popup.displayText(currentMonster.getName() + " suggests arms, they have "+ currentMonster.getArmCount());
//		System.out.println("How many do you want to eat?");
		int specialAnswer = 0;//interaction through popup menus
		String unconverted = popup.getResponse("How many do you want to eat?");
		
		while(!isValidInteger(unconverted))
		{
			popup.displayText("Try again!");
			unconverted = popup.getResponse("How many arms?????");
		}
		
//		if(isValidInteger(unconverted))
//		{
			specialAnswer = Integer.parseInt(unconverted);
//		}
//		specialAnswer= Integer.parseInt(unconverted);
		while(!isValidInteger(unconverted))
		{
			popup.displayText("I am unsure of what I'm doing");
			unconverted = popup.getResponse("how unsure?");
		}
		
		Scanner myScanner = new Scanner(System.in);
		int consumed = 0;
		String answerNumber = popup.getResponse("Q to ask");
		while(!isValidDouble(answerNumber)) {
			answerNumber = popup.getResponse("you must type in a double human!!!!");
		}
		double validNumber= Double.parseDouble(answerNumber);
		consumed = specialAnswer;
		if(consumed<0)
		{
//			System.out.println("You cannot eat a negative amount silly human");
			popup.displayText("You cannot eat a negative amount silly human");
		}
		else if (consumed == 0)
		{
//			System.out.println("Not that hungry are you?");
			popup.displayText("Not that hungry are you?");
		}
		else if (consumed > currentMonster.getArmCount())
		{
//			System.out.println("That is impossible - I only have " + currentMonster.getArmCount() + " arms!!!");
			popup.displayText("That is impossible - I only have " + currentMonster.getArmCount() + " arms!!!");
		}
		else 
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
//			System.out.println("Thank you so much! I only have this many now: " + currentMonster.getArmCount());
			popup.displayText("Thank you so much! I only have this many now: " + currentMonster.getArmCount());
			
		}
		
//		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		popup.displayText(currentMonster.getName() + " wants to know what to eat next");
//		System.out.println("He suggests eyes next.");
		popup.displayText("He suggests eyes next.");
//		System.out.println("How many eyes do you wanna eat?");
		popup.getResponse("How many eyes do you wanna eat?");
		Scanner my1Scanner = new Scanner(System.in);
		consumed = my1Scanner.nextInt();
		
		
	
		 if (consumed < 0)
		{
//			System.out.println("You can't eat a negative number");
			popup.displayText("You can't eat a negative number");
		}
		 else if (consumed > currentMonster.getEyeCount())
			{
//				System.out.println("Silly, You can't eat more eyes than I have!");
				popup.displayText("Silly, You can't eat more eyes than I have!");
			}
		else if (consumed < currentMonster.getEyeCount()) 
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount()- consumed);
			//System.out.println("Awesome, Now I only have " + currentMonster.getEyeCount());
			popup.displayText("Awesome, Now I only have " + currentMonster.getEyeCount());
			
		}
		
		 popup.displayText("Hey look at me!!!");//first popup display
		String answer = popup.getResponse("How many meals are you eating today");
		System.out.println(answer);
		popup.displayText(answer);
	}
	//Helper Method
	private boolean isValidInteger(String sample)

	{
		boolean valid= false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Only integer values are valid: " + sample + " is not");
		}
		return valid;
	}
	
private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		
		try 
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		
		catch(NumberFormatException error)
		{
			popup.displayText("Only double values are valid: "+ sampleDouble + " is not.");
		}
		return valid;
	}
	
private boolean isValidBoolean(String sampleBoolean)
	{
		boolean valid = false;
		
		try
		{
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
		}
		catch(NumberFormatException error)// catches the program from failure
		{
			popup.displayText("Only boolean values are valid: " + sampleBoolean + " is not.");
		}
		return valid;
	}
}//private booleans help prevent crashes from bad input. 
