import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ch05 extends JFrame {
	private JSlider slider = new JSlider(JSlider.HORIZONTAL,100,200,130);
	private JLabel la = new JLabel(" ");
	
	public Ch05() {
		setTitle("Ch05");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		c.add(slider);
		
		la.setText(Integer.toString(slider.getValue()));
		la.setOpaque(true); //투명도
		la.setBackground(Color.GREEN);
		c.add(la);
		
		slider.addChangeListener(new Ch05Listener());
		
		setSize(350,150);
        setVisible(true);
	}
	
	class Ch05Listener implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent e) {
			JSlider slider = (JSlider)e.getSource();
			la.setText(Integer.toString(slider.getValue()));
		}
	}
	
	public static void main(String[] args) {
		new Ch05();
	}

}
