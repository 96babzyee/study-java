import java.awt.event.*;
import javax.swing.*;
// 2단계
// 인터페이스 <-> 클래스와 비교, 같은 급!
// 클래스가 아닌 인터페이스를 상속 받을 때는 implements 로 함 (extends 아님)
public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource(); //이벤트가 발생한 객체
		if(btn.getText().equals("Action")) 
			btn.setText("액션");
		else
			btn.setText("Action");
	}

}
