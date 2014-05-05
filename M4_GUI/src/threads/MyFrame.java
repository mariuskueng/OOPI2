package threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JLabel label= new JLabel("0");

	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MyFrame");
		this.setMinimumSize(new Dimension(500, 500));
		this.setLayout(new BorderLayout());
		JPanel p= new JPanel();
		p.setLayout(new GridLayout(5,5));
		for (int i = 0; i < 25; i++) {
			MyButton b = new MyButton(label);
			p.add(b);
			Thread t= new Thread(b);
			t.start();
		}
		this.add(label, BorderLayout.SOUTH);
		this.add(p, BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

}
