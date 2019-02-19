import java.awt.*;
import javax.swing.*;

class NorthPanel1 extends JPanel{
	public NorthPanel1() {
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
		setLayout(new FlowLayout());
	}
}

class CenterPanel1 extends JPanel {
	public CenterPanel1() {
		setBackground(Color.WHITE);
		setLayout(null);
		for(int i=0; i<10; i++) {
			JLabel la = new JLabel("*");
			la.setSize(10,10);
			la.setForeground(Color.RED);
			la.setLocation((int)(Math.random()*200+10), (int)(Math.random()*200+10));
			
			add(la);
		}
	}
}

class SouthPanel1 extends JPanel {
	public SouthPanel1() {
		setBackground(Color.YELLOW);
		add(new JLabel("Word Input"));
		add(new JTextField(16));
		setLayout(new FlowLayout());
	}
}

public class ex08 extends JFrame {
	public ex08() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.add(new NorthPanel1(), BorderLayout.NORTH);
		c.add(new CenterPanel1(), BorderLayout.CENTER);
		c.add(new SouthPanel1(), BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ex08();
	}

}
