import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class CheckBoxEx extends JFrame{
	public CheckBoxEx(){
		setTitle("CheckBox 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/heart.png"); 
		ImageIcon selectedCherry = new ImageIcon("images/call.png"); 
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배");
		JCheckBox cherry = new JCheckBox("체리",cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherry);

		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new  CheckBoxEx();
	}

}
