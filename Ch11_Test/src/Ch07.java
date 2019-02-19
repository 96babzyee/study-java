import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ch07 extends JFrame {
	private JSlider slider = new JSlider(JSlider.HORIZONTAL,1,100,56);
	private JLabel la = new JLabel("  I Love Java  ");
	
	public Ch07() {
		setTitle("Ch07");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(slider, BorderLayout.NORTH);
		c.add(la, BorderLayout.CENTER);
		
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		
		la.setFont(new Font("Arial",Font.PLAIN,slider.getValue()));
		la.setHorizontalAlignment(JLabel.CENTER);
		la.setOpaque(true);
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider slider = (JSlider)e.getSource();
				la.setFont(new Font("Arial",Font.PLAIN,slider.getValue()));
			}
		});
		
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ch07();
	}

}
