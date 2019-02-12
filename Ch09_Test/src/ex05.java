import java.awt.*;
import javax.swing.*;

public class ex05 extends JFrame {
	public ex05() {
		setTitle("4X4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));
		
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
						  Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
						  Color.PINK, Color.BLACK,Color.RED, Color.ORANGE,
						  Color.YELLOW,Color.BLUE, Color.MAGENTA, Color.GRAY};
		
		JLabel[] la = new JLabel[16];
		
		for(int i=0; i<la.length; i++) {
			la[i] = new JLabel(Integer.toString(i));
			la[i].setOpaque(true);
			la[i].setBackground(color[i]);
			c.add(la[i]);
		}
		
		setSize(600,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ex05();
	}

}
