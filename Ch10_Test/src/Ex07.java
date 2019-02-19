import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex07 extends JFrame {
	public Ex07() {
		JLabel la = new JLabel("Love Java");
		setTitle("Ex07");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		
		la.setFont(new Font("Arial",Font.PLAIN, 10));
		
		c.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if(n<0) {
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("Arial",Font.PLAIN, size-5));
				}
				else {
//					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("Arial",Font.PLAIN, size+5));
				}
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex07();
	}

}
