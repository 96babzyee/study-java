import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame{
	private JLabel la = new JLabel("Hello");
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
	}
	
	public class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) { //마우스 버튼이 눌러지는 순간
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
		
		public void mouseClicked(MouseEvent e) {} //마우스가 클릭되는 순간
		public void mouseEntered(MouseEvent e) {} //마우스가 컴포넌트 위에 올라가는 순간
		public void mouseExited(MouseEvent e) {} //마우스가 컴포넌트 위에서 내려오는 순간
		public void mouseReleased(MouseEvent e) {} //눌러진 마우스 버튼이 떼어지는 순간
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
