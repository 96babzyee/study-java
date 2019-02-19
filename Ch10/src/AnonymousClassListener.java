import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 익명 클래스로 Action 이벤트 리스너 만들기
// 1단계. 컴포넌트 (예:btn)
// 2단계. 이벤트처리 리스너 객체 *중요
// 3단계. 2단계에서 만든 '리스너'를, 1단계에서 만든 컴포넌트에 붙임 

public class AnonymousClassListener  extends JFrame {
	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		// 1단계
		JButton btn = new JButton("Action");
		
		// 3단계 
		// 외부도 내부도 아닌 바로 만들면서 사용 => 익명 클래스
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource(); //이벤트가 발생한 객체
				if(btn.getText().equals("Action"))
					btn.setText("액션");
				else
					btn.setText("Action");
				
				//타이틀바에 출력
				AnonymousClassListener.this.setTitle(btn.getText());
			}
			
		});
		
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AnonymousClassListener();
	}

}
