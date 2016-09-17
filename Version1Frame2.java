//Version1, Frame 2
//Password Keeper - Main Frame

//https://www.youtube.com/watch?v=bKPGEqJHWaE
//https://docs.oracle.com/javase/7/docs/api/javax/swing/JDialog.html


import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Version1Frame2 extends JFrame{
	private JLabel name;
	
	
	
	public Version1(){
		super("Password Kepper - Main");
		getContentPane().setLayout(null); 
		Container background=getContentPane();
		
		Font nameFont=new Font("Tahoma", Font.BOLD, 16);
		name= new JLabel("Welcome!");
		name.setFont(nameFont);
		background.add(login);
		name.setBounds(80,-80,400,200); //(x, y, width, height) 
		
		Icon question= new ImageIcon(getClass().getResource("Question.png"));
		questionMark=new JLabel(question);
		background.add(questionMark);
		questionMark.setBounds(0,0,50,50);
		
		
	}
	
		
		
}