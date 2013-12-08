import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class Player {

	private int currentHealth;
	private int maxHealth;
	private int strength;
	private int luck;
	private int intel;
	private int agility;
	private String myClass;
	private String description;
	private Room currentRoom;
	HashMap<String, Integer> myBuffs;

	private ArrayList<Item> inventory = new ArrayList<Item>();

	public Player(Room startingRoom, String theClass){
		currentRoom = startingRoom;
		myClass = theClass;
		switch (myClass) {
		case "thief":
			currentHealth = 60;
			maxHealth = currentHealth;
			strength = 40;
			luck = 80;
			intel = 40;
			agility = 100;

			inventory.add(new Item_Weapon("Bronze Dagger", "An extremely generic dagger. What did you expect?", false, 15, true, true));

			break;
		case "mage":
			currentHealth = 50;
			maxHealth = currentHealth;
			strength = 30;
			luck = 70;
			intel = 120;
			agility = 50;

			inventory.add(new Item_Weapon("Wooden Staff", "Basically a twig that is slightly magical. ", false, 10, false, true));

			break;
		case "warrior":
			currentHealth = 80;
			maxHealth = currentHealth;
			strength = 120;
			luck = 40;
			intel = 20;
			agility = 60;

			inventory.add(new Item_Weapon("Bronze Short-Sword", "A dull weapon for a dull warrior.", false, 20, true, true));

			break;
		case "archer":
			currentHealth = 65;
			maxHealth = currentHealth;
			strength = 70;
			luck = 50;
			intel = 30;
			agility = 80;

			inventory.add(new Item_Weapon("Wooden Bow", "Don't pull too hard, the wood isn't strong. ", false, 15, true, true));

			break;
		}
		myBuffs = new HashMap<String, Integer>();
	}

	public String getJob(){
		return myClass;
	}
	public int getMaxHealth(){
		return maxHealth;
	}

	public int getHealth() { 
		return currentHealth;
	}

	public int setHealth(int theHealth) {
		currentHealth = theHealth;
		return currentHealth;
	}

	public int getStrength() { 
		return strength;
	}


	public int setStrength(int theStrength) {
		strength = theStrength;
		return strength;
	}

	public int getLuck() { 
		return luck;
	}

	public int setLuck(int theLuck) {
		luck = theLuck;
		return luck;
	}

	public int getIntel() { 
		return intel;
	}

	public int setIntel(int theIntel) {
		intel = theIntel;
		return intel;
	}

	public int getAgility() { 
		return agility;
	}

	public int setAgility(int theAgility) {
		currentHealth = theAgility;
		return agility;
	}

	public void addItem(Item theItem) {
		inventory.add(theItem);
	}

	public Room getRoom(){
		return currentRoom;
	}
	
	
	public Item removeItem(Item theItem) {
		int aItem = inventory.indexOf(theItem);
		return inventory.remove(aItem);
	}

	public String printInventory() {
		String aRet = "";
		for (Item i : inventory) {
			aRet += i.toString();
		}
		return aRet;
	}

	public String goNorth() {

		Room aRoom = currentRoom.getNorth();
		if (aRoom != null) {
			debuff();
			currentRoom = aRoom;
		} 
		return currentRoom.toString();
	}
	public String goEast() {
		Room aRoom = currentRoom.getEast();
		if (aRoom != null) {
			debuff();
			currentRoom = aRoom;
		} 
		return currentRoom.toString();
	}
	public String goSouth() {
		Room aRoom = currentRoom.getSouth();
		if (aRoom != null) {
			debuff();
			currentRoom = aRoom;
		} 
		return currentRoom.toString();
	}
	public String goWest() {
		Room aRoom = currentRoom.getWest();
		if (aRoom != null) {
			debuff();
			currentRoom = aRoom;
		} 
		return currentRoom.toString();
	}

	public void addBuff(String theBuff, int theValue) {
		myBuffs.put(theBuff, theValue);
	}

	public void debuff() {
		for(String aS : myBuffs.keySet()) {
			switch(aS) {
			case "strength":
				strength -= myBuffs.get(aS);
				break;
			case "luck":
				luck -= myBuffs.get(aS);
				break;
			case "intel":
				intel -= myBuffs.get(aS);
				break;
			case "agility":
				agility -= myBuffs.get(aS);
				break;
			}

			myBuffs.remove(aS);
		}
	}

	public Player getPlayer() {
		return this;
	}







	public static void main(String[] args) {

	}

}
