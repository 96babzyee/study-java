import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex03 extends JFrame {
	private JLabel la = new JLabel("Love Java");
	
	public Ex03() {
		setTitle("Ex03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		
		la.addKeyListener(new Ex03Listener());
		
		setSize(350,150);
		setVisible(true);
		
		la.setFocusable(true);
		la.requestFocus();
	}
	
	class Ex03Listener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode()==KeyEvent.VK_LEFT) {
				StringBuffer sb = new StringBuffer(la.getText());
				la.setText(sb.reverse().toString());
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
