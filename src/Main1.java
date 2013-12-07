import java.util.ArrayList;


public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonsterTable mTable = new MonsterTable();
		ArrayList<Item> closetItems = new ArrayList<Item>();
		ArrayList<Monster> closetMonster = new ArrayList<Monster>();
		closetMonster.add(mTable.getMonsters("green_slime"));
		ArrayList<Room> emptyRoom = new ArrayList<Room>();
		emptyRoom.add(null);
		emptyRoom.add(null);
		emptyRoom.add(null);
		emptyRoom.add(null);
		Room closet = new Room("closet", "dark closet", closetItems, closetMonster, emptyRoom);
				
		Player onePlayer = new Player(closet, "warrior");
		
		System.out.println(onePlayer.printInventory());
	}

}
