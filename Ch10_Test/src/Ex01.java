import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex01 extends JFrame{
	private JLabel la = new JLabel("Love Java");
	
	public Ex01() {
		setTitle("Ex01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		la.addMouseListener(new Ex01Listener());
		c.add(la);
		
		setSize(350,150);
		setVisible(true);
	}
	
	class Ex01Listener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			la.setText("Love Java");
		}

		public void mouseExited(MouseEvent e) {
			la.setText("사랑해");
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
