//Learning how to  create buttons. Executes ButtonGUI.java

import javax.swing.JFrame;

public class ButtonGUIExecution{

	public static void main (String[] args){
		ButtonGUI firstObject= new ButtonGUI();
		firstObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstObject.setSize(500,400);
		firstObject.setVisible(true);
	
	}
}
