//Learning to use Action Listener. The execution code is ActionGUIExcecution.java

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;



public class ActionGUI extends JFrame{

	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField password1;
	
	public ActionGUI(){
		//constructor
		super("The title");
		setLayout(new FlowLayout());
		
		item1= new JTextField(10);
		add(item1);
		
		item2= new JTextField("enter text here");
		add(item2);
		
		item3= new JTextField("uneditable", 20);
		item3.setEditable(false);
		add(item3);
		
		password1= new JPasswordField("mypassword");
		add(password1);
		
		handler handlerObject= new handler();
		item1.addActionListener(handlerObject);
		item2.addActionListener(handlerObject);
		item3.addActionListener(handlerObject);
		password1.addActionListener(handlerObject);
		
	}

	private class handler implements ActionListener{
		//handles the events
		
		public void actionPerformed(ActionEvent event){
			String string="";
			
			if(event.getSource()==item1){
				string=String.format("feild 1: %s", event.getActionCommand());
			}else if(event.getSource()==item2){
				string=String.format("feild 2: %s", event.getActionCommand());
			}else if(event.getSource()==item3){
				string=String.format("feild 3: %s", event.getActionCommand());
			}else if(event.getSource()==password1){
				string=String.format("password feild is : %s", event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
			
		}
	}
	
}
