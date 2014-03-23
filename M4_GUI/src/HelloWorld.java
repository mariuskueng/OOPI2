import java.awt.*;

import javax.swing.*;

//HelloWorld erbt von einem schon bestehenden Container JFrame, JApplet
public class HelloWorld extends JFrame{
	// Erzeugen der einzelnen GUI-Elemente wie Label, Button, etc.
	JTextField textField= new JTextField("TextField");
	JPanel panel = new JPanel();
	JTextArea area= new JTextArea("TextArea");

	// Im Konstruktor wird das GUI zusammengesetzt
	public HelloWorld() {
		// Setzten von Werten für das Frame
		this.setTitle("Hello World");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(300, 300));
		
		// Festlegen von Eigenschaften der GUI-Elemente
		panel.setBackground(Color.BLACK);
		
		// Setzten von Layouts etc.
		this.setLayout(new GridLayout(3, 2));
		this.setLayout(new BorderLayout());
		panel.setLayout(new GridLayout(4,1));

		// Zusammensetzen des GUIs
		JLabel myText= new JLabel("Hello World");
		this.add(myText, BorderLayout.NORTH);
		
		JButton button1 = new JButton("button1");
		panel.add(button1);
		JButton button2 = new JButton("button2");
		panel.add(button2);
		JButton button3 = new JButton("button3");
		panel.add(button3);
		JButton button4 = new JButton("button4");
		panel.add(button4);
		this.add(panel, BorderLayout.WEST);
		
		JButton myButton = new JButton("Hello World");
		myButton.setBackground(Color.BLUE);
		this.add(myButton, BorderLayout.SOUTH);
		
		this.add(textField, BorderLayout.EAST);
		
		JTextArea myArea = new JTextArea("TextArea");
		this.add(myArea, BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
	}
}
