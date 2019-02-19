import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ch01 extends JFrame{
	public Ch01() {
		JCheckBox checkbox1 = new JCheckBox("버튼 활성화");
		JCheckBox checkbox2 = new JCheckBox("버튼 감추기");
		JButton btn = new JButton("test button");
		
		setTitle("Ch01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(checkbox1);
		c.add(checkbox2);
		c.add(btn);
		
		checkbox1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
			}
		});
		
		checkbox2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setVisible(false);
				else
					btn.setVisible(true);
			}
		});
		
		setSize(250,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ch01();
	}

}
