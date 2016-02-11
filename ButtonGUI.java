//Learning how to make custom buttons. The exectution code is ButtonGUIExecution.java

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class ButtonGUI extends JFrame{
	private JButton regular;
	private JButton custom;
	
	public ButtonGUI(){
		//constructor
		super("The title");
		setLayout(new FlowLayout());
		
		regular= new JButton("Regular Button");
		add(regular);
		
		//Buttons40x40 in a png file
		
		Icon cat= new ImageIcon(getClass().getResource("cat.png"));
		Icon dog= new ImageIcon(getClass().getResource("dog.png"));
		
		custom=new JButton("Custom", cat);
		custom.setRolloverIcon(dog);
		add(custom);
		
		
		HandlerClass handler=new HandlerClass();
		regular.addActionListener(handler);
		custom.addActionListener(handler);
		
	}
	
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
	}
	
	
}
