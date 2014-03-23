import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class BossPuzzle extends JFrame{
	
	private JButton[] buttons;
	private JButton startButton;
	private JLabel ausgabe;
	private JLabel titel;

	public BossPuzzle() {
		this.setTitle("Boss Puzzle");
		buttons = new JButton[9];
		startButton = new JButton("Start");
		ausgabe = new JLabel("");
		titel = new JLabel("Willkommen");
		
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
			buttonPanel.add(button);
		}
		
		controlPanel.add(startButton);
		controlPanel.add(ausgabe);
		
		this.add(buttonPanel, BorderLayout.CENTER);
		this.add(titel, BorderLayout.NORTH);
		this.add(controlPanel, BorderLayout.SOUTH);
		
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		BossPuzzle b = new BossPuzzle();
	}

}
