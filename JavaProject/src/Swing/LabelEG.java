package Swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LabelEG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageIcon image = new ImageIcon("C:\\Users\\Dnyanesh\\eclipse-workspace\\JavaProject\\src\\background.png");
		image.setDescription("The RoyalCoder");
		Border border = BorderFactory.createLineBorder(Color.green,5);
		
		JLabel label = new JLabel();//create a label
		label.setText("Do you like code, Then I love your effort");//set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //Set text left, center, right of imageicon
		label.setForeground(new Color(0xffffff));//set font color of text
		label.setFont(new Font("MV Voli", Font.PLAIN, 20));//set  font of text
		label.setVerticalTextPosition(JLabel.CENTER);// set text top, center, bottom of image icon
		label.setBackground(Color.black);// set background color 
		label.setOpaque(true);// display background color 
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);// vertical alignment of text and Icon
		label.setHorizontalAlignment(JLabel.CENTER);// set Horizontal alignment of text and Icon
//		label.setBounds(100, 100, 400, 250);// set x,y  position within frame as well as dimensions
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500,500);
//		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
	}

}
