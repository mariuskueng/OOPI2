package threads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MyButton extends JButton implements Runnable, ActionListener{
	
	private JLabel counter;

	public MyButton(JLabel c) {
		this.counter = c;
		this.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (this.getText() == "clicken") {
			int c= Integer.parseInt(counter.getText());
		    counter.setText(""+(++c));
		}
	}

	@Override
	public void run() {
		while(true) {
			this.setText("clicken");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.setText("");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
