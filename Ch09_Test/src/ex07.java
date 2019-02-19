import java.awt.*;
import javax.swing.*;

class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		add(new JLabel("수식입력"));
		add(new JTextField(16));
		setLayout(new FlowLayout());
	}
}

class CenterPanel extends JPanel{
	JButton b[] = {new JButton("+"),new JButton("-"),new JButton("x"),new JButton("/")};
	public CenterPanel() {
		setLayout(new GridLayout(4,4,2,2));
		for (int i=0;i<10;i++) 
			add(new JButton(Integer.toString(i)));
		
		add(new JButton("CE"));
		add(new JButton("계산"));
	
	
		for(int i=0;i<b.length; i++) {
		b[i].setBackground(Color.CYAN);
		add(b[i]);
		}
	}
}


class SouthPanel extends JPanel{
	public SouthPanel() {
		setBackground(Color.YELLOW);
		add(new JLabel("계산결과"));
		add(new JTextField(16));
		setLayout(new FlowLayout());
	}
}

public class ex07 extends JFrame {
	public ex07() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		setSize(300,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ex07();
	}
}



