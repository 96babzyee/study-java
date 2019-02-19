import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex05 extends JFrame {
	private JLabel la = new JLabel("Love Java");
	
	public Ex05() {
		setTitle("Ex05");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		la.setFont(new Font("Arial",Font.PLAIN, 10));
		
		c.add(la);
		la.addKeyListener(new Ex05Listener());
		
		setSize(350,150);
		setVisible(true);
		
		la.setFocusable(true);
		la.requestFocus();
	}
	
	class Ex05Listener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar()=='+') {
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("Arial",Font.PLAIN, size+5));
			}
			else if(e.getKeyChar()=='-') {
				Font f = la.getFont();
				int size = f.getSize();
				if(size <= 5)
					return;
				la.setFont(new Font("TimesRoman", Font.PLAIN, size-5)); 
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

}
