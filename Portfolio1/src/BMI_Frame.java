import java.awt.*;
import javax.swing.*;

public class BMI_Frame extends JFrame {
	public BMI_Frame() {
		setTitle("신체 질량 지수 측정(BMI) - 이지혜");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new BodyIndex());

		setSize(380,430);
		setVisible(true);
	}
	
}
