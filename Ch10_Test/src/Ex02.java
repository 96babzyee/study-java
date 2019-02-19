import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex02 extends JFrame{
	public Ex02() {
		setTitle("Ex02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		
		Ex02Listener lis = new Ex02Listener();
		c.addMouseListener(lis);
		c.addMouseMotionListener(lis);
		
		setSize(350,200);
		setVisible(true);
	}
	
	class Ex02Listener extends MouseAdapter {
		public void mouseDragged(MouseEvent e) {
			Component c =(Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		public void mouseReleased(MouseEvent e) {
			Component c =(Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
	
}
