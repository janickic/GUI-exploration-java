//Using a the JOptionPane to create a simple GUI that adds two ints together

import javax.swing.JOptionPane;

public class MyGUI2{

	public static void main(String[] args){
		String firstNum=JOptionPane.showInputDialog("Enter first number");
		String secondNum=JOptionPane.showInputDialog("Enter second number");
		
		int num1=Integer.parseInt(firstNum);
		int num2=Integer.parseInt(secondNum);
		int sum=num1+num2;
		
		JOptionPane.showMessageDialog(null, "The sum is "+sum,"the title",JOptionPane.PLAIN_MESSAGE);
		
	}
