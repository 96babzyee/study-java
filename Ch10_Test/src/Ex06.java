import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex06 extends JFrame{
	private JLabel la = new JLabel("c");
	
	public Ex06() {
		setTitle("Ex06");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(la);
		c.addMouseListener(new Ex06Listener());
		
		la.setLocation(100, 100);
		la.setSize(10,10);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class Ex06Listener extends MouseAdapter {
		public void mouseReleased(MouseEvent e) {
			int x=(int)(Math.random()*250+10);
			int y=(int)(Math.random()*240+10);
			la.setLocation(x, y);
		} 
	}
	
	public static void main(String[] args) {
		new Ex06();
	}

}
