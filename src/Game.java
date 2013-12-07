import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

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
	public Player myPlayer = new Player(null, "random");
	public JTextField entry = new JTextField("");
	public JLabel mainText = new JLabel("whatever", SwingConstants.CENTER);
	
	
	public Game(Player thePlayer){
	myPlayer = thePlayer;
	JFrame window = new JFrame();
	mainText.setText("Currently at: " + myPlayer.getRoom().toString());
	window.setVisible(true);
	Dimension whatever = new Dimension(500,500);
	window.setSize(whatever);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setLayout(new BorderLayout());
	
	Dimension whatever2point0=new Dimension(300,300);
	mainText.setSize(whatever2point0);
	mainText.setVisible(true);
	
	JPanel Text = new JPanel();
	Text.setSize(200,200);
	Text.setLayout(new BorderLayout());
	btnNorth.setSize(100,100);
	btnSouth.setSize(100,100);
	window.add(btnNorth, BorderLayout.NORTH);
	window.add(btnSouth,BorderLayout.SOUTH);
	Text.add(mainText,BorderLayout.CENTER);
	window.add(Text,BorderLayout.CENTER);
	
	Text.add(entry, BorderLayout.SOUTH);
	entry.setSize(50,100);
	
	entry.addKeyListener(this);
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
			mainText.setText(("Currently at: " + myPlayer.getRoom().toString()));
		}else if(e.getSource() == btnNorth){
			myPlayer.goNorth();
			mainText.setText(("Currently at: " + myPlayer.getRoom().toString()));
		}else if(e.getSource() == btnSouth){
			myPlayer.goSouth();
			mainText.setText(("Currently at: " + myPlayer.getRoom().toString()));
		}else if(e.getSource() == btnEast){
			myPlayer.goEast();
			mainText.setText(("Currently at: " + myPlayer.getRoom().toString()));
		}
		
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==10){
			System.out.println(entry.getText());
			
			if(entry.getText().toLowerCase()=="help"){
			
			}else if(entry.getText().compareTo("inventory")==0){
					mainText.setText("<html>" + myPlayer.printInventory() + "</html>");
					entry.setText("");
			}	
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
		
		MonsterTable mTable = new MonsterTable();
		ArrayList<Item> closetItems = new ArrayList<Item>();
		ArrayList<Monster> closetMonster = new ArrayList<Monster>();
		closetMonster.add(mTable.getMonsters("green_slime"));
		ArrayList<Room> emptyRoom = new ArrayList<Room>();
		ArrayList<Room> emptyRoom1 = new ArrayList<Room>();
		ArrayList<Room> eastWing = new ArrayList<Room>();
		
		Room eastWing1 = new Room("wing", "a muggy old room", closetItems, closetMonster, eastWing);
		Room closet1 = new Room("closet", "dark closet2", closetItems, closetMonster, emptyRoom1);
		Room closet = new Room("closet", "dark closet", closetItems, closetMonster, emptyRoom);
		
		eastWing.add(null);//north
		eastWing.add(null);//east
		eastWing.add(null);//south
		eastWing.add(closet1);//west
		
		
		emptyRoom1.add(null);//north
		emptyRoom1.add(eastWing1);//east
		emptyRoom1.add(closet);//south
		emptyRoom1.add(null);//west
		
		emptyRoom.add(closet1);//north
		emptyRoom.add(null);//east
		emptyRoom.add(null);//south
		emptyRoom.add(null);//west
				
		Player thePlayer = new Player(closet, "warrior");
		Game theGame= new Game(thePlayer);
	
		
		
		System.out.print("Welcome to the Swagtastic Adventure of John Novak!");
		
		
	}


	

}
