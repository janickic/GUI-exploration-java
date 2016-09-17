//Password keeper Version 1

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Version1 extends JFrame{
	private JLabel login;
	private JLabel questionMark;
	private JLabel enter;
	private JLabel password;
	private JPasswordField passwordField;
	
	private JButton go;
	
	public Version1(){
		super("Password Keeper - Login");
		getContentPane().setLayout(null); 
		Container background=getContentPane();
		
		//First Frame
		Font loginFont=new Font("Helvetica", Font.ITALIC, 16);
		login= new JLabel("Password Keeper Login");
		login.setFont(loginFont);
		background.add(login);
		login.setBounds(80,-80,400,200); //(x, y, width, height) 
		
		Icon question= new ImageIcon(getClass().getResource("Question.png"));
		questionMark=new JLabel(question);
		background.add(questionMark);
		questionMark.setBounds(0,0,50,50);
		
		Font enterFont= new Font("Tahoma", Font.PLAIN, 12);
		enter=new JLabel ("Please Enter Your Password");
		enter.setFont(enterFont);
		background.add(enter);
		enter.setBounds(100,15,400,100);
		
		password=new JLabel("Password:");
		background.add(password);
		password.setBounds(80,50,100,100);
		
		passwordField=new JPasswordField(10);
		background.add(passwordField);
		passwordField.setBounds(170,90,90,25);
		
		go= new JButton("Go");
		background.add(go); 
		go.setBounds(100,120, 90,25);
		
		HandlerClass handler=new HandlerClass();
		go.addActionListener(handler);
		

	}
	

	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, "Hello");
		}
	}
					
}