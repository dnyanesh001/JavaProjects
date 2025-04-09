package swnigPractice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame implements ActionListener{

	JRadioButton pizzaButton;
	JRadioButton pastaButton;
	JRadioButton paniPuriButton;
	ButtonGroup group;
	
	RadioButtonFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaButton = new JRadioButton("Pizza");
		pastaButton = new JRadioButton("Pasta");
		paniPuriButton = new JRadioButton("PaniPuri");
		
		ButtonGroup group =new ButtonGroup();
		group.add(paniPuriButton);
		group.add(pastaButton);
		group.add(pizzaButton);
		
		pizzaButton.addActionListener(this);
		pastaButton.addActionListener(this);
		paniPuriButton.addActionListener(this);
		
		this.add(paniPuriButton);
		this.add(pastaButton);
		this.add(pizzaButton);
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizzaButton) {
			System.out.println("Yummy Pizza");
		}
		if(e.getSource()==pastaButton) {
			System.out.println("Yummy Pasta");
		}
		if(e.getSource()==paniPuriButton) {
			System.out.println("Yummy PaniPuri");
		}
		
	}

}
