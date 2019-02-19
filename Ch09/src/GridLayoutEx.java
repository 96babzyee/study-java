import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx () {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(3,3);
		grid.setVgap(5);
		
		 JTextField tf[] = new JTextField[3] ;

			for(int i = 0; i<tf.length;i++) {
				tf[i] = new JTextField();
			}
			
			setLayout(new GridLayout(3,3));
			add(new JLabel("이 름 : "));
			add(tf[0]);
			add(new JLabel("dd"));
			add(new JLabel(" 키 : "));
			add(tf[1]);
			add(new JLabel("(cm)"));
			add(new JLabel("체  중 : "));
			add(tf[2]);
			add(new JLabel("(kg)"));
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
