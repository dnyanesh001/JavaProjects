package swnigPractice;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxexFrame extends JFrame implements ActionListener{

	JButton button;
	JCheckBox checkbox;
	CheckBoxexFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);
		
		checkbox= new JCheckBox();
		checkbox.setText("I am not robot");
		checkbox.setFocusable(false);
		checkbox.setFont(new Font("Roboto", Font.PLAIN,25));
		
		this.add(checkbox);
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkbox.isSelected());		
			}
		
	}

}
