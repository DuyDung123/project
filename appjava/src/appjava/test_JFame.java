package appjava;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class test_JFame extends JFrame {
	public test_JFame() throws HeadlessException{
		setSize(400,400);
		setVisible(true);
	}
	
	public static  void main(String[] args) {
		new test_JFame().setVisible(true); 
	}
}
