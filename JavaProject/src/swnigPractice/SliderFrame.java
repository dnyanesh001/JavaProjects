package swnigPractice;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame implements  ChangeListener{

	//JSlider = GUI component that lets user enter a value
	//			by using an adjustable sliding knob on a track
	
	JSlider slider;
	JFrame frame;
	JPanel panel;
	JLabel label;
	SliderFrame(){
		
		
		slider = new JSlider(0,100,50);	
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		
		panel.add(slider);	
		panel.add(label);
		frame.add(panel);
		frame.setSize(420, 420);
		frame.setVisible(true);
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.addChangeListener(this);
	
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		slider.setFont(new Font("Mv Boli", Font.PLAIN,15));
		slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText("°C = "+slider.getValue());
		label.setFont(new Font("Mv Boli", Font.PLAIN,15));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("°C = "+slider.getValue());
		
	}
	
}
