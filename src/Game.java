import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox.KeySelectionManager;


public class Game extends JFrame implements MouseListener, KeyListener {
	public JButton btnNorth= new JButton("N");
	public JButton btnSouth= new JButton("S");
	public JButton btnWest= new JButton("W");
	public JButton btnEast= new JButton("E");
	public Player myPlayer = new Player("random");
	
	public Game(Player thePlayer){
	myPlayer = thePlayer;
	JFrame window = new JFrame();
	window.setVisible(true);
	Dimension whatever = new Dimension(500,500);
	window.setSize(whatever);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setLayout(new BorderLayout());
	JLabel mainText = new JLabel("whatever", SwingConstants.CENTER);
	
	Dimension whatever2point0=new Dimension(300,300);
	mainText.setSize(whatever2point0);
	mainText.setVisible(true);
	mainText.addKeyListener(this);
	JPanel Text = new JPanel();
	Text.setSize(200,200);
	Text.setLayout(new BorderLayout());
	JButton btnNorth = new JButton("N");
	JButton btnSouth = new JButton("S");
	btnNorth.setSize(100,100);
	btnSouth.setSize(100,100);
	window.add(btnNorth, BorderLayout.NORTH);
	window.add(btnSouth,BorderLayout.SOUTH);
	Text.add(mainText,BorderLayout.CENTER);
	window.add(Text,BorderLayout.CENTER);
	
	JTextField entry=new JTextField("     ");
	
	Text.add(entry, BorderLayout.SOUTH);
	entry.setSize(50,100);
	
	JButton btnEast = new JButton("E");
	
	JButton btnWest = new JButton("W");
	btnWest.setSize(100,100);
	btnEast.setSize(100,100);
	window.add(btnEast,BorderLayout.EAST);
	window.add(btnWest,BorderLayout.WEST);
	btnWest.addMouseListener(this);
	btnEast.addMouseListener(this);
	btnNorth.addMouseListener(this);
	btnSouth.addMouseListener(this);
	}

	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnWest){
			myPlayer.goWest();
		}else if(e.getSource() == btnNorth){
			myPlayer.goNorth();
		}else if(e.getSource() == btnSouth){
			myPlayer.goSouth();
		}else if(e.getSource() == btnEast){
			myPlayer.goEast();
		}
		
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==10){
			if(e)
		}
		
	}



	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Game theGame= new Game(new Player ("Warrior"));
	
		
		
		System.out.print("Welcome to the Swagtastic Adventure of John Novak!");
		
		
	}



	


	

	

}
