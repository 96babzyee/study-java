import java.awt.*;
import javax.swing.*;

public class ex06 extends JFrame {
	ex06(){
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<20;i++) {
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			JLabel la = new JLabel();
			la.setLocation(x, y);
			la.setSize(10,10);
			la.setOpaque(true);
			la.setBackground(Color.blue);
			c.add(la);
		}
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ex06();
	}

}
