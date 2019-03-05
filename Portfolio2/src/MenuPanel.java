import java.awt.*;
import javax.swing.*;

public class MenuPanel extends JPanel {
	String[] Menu = {"메뉴선택","고치돈", "제육볶음","치킨마요","라면"};
	String[] Count = {"수량","1","2","3","4","5","6","7","8","9"};
	int[] Price = {3500,4000,3000,2000,1500};
	JComboBox<String> RiceList = new JComboBox<String>(Menu);
	JComboBox<String> CountList = new JComboBox<String>(Count);
	JCheckBox cb = new JCheckBox("딸기요거트");
	JRadioButton tax = new JRadioButton("부가세 미포함");
	JRadioButton tax_include = new JRadioButton("부가세 포함");
	JTextArea ta = new JTextArea(8,15);
	JButton CalBtn = new JButton("계산");

	public MenuPanel() {
		setLayout(null);
		add(RiceList);
		add(CountList);
		add(cb);
		add(tax);
		add(tax_include);
		add(ta);
		add(CalBtn);
	}
}
