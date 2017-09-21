package monster.model;

public class MarshmallowMonster 
{
	//Declaration section for the data members
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	//this was the creation of data member(objects) so that we can store values in them. 
	public MarshmallowMonster()
	{
		//Unless specified values, all date members are a zero, false, or null. 
		//nothing changes
	}
	
	public MarshmallowMonster(String name, int eyeCount, int arms, double tentacleCount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;
		//allows this values to change and be interacted with
	}
	// this helps retrieve certain values.
	public String getName()
	{
		return name;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public double getTentacleAmount()
	{
		return tentacleAmount;
	}
	
	public boolean hasBloop()
	{
		return hasBloop;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setArmCount (int armCount)
	{
		this.armCount = armCount;
	}
	
	public void setTentacleAmount(double tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
	}
	
	public void setBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
	}
	//this sets new values
	
	public String toString()
	{
		String description = "Hi, I am a sweet monster! My name is "+ name + ", and I have " + eyeCount;
		description += " eyes and I have " + armCount + " arms, and I have " + tentacleAmount +" tentacles";
		description += " And my bloop existence is " + hasBloop; 
		
		return description;
		//this brings up dialog. 
	}
}
