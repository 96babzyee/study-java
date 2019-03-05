import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RandomThread extends Thread {
	private Container contentPane;
	private boolean flag = false;
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	void finish() {
		flag = true;
	}

	@Override
	public void run() {
		while(true) {
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel la = new JLabel("Java");
			la.setSize(80,30);
			la.setLocation(x, y);
			contentPane.add(la);
			contentPane.repaint();
			try{
				Thread.sleep(300);
				if(flag==true) {
					contentPane.removeAll();
					la = new JLabel("finish");
					la.setSize(80,30);
					la.setLocation(100, 100);
					la.setForeground(Color.RED);
					contentPane.add(la);
					contentPane.repaint();
					return;
				}
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadFinishFlagEx extends JFrame{
	private RandomThread th;
	
	public ThreadFinishFlagEx() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				th.finish();
			}
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);
		th.start();
	}
	
	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}
}
