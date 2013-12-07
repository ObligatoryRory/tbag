import java.util.ArrayList;
import java.util.HashMap;


public class MonsterTable {
	private HashMap<String, Monster> monsterMap;
	private ItemTable itemTable;

	public MonsterTable() {
		monsterMap = new HashMap<String, Monster>();
		itemTable = new ItemTable();
		
		ArrayList<Item> aGreenSlimeItems = new ArrayList<Item>();
		aGreenSlimeItems.add(itemTable.getItem("small_health_potion"));
		monsterMap.put("green_slime", new Monster(30, "Green Slime", "A basic, worthless slime, kill it with fire!", 5, aGreenSlimeItems));
		
	}
}


