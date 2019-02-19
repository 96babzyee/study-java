import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex04 extends JFrame {
	private JLabel la = new JLabel("Love Java");
	
	public Ex04() {
			setTitle("Ex04");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			la.addKeyListener(new Ex04Listener());
			c.add(la);
			
			setSize(350,150);
			setVisible(true);
			
			la.setFocusable(true);
			la.requestFocus();
		
	}
	class Ex04Listener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				String text  = la.getText();
				String front = text.substring(0,1);
				String last = text.substring(1);
				la.setText(last.concat(front));
			}
		}
	}
		
	public static void main(String[] args) {
		new Ex04();
	}

}
