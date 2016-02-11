//Learning to use action listener. Execution code for ActionGUI.java

import javax.swing.JFrame;

public class ActionGUIExecution{

	public static void main (String[] args){
		ActionGUI firstObject= new ActionGUI();
		firstObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstObject.setSize(350,100);
		firstObject.setVisible(true);
		
	}
}
