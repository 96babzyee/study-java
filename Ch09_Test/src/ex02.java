import java.awt.*;
import javax.swing.*;

public class ex02 extends JFrame{
		public ex02() {
			setTitle("BorderLayout Practice");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container c = getContentPane();
			
			c.setLayout(new BorderLayout(5,7));
			c.add(new JButton("CENTER"), BorderLayout.CENTER);
			c.add(new JButton("NORTH"), BorderLayout.NORTH);
			c.add(new JButton("SOUTH"), BorderLayout.SOUTH);
			c.add(new JButton("EAST"), BorderLayout.EAST);
			c.add(new JButton("WEST"), BorderLayout.WEST);
			
			setSize(400,300);
			setVisible(true);
		}
	public static void main(String[] args) {
		new ex02();
	}

}
