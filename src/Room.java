import java.util.ArrayList;


public class Room {
	private String myName;
	private String myDescription;
	private ArrayList<Item> myItems;
	private ArrayList<Monster> myMonsters;
	
	//<North, East, South, West>
	private ArrayList<Room> myConnectedRooms;

	public Room(String theName, String theDescription, ArrayList<Item> theItems, ArrayList<Monster> theMonsters, ArrayList<Room> theConnectedRooms ) {
		myName = theName;
		myDescription = theDescription;
		myItems = theItems;
		myMonsters = theMonsters;
		myConnectedRooms = theConnectedRooms;
	}
	
	public Room getNorth(){
		return myConnectedRooms.get(0);
	}
	public Room getEast(){
		return myConnectedRooms.get(1);
	}
	public Room getSouth(){
		return myConnectedRooms.get(2);
	}
	public Room getWest(){
		return myConnectedRooms.get(3);
	}
	
	public String toString() {
		return myDescription;
	}
}
