import javax.swing.JFrame;

public class MenuFrame extends JFrame {
	public MenuFrame() {
		setTitle("저녁 뭐 먹을래? - 이지혜");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MenuPanel());

		setSize(450,300);
		setVisible(true);
	}
}
