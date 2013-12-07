import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Game extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setVisible(true);

		
		
		Dimension whatever = new Dimension(500,500);
		window.setSize(whatever);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new BorderLayout());
		JLabel mainText = new JLabel("whatever");
		Dimension whatever2point0=new Dimension(300,300);
		mainText.setSize(whatever2point0);
		JPanel Text = new JPanel();
		
		
		window.setResizable(false);
		JButton btnNorth = new JButton("N");
		JButton btnSouth = new JButton("S");
		btnNorth.setSize(100,100);
		btnSouth.setSize(100,100);
		window.add(btnNorth, BorderLayout.NORTH);
		window.add(btnSouth,BorderLayout.SOUTH);
		window.add(Text,BorderLayout.CENTER);
		Text.add(mainText, BorderLayout.NORTH);
		
		JTextField entry=new JTextField("          ");
		Text.add(entry, BorderLayout.SOUTH);
		
		
		JButton btnEast = new JButton("E");
		
		JButton btnWest = new JButton("W");
		btnWest.setSize(100,100);
		btnEast.setSize(100,100);
		window.add(btnEast,BorderLayout.EAST);
		window.add(btnWest,BorderLayout.WEST);
		//window.add(btnEast);
		//window.add(btnSouth);
		//window.add(btnNorth);
		
		
		
		
		System.out.print("Welcome to the Swagtastic Adventure of John Novak!");
		

	}

}
