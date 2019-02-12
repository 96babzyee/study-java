import java.awt.*;
import javax.swing.*;

public class ex04 extends JFrame{
	public ex04() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		
		JButton [] btn = new JButton [10];
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, 
						  Color.GREEN, Color.CYAN, Color.BLUE, 
						  Color.MAGENTA, Color.GRAY, Color.PINK, 
						  Color.BLACK}; 

		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
		setSize(800,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ex04();
	}

}
