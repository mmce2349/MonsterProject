package monster.view;

import javax.swing.JOptionPane;

public class MonsterDisplay 
{
	
	public void displayText(String testToDisplay)
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
