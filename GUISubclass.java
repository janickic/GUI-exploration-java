//Part 2, creating a GUI object and making a new class to run in (Part 1: GUISuper.java)

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GUISubclass extends JFrame{

	private JLabel item1;
	
	public GUISubclass(){
		super("The title bar"); //title
		setLayout(new FlowLayout()); //default layout
		
		item1= new JLabel("This is a sentence");
		item1.setToolTipText("This is going to show up on hover");
		add(item1);
		
		
	}


}
