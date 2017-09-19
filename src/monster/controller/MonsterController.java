package monster.controller;

import monster.model.MarshmallowMonster; 
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController 
{
	private MonsterDisplay popup;
	
	public MonsterController ()
		{
			popup = new MonsterDisplay ();
		}
	
	public void start()
	{
			MarshmallowMonster sample = new MarshmallowMonster();
			System.out.println(sample);
			MarshmallowMonster realMonster = new MarshmallowMonster("Bob", 4, 2, 3.5, true);
			
			System.out.println(realMonster);
			System.out.println("Mitch is hungry, so he is going to eat a  tentacle");
			realMonster.setTentacleAmount(1);
			System.out.println(realMonster);
			
			interactWithTheMonster(realMonster);
			
	}
	
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		System.out.println(currentMonster.getName() + " suggests arms, they have "+ currentMonster.getArmCount());
		System.out.println("How many do you want to eat?");
		Scanner myScanner = new Scanner(System.in);
		int consumed = myScanner.nextInt();
		
		if(consumed<0)
		{
			System.out.println("You cannot eat a negative amount silly human");
			consumed = 0;
		}
		else if (consumed == 0)
		{
			System.out.println("Not that hungry are you?");
		}
		else if (consumed > currentMonster.getArmCount())
		{
			System.out.println("That is impossblie - I only have " + currentMonster.getArmCount() + " arms!!!");
		}
		else 
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			System.out.println("Thank you so much! I only have this many now: " + currentMonster.getArmCount());
			
		}
		
		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		System.out.println("He suggests eyes next.");
		System.out.println("How many eyes do you wanna eat?");
		Scanner my1Scanner = new Scanner(System.in);
		consumed = my1Scanner.nextInt();
		
		
	
		 if (consumed < 0)
		{
			System.out.println("You can't eat a negative number");
		}
		 else if (consumed > currentMonster.getEyeCount())
			{
				System.out.println("Silly, You can't eat more eyes than I have!");
			}
		else if (consumed < currentMonster.getEyeCount()) 
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount()- consumed);
			System.out.println("Awesome, Now I only have " + currentMonster.getEyeCount());
			
		}
		
		
	}
}
