package swnigPractice;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogBoxesEg {

	public static void main(String[] args) {

		// JOptionPane = pop up a standard dialog box that prompts users for a value
		// or informs them of something

//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE);

//		int output = JOptionPane.showConfirmDialog(null, "This is my message", "This is my title",
//				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
//		System.out.println(output);
//		JOptionPane.showConfirmDialog(null, "This is my message", "This is my title", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showConfirmDialog(null, "This is my message", "This is my title", JOptionPane.NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showConfirmDialog(null, "This is my message", "This is my title", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);

//		String name = JOptionPane.showInputDialog("what is your name?: ");
//		System.out.println(name);

		String[] responses = { "No, You're awesome!", "Thank you!", "*blush" };
		ImageIcon icon = new ImageIcon("C:\\Users\\Dnyanesh\\eclipse-workspace\\JavaProject\\src\\logo.png");
		Image scaledIcon = icon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon buttonback = new ImageIcon(scaledIcon);
		JOptionPane.showOptionDialog(null, "Welcome Dnyanesh", "hii", JOptionPane.YES_OPTION,
				JOptionPane.INFORMATION_MESSAGE, buttonback, responses, 0);
	}

}
