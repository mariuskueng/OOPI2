import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class BossPuzzle extends JFrame implements ActionListener{
	
	private JButton[] buttons;
	private JButton startButton;
	private JLabel ausgabe;
	private JLabel titel;
	private int moveCount;

	public BossPuzzle() {
		this.setTitle("Boss Puzzle");
		buttons = new JButton[9];
		startButton = new JButton("Start");
		ausgabe = new JLabel("");
		titel = new JLabel("Willkommen");
		moveCount = 0;
		
		this.setMinimumSize(new Dimension(400, 400));
		BorderLayout alloverLayout = new BorderLayout();
		alloverLayout.setHgap(20);
		GridLayout buttonLayout = new GridLayout(3,3);
		buttonLayout.setVgap(10);
		buttonLayout.setHgap(10);
		GridLayout controllerLayout = new GridLayout(2,1);
		controllerLayout.setHgap(5);
		
		JPanel buttonPanel = new JPanel();
		JPanel controlPanel = new JPanel();
		
		controlPanel.setBorder(new EmptyBorder(5, 60, 5, 60)); // EmptyBorder(int top, int left, int bottom, int right)
		
		titel.setFont(new Font("Arial", 1, 24));
		titel.setHorizontalAlignment(JLabel.CENTER);
		
		ausgabe.setFont(new Font("Arial", 1, 20));
		startButton.setFont(new Font("Arial", 1, 24));
		
		startButton.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e) {
		    	 mixPuzzle();
		    	 moveCount = 0;
		    	 ausgabe.setText("");
		     }
		});
		
		this.setLayout(alloverLayout);
		buttonPanel.setLayout(buttonLayout);
		controlPanel.setLayout(controllerLayout);
		
		Font buttonFont = new Font("Arial", 1, 38);
		for (int i = 0; i < buttons.length; i++) {
			JButton button = new JButton(""+(i+1));
			if (i == buttons.length-1) {
				button.setText("");
			}
			button.setFont(buttonFont);
			button.addActionListener(this);
			buttons[i] = button;
			buttonPanel.add(button);
		}
		
		controlPanel.add(startButton);
		controlPanel.add(ausgabe);
		
		this.add(buttonPanel, BorderLayout.CENTER);
		this.add(titel, BorderLayout.NORTH);
		this.add(controlPanel, BorderLayout.SOUTH);
		
		this.addWindowListener(new MyWindowAdapter());
		
		this.pack();
		this.setVisible(true);
	}
	
	public void moveButtons(JButton b) {
		if (b == buttons[0]) {
			if (buttons[1].getText().equals("")) {
				swapText(b, buttons[1]);
			} else if (buttons[3].getText().equals("")) {
				swapText(b, buttons[3]);
			}
		} else if (b == buttons[1]) {
			if (buttons[0].getText().equals("")) {
				swapText(b, buttons[0]);
			} else if (buttons[2].getText().equals("")) {
				swapText(b, buttons[2]);
			} else if (buttons[4].getText().equals("")) {
				swapText(b, buttons[4]);
			}
		} else if (b == buttons[2]) {
			if (buttons[1].getText().equals("")) {
				swapText(b, buttons[1]);
			} else if (buttons[5].getText().equals("")) {
				swapText(b, buttons[5]);
			}
		} else if (b == buttons[3]) {
			if (buttons[0].getText().equals("")) {
				swapText(b, buttons[0]);
			} else if (buttons[4].getText().equals("")) {
				swapText(b, buttons[4]);
			} else if (buttons[6].getText().equals("")) {
				swapText(b, buttons[6]);
			}
		} else if (b == buttons[4]) {
			if (buttons[1].getText().equals("")) {
				swapText(b, buttons[1]);
			} else if (buttons[3].getText().equals("")) {
				swapText(b, buttons[3]);
			} else if (buttons[5].getText().equals("")) {
				swapText(b, buttons[5]);
			} else if (buttons[7].getText().equals("")) {
				swapText(b, buttons[7]);
			}
		} else if (b == buttons[5]) {
			if (buttons[2].getText().equals("")) {
				swapText(b, buttons[2]);
			}
			else if (buttons[4].getText().equals("")) {
				swapText(b, buttons[4]);
			}
			else if (buttons[8].getText().equals("")){
				swapText(b, buttons[8]);
			}
		} else if (b == buttons[6]) {
			if (buttons[3].getText().equals("")) {
				swapText(b, buttons[3]);
			} else if (buttons[7].getText().equals("")) {
				swapText(b, buttons[7]);
			}
		} else if (b == buttons[7]) {
			if (buttons[6].getText().equals("")) {
				swapText(b, buttons[6]);
			} else if (buttons[4].getText().equals("")) {
				swapText(b, buttons[4]);
			} else if (buttons[8].getText().equals("")) {
				swapText(b, buttons[8]);
			}
		} else if (b == buttons[8]) {
			if (buttons[5].getText().equals("")) {
				swapText(b, buttons[5]);
			} else if (buttons[7].getText().equals("")) {
				swapText(b, buttons[7]);
			}
		}
	}
	
	public void swapText(JButton b1, JButton b2) {
		String temp1 = b1.getText();
		String temp2 = b2.getText();
		b1.setText(temp2);
		b2.setText(temp1);
	}
	
	public void mixPuzzle() {
		for (int i = 0; i < 100; i++) {
			int z = (int)(Math.random()*9);
			moveButtons(buttons[z]);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton button = (JButton) e.getSource();
			moveButtons(button);
			isPuzzleSolved();
			moveCount++;
		}
	}
	
	public void isPuzzleSolved() {
		if (moveCount > 0) {
			if (buttons[0].getText().equals("1") &&
				buttons[1].getText().equals("2") &&
				buttons[2].getText().equals("3") &&
				buttons[3].getText().equals("4") &&
				buttons[4].getText().equals("5") &&
				buttons[5].getText().equals("6") &&
				buttons[6].getText().equals("7") &&
				buttons[7].getText().equals("8")
				) {
			
			ausgabe.setText("Gelöst mit " + moveCount + " Zügen");
			this.repaint();
			moveCount = 0;
			}
		}
	}
	
	public class MyWindowAdapter extends WindowAdapter{
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
 
	public static void main(String[] args) {
		BossPuzzle b = new BossPuzzle();
	}

}
