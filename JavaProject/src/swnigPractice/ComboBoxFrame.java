package swnigPractice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxFrame extends JFrame implements ActionListener{
	
	JComboBox combobox;
	ComboBoxFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String [] animals = {"dog", "cat", "bird"};
		
		combobox = new JComboBox(animals);
		combobox.addActionListener(this);
//		combobox.setEditable(true);
//		combobox.addItem("Horse");
		combobox.insertItemAt("Rabit", 1);
//		combobox.setSelectedIndex(2);
//		combobox.removeItemAt(2);
//		combobox.removeAll();
		
		
		this.add(combobox);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==combobox) {
			System.out.println(combobox.getSelectedItem());
		}
		
	}

}
