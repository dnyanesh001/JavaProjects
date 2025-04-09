package Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
 

public class JButtonEG extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	JButtonEG(){
		
		ImageIcon icon = new ImageIcon("C:\\Users\\Dnyanesh\\eclipse-workspace\\JavaProject\\src\\logo.png");
		Image scaledIcon = icon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon buttonback= new ImageIcon(scaledIcon);
		ImageIcon icon2 = new ImageIcon("C:\\Users\\Dnyanesh\\eclipse-workspace\\JavaProject\\src\\background.png");
		Image scaledIcon2 = icon2.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon buttonback2= new ImageIcon(scaledIcon2);
		
		label = new JLabel();
		label.setIcon(buttonback2);
		label.setBounds(0,0, 150, 150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(200, 100, 250, 100);
		button.addActionListener(e -> label.setVisible(true));
		button.setText("I am button!");
		button.setFocusable(false);
		button.setIcon(buttonback);
		button.setVerticalTextPosition(button.CENTER);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setHorizontalTextPosition(button.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			label.setVisible(true);
		}
	}


}
