//Part 1, creating a GUI object and making a new class to run in (Part 2: GUISubclass.java)

import javax.swing.JFrame;

public class GUISuper {

	public static void main(String[] args){
		
		GUISubclass firstObject= new GUISubclass();
		firstObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstObject.setSize(275,180);
		firstObject.setVisible(true);
	}

}
