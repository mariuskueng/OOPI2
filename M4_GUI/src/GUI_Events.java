import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI_Events extends JFrame{
	GridLayout grid = new GridLayout(2,1);
	JButton button = new JButton("button");
	JTextField textField= new JTextField("TextField");
	private int buttonClickCount = 0;
	private int colorState = 0;
	
	public GUI_Events() {
		this.setTitle("GUI Events");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(300, 300));
		
		// Festlegen von Eigenschaften der GUI-Elemente
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(4,1));
		this.add(textField, BorderLayout.NORTH);
		this.add(button, BorderLayout.SOUTH);
		
		button.addActionListener(new ActionListener(){
		     @Override
		     public void actionPerformed(ActionEvent arg0) {
		       buttonClicked();
		     }
		});
		button.setBorderPainted(false);
		button.setOpaque(true);
		
		this.pack();
		this.setVisible(true);
	}
	
	public void buttonClicked() {
		buttonClickCount++;
		textField.setText("Knopf "+buttonClickCount + "-mal gedrückt");
		
		switch (colorState) {
		case 1:
			button.setBackground(Color.BLUE);
			colorState = 2;
			break;
		case 2:
			button.setBackground(Color.GREEN);
			colorState = 0;
			break;
		default:
			button.setBackground(Color.YELLOW);
			colorState = 1;
			break;
		}
	}

	public static void main(String[] args) {
		new GUI_Events();

	}

}
