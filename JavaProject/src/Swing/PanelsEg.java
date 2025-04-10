package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelsEg {

	public static void main(String[] args) {

		//JPanel = a GUI component that functions as container to hold other components
		
		ImageIcon icon = new ImageIcon("C:\\Users\\Dnyanesh\\eclipse-workspace\\JavaProject\\src\\logo.png");
		Image scaledImage = icon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(scaledImage);
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(scaledIcon);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(0, 250, 250, 250);
		
		JPanel greenPanel= new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(250, 0, 250, 250);
		
		JPanel yelowPanel = new JPanel();
		yelowPanel.setBackground(Color.yellow);
		yelowPanel.setBounds(250, 250, 250, 250);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		frame.add(greenPanel);
		redPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(yelowPanel);
	}

}
