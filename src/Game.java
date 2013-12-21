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
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox.KeySelectionManager;
import java.util.Random;

public class Game extends JFrame implements MouseListener, KeyListener {
	public JButton btnNorth= new JButton("N");
	public JButton btnSouth= new JButton("S");
	public JButton btnWest= new JButton("W");
	public JButton btnEast= new JButton("E");
	public Player myPlayer = new Player(null, "random");
	public static JTextField entry = new JTextField("welcome");
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
		
		
	}

	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
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
						
			if(entry.getText().toLowerCase().compareTo("help")==0){
					mainText.setText("<html>" + "Type inventory to display inventory.  Type class to display class." +
					"  Type health to display current health.  Type 'current room' to display the current room." + "</html>");
					entry.setText("");
			}else if(entry.getText().toLowerCase().compareTo("inventory")==0){
					mainText.setText("<html>" + myPlayer.printInventory() + "</html>");
					entry.setText("");
			}else if(entry.getText().toLowerCase().compareTo("class")==0){
					mainText.setText("<html>" + myPlayer.getJob()+ "</html>");
					entry.setText("");
			}else if(entry.getText().toLowerCase().compareTo("health")==0){
					mainText.setText("<html>" + myPlayer.getHealth() + "</html>");
					entry.setText("");
			}else if (entry.getText().toLowerCase().compareTo("strength")==0){
					mainText.setText("<html>" + myPlayer.getStrength() + "</html>");
					entry.setText("");
			}else if (entry.getText().toLowerCase().compareTo("intelligence")==0){
					mainText.setText("<html>" + myPlayer.getIntel() + "</html>");
					entry.setText("");
			}else if (entry.getText().toLowerCase().compareTo("agility")==0){
					mainText.setText("<html>" + myPlayer.getAgility() + "</html>");
					entry.setText("");
			}else if (entry.getText().toLowerCase().compareTo("luck")==0){
					mainText.setText("<html>" + myPlayer.getLuck() + "</html>");
					entry.setText("");
		    }else if (entry.getText().toLowerCase().compareTo("current room")==0){
		    		mainText.setText("<html>" + myPlayer.getRoom() + "</html>");
		    		entry.setText("");
		    }else if (entry.getText().toLowerCase().compareTo("exit")==0){
		    		System.exit(0);//allows user to quit
		    }else if(entry.getText().toLowerCase().compareTo("stats")==0){
		    		mainText.setText("<html>"  + " Luck: "+ myPlayer.getLuck() + " Agility: "+ myPlayer.getAgility() + " Strength: " + myPlayer.getStrength() +   " Health: " +  myPlayer.getHealth() + "</html>");
		    		entry.setText("");
		    } 		
		}
		
	}



	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	
	}

	
	public static void main(String[] args) {
		
		MonsterTable mTable = new MonsterTable();
		ArrayList<Item> closetItems = new ArrayList<Item>();
		ArrayList<Item> eastWingItems = new ArrayList<Item>();
		ArrayList<Item> westWingItems = new ArrayList<Item>();
		ArrayList<Item> emptyRoomItems = new ArrayList<Item>();
		ArrayList<Item> emptyRoom1Items = new ArrayList<Item>();
		ArrayList<Item> downStairsEastItems = new ArrayList<Item>();
		ArrayList<Item> secretRoomItems = new ArrayList<Item>();
		ArrayList<Item> stairWellItems = new ArrayList<Item>();
		ArrayList<Item> deadGardenItems = new ArrayList<Item>();
		ArrayList<Item> deadGarden1Items = new ArrayList<Item>();
		ArrayList<Item> eastTopFloorsItems = new ArrayList<Item>();
		ArrayList<Item> kitchenItems = new ArrayList<Item>();
		ArrayList<Item> gardenShedItems = new ArrayList<Item>();
		ArrayList<Item> diningRoomItems = new ArrayList<Item>();
		ArrayList<Item> tunnelToLightItems = new ArrayList<Item>();
		ArrayList<Item> tunnelToEscapeItems = new ArrayList<Item>();
		ArrayList<Item> theEscapeItems = new ArrayList<Item>();
		ArrayList<Monster> closetMonster = new ArrayList<Monster>();
		closetMonster.add(mTable.getMonsters("green_slime"));
		ArrayList<Room> emptyRoom = new ArrayList<Room>();
		ArrayList<Room> emptyRoom1 = new ArrayList<Room>();
		ArrayList<Room> eastWing = new ArrayList<Room>();
		ArrayList<Room> westWing = new ArrayList<Room>();
		ArrayList<Room> downStairsEast = new ArrayList<Room>();
		ArrayList<Room> secretRoom = new ArrayList<Room>();
		ArrayList<Room> stairWell = new ArrayList<Room>();
		ArrayList<Room> deadGarden = new ArrayList<Room>();
		ArrayList<Room> deadGarden1 = new ArrayList<Room>();
		ArrayList<Room> eastTopFloors = new ArrayList<Room>();
		ArrayList<Room> kitchen = new ArrayList<Room>();
		ArrayList<Room> gardenShed = new ArrayList<Room>();
		ArrayList<Room> diningRoom = new ArrayList<Room>();
		ArrayList<Room> tunnelToLight = new ArrayList<Room>();
		ArrayList<Room>tunnelToEscape = new ArrayList<Room>();
		ArrayList<Room>theEscape = new ArrayList<Room>();
		Room Escape = new Room ("the_escape", "YOU'VE SURVIVED!", theEscapeItems, closetMonster, theEscape);
		Room toEscape = new Room ("to_escape", "you found an exit.", tunnelToEscapeItems, closetMonster, tunnelToEscape);
		Room hallway = new Room ("hallway", "you continue down the corridor.", tunnelToLightItems, closetMonster, tunnelToLight);
		Room diningRoom1 = new Room ("dining_room", "you see a light.", diningRoomItems, closetMonster, diningRoom);
		Room gardenShed1 = new Room ("dinky_shed", "you run into a shed?", gardenShedItems, closetMonster, gardenShed);
		Room kitchen1 = new Room ("kitchen", "there is a burnt cat tail on the stove top",kitchenItems, closetMonster, kitchen);
		Room eastTop = new Room ("top_floor", "you fall through a hole to your death.", eastTopFloorsItems, closetMonster, eastTopFloors);
		Room deadGrotto1 = new Room ("dead_grotto", "you hear a howl and pee yourself, run!", deadGarden1Items, closetMonster, deadGarden1);
		Room deadGrotto = new Room ("dead_grotto", "the moonlight reflects death, run back!", deadGardenItems, closetMonster, deadGarden);
		Room stairWell1 = new Room ("stair_well", "you feel stairs in the darkness", stairWellItems, closetMonster, stairWell);
		Room room42 = new Room ("secret","You are the BASED God!", secretRoomItems, closetMonster,secretRoom);
		Room downStairsEast1 = new Room("down_east", "stumbling you grab a rail handle", downStairsEastItems, closetMonster, downStairsEast);
		Room westWing1 = new Room ("west_wing", "a cold room with open windows.", westWingItems, closetMonster, westWing);
		Room eastWing1 = new Room("wing", "you smell mold, there are stairs", eastWingItems, closetMonster, eastWing);
		Room closet1 = new Room("closet", "you can't see.", emptyRoom1Items, closetMonster, emptyRoom1);
		Room closet = new Room("closet", "dark closet", closetItems, closetMonster, emptyRoom);

		theEscape.add(eastTop);//north
		theEscape.add(closet);//east
		theEscape.add(closet);//south
		theEscape.add(closet);//west
		
		tunnelToEscape.add(Escape);//north
		tunnelToEscape.add(null);//east
		tunnelToEscape.add(null);//south
		tunnelToEscape.add(null);//west
		
		tunnelToLight.add(toEscape);  //north
		tunnelToLight.add(null);  //east
		tunnelToLight.add(diningRoom1); //south
		tunnelToLight.add(null); //west
		
		diningRoom.add(hallway);//north
		diningRoom.add(null);//east
		diningRoom.add(kitchen1);//south
		diningRoom.add(null);//west
		
		kitchen.add(diningRoom1);//north
		kitchen.add(null);//east
		kitchen.add(westWing1);//south
		kitchen.add(null);//west
		
		deadGarden1.add(gardenShed1);//north
		deadGarden1.add(westWing1);//east
		deadGarden1.add(null);//south
		deadGarden1.add(null);//west
		
		gardenShed.add(null);//north
		gardenShed.add(null);//east
		gardenShed.add(deadGrotto1);//south
		gardenShed.add(null);//west
		
		westWing.add(kitchen1);//north
		westWing.add(closet1);//east
		westWing.add(null);//south
		westWing.add(deadGrotto1);//west
		
		eastTopFloors.add(closet);//north -death
		eastTopFloors.add(closet);//east - death
		eastTopFloors.add(closet);//south - death
		eastTopFloors.add(closet);//west - death
		
		deadGarden.add(null);//north
		deadGarden.add(null);//east
		deadGarden.add(null);//south
		deadGarden.add(eastWing1);//west
		
		stairWell.add(eastTop);//north
		stairWell.add(null);//east
		stairWell.add(eastWing1);//south
		stairWell.add(null);//west
		
		eastWing.add(stairWell1);//north
		eastWing.add(deadGrotto);//east
		eastWing.add(null);//south
		eastWing.add(closet1);//west
		
		downStairsEast.add(eastWing1);//upstairs technically north
		downStairsEast.add(null);//east
		downStairsEast.add(null);//south
		downStairsEast.add(null);//west
		
		emptyRoom1.add(null);//north
		emptyRoom1.add(eastWing1);//east
		emptyRoom1.add(closet);//south
		emptyRoom1.add(westWing1);//west
		
		emptyRoom.add(closet1);//north
		emptyRoom.add(null);//east
		emptyRoom.add(null);//south
		emptyRoom.add(null);//west
		
		secretRoom.add(null);//north
		secretRoom.add(null);//east
		secretRoom.add(null);//south
		secretRoom.add(null);//west
				
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(closet);//index 0
		rooms.add(downStairsEast1);//index 1
		rooms.add(westWing1);//index 2
		rooms.add(room42); //index 3
		
		
		double value;
		value = Math.random();
		int index;
		index=0;
		if(value > 0.5 && value != 0.42){
			index=0; //most likely
		}else if (value < 0.10){
			index=1;//second most likely
		}else if (value < 0.49 && value >.11 && value != 0.42){
			index=2;//third
		}else if (value == 0.42){
			index=3;//"secret room" almost never possible
		}


		String chosenClass = JOptionPane.showInputDialog("choose a class");
		chosenClass=chosenClass.toLowerCase();  //forces input to be lower case 
		
		//below I have inserted a way for user to choose a "RANDOM" class
			if(chosenClass.equals("archer")){
				chosenClass = "archer";
			}else if(chosenClass.equals("mage")){
				chosenClass = "mage";
			}else if(chosenClass.equals("thief")){
				chosenClass = "thief";
			}else if(chosenClass.equals("warrior")){
				chosenClass = "warrior";
			}else{
				if (value > .75){
					chosenClass = "warrior";
				}else if (value >.50 && value <= .74){
					chosenClass = "mage";
				}else if (value > .25 && value <= .49){
					chosenClass = "archer";
				}else if (value > .00 && value <= .24){
					chosenClass = "thief";
			}//changed to .equals to check to make sure objects are equal.
				
		
		
		
			
		}
//created an arraylist of the rooms
//then made an if statement using a random number generator to spawn in unique area
			Player thePlayer = new Player(rooms.get(index), chosenClass);
			Game theGame= new Game(thePlayer);
			System.out.print("Welcome to the Swagtastic Adventure of John Novak!");
	}
}







