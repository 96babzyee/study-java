import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class KeyCodeEx extends JFrame {
	//빈 레이블 컴포넌트 생성
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("keyCode 예제 : F1키:초록색, %키:노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener1());
		
		c.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		//컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
	}
	
	// Key 리스너 구현
	class MyKeyListener1 extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource(); //이벤트가 발생한 객체
			
			la.setText(e.getKeyText(e.getKeyCode()));
			
			if (e.getKeyChar()=='%')
				contentPane.setBackground(Color.YELLOW);
			else if (e.getKeyCode()==KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
		}
		
	}
	
	public static void main(String[] args) {
		new KeyCodeEx();
	}

}
