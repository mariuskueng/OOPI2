package A;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIa extends JFrame implements ActionListener{
	
	private JButton b1= new JButton("1");
	private JButton b2= new JButton("2");
	private JButton b3= new JButton("3");
	private JButton b4= new JButton("4");
	private JLabel label= new JLabel();
	private MyPanelA mp= new MyPanelA();
	
	public GUIa(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("GUI-Testaufgabe");
		this.setMinimumSize(new Dimension(500, 500));
		// anonyme Klasse = 2, Inhalt= 1
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				mp.setAnchor(1);
				label.setText("1");
			}
		});
		// je 1 Punkt f�r das Hinzuf�gen der Listener
		b2.addActionListener(this); 
		b3.addActionListener(this);
		b4.addActionListener(this);
		// je 8 Punkte f�r das zusammensetzten des GUIs
		this.setLayout(new BorderLayout());
		JPanel p= new JPanel();
		p.setLayout(new GridLayout(2,2));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		this.add(p, BorderLayout.NORTH);
		this.add(label, BorderLayout.SOUTH);
		this.add(mp, BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
	}

	public static void main(String[] args) {
		GUIa gui= new GUIa();
	}

}
