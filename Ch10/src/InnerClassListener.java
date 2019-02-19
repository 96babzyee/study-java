import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 내부 클래스로 Action 이벤트 리스너 만들기
// 1단계. 컴포넌트 (예:btn)
// 2단계. 이벤트처리 리스너 객체 *중요
// 단계. 2단계에서 만든 '리스너'를, 1단계에서 만든 컴포넌트에 붙임 

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("Action");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		// 1단계
		JButton btn = new JButton("Action");
	
		// 3단계
		MyActionListener2 lis = new MyActionListener2();
		btn.addActionListener(lis);
		// btn.addActionListener(new MyActionListener2()); 로 가능
		
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}

	private class MyActionListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource(); //이벤트가 발생한 객체
			if(btn.getText().equals("Action"))
				btn.setText("액션");
			else
				btn.setText("Action");
			
			//타이틀바에 출력
			InnerClassListener.this.setTitle(btn.getText());
		}

	}

	
	public static void main(String[] args) {
		new InnerClassListener();
	}

}
