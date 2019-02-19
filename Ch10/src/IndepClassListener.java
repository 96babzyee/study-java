import java.awt.*;
import javax.swing.*;

// 독립 클래스로 Action 이벤트 리스너 만들기
// 1단계. 컴포넌트 (예:btn)
// 2단계. 이벤트처리 리스너 객체 *중요
// 3단계. 2단계에서 만든 '리스너'를, 1단계에서 만든 컴포넌트에 붙임 

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		// 1단계
		JButton btn = new JButton("Action");
	
		// 3단계
		MyActionListener lis = new MyActionListener();
		btn.addActionListener(lis);
		// btn.addActionListener(new MyActionListener()); 로 줄일 수 있음
		
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new IndepClassListener();
	}

}
