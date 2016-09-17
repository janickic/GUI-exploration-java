//Excution for all versions

import javax.swing.JFrame;

public class VersionExecution{

	public static void main (String[] args){
		Version1 firstObject= new Version1(); //Edit Version number here to test different versions
		firstObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstObject.setSize(400,200);
		firstObject.setVisible(true);
	
	}
}