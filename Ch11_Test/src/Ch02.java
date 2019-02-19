import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ch02 extends JFrame {
	public Ch02() {
		setTitle("Ch02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField tf = new JTextField(10);
		JComboBox<String> combo = new JComboBox<String>();
		
		c.add(tf);
		c.add(combo);
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField tf = (JTextField)e.getSource();
				combo.addItem(tf.getText());
				tf.setText("");
			}
		});
		
		setSize(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ch02();
	}

}
