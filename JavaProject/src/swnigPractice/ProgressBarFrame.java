package swnigPractice;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarFrame {
	//progress bar = Visual aid to let the user know that an operation is processing
	
	JProgressBar bar;
	JFrame frame;
	ProgressBarFrame(){
		bar = new JProgressBar();
		frame = new JFrame();
		
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("Roboto", Font.BOLD,20));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int counter = 100;
		
		while(counter>0) {
			bar.setValue(counter);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			counter -=1;
		}
		bar.setString("Done :)");
	}
	
}
