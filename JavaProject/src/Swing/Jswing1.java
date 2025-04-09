package Swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jswing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();// creates a frame
		frame.setTitle("JFrame title goes here");//writes the title for application at the top
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//enable close fun of application
		frame.setResizable(false);// prevent from change in size of frame
		frame.setSize(420,420);//sets the x- dimension, and y- dimension of frame 
		frame.setVisible(true);//make frame visible
		ImageIcon image = new ImageIcon("C:\\Users\\Dnyanesh\\eclipse-workspace\\JavaProject\\src\\logo.png");// create an imageIcon
		frame.setIconImage(image.getImage());// change icon of frame
		frame.getContentPane().setBackground(new Color(150,150,250));//change color of background
		
	}

}
