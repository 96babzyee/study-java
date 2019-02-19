import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");
	
	public MouseListenerAllEx() {
		setTitle("MouseListener와 MOuseMotionLister 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener4 lis = new MyMouseListener4();
		c.addMouseListener(lis);
		c.addMouseMotionListener(lis);
		c.add(la);
		
		setSize(300,200);
		setVisible(true);
	}
	
	//Mouse리스너와 MouseMotion리스너를 모두 가진 리스너 작성
	class MyMouseListener4 implements MouseListener,MouseMotionListener {
		//MouseMotion리스너 (2개의 메소드)
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
		}

		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
		}
		
		//Mouse리스너 (5개의 메소드)
		public void mouseClicked(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			Component c =(Component)e.getSource();
			c.setBackground(Color.CYAN);
		}

		public void mouseExited(MouseEvent e) {
			Component c =(Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}

		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed ("+e.getX()+","+e.getY()+")");
		}

		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased ("+e.getX()+","+e.getY()+")");
		}
	}
	
	public static void main(String[] args) {
		new MouseListenerAllEx();
	}

}
