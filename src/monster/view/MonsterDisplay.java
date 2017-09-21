package monster.view;

import javax.swing.JOptionPane;//allows gui usage

public class MonsterDisplay 
{
	
	public void displayText(String testToDisplay)//allows text to be displayed
	{
		JOptionPane.showMessageDialog(null, testToDisplay);
	}
	public String getResponse(String questionAsked)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, questionAsked);
		
		return response;
	}
}
