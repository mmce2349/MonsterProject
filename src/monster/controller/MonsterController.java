package monster.controller;

import monster.model.MarshmallowMonster; 

public class MonsterController {
	
	public void start()
	{
			MarshmallowMonster sample = new MarshmallowMonster();
			System.out.println(sample);
			MarshmallowMonster realMonster = new MarshmallowMonster("Bob", 4, 2, 3.5, true);
	}
}
