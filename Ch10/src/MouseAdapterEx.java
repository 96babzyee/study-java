import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public MouseAdapterEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter{
		// MouseAdapter는 인터페이스가 아니고, 클래스 !!
		public void mousePressed(MouseEvent e) { //마우스 버튼이 눌러지는 순간
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
	}
	
	public static void main(String[] args) {
		new MouseAdapterEx();
	}

}
