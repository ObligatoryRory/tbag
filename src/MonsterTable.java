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
		
		ArrayList<Item>aGoblinShredderItems = new ArrayList<Item>(); //heavy goblin unit
		aGoblinShredderItems.add(itemTable.getItem("iron_shortsword"));
		monsterMap.put("goblin_shredder", new Monster(90, "Goblin Shredder","A goblin wearing equipment, ready for battle.", 22, aGoblinShredderItems));
		
		ArrayList<Item>aRizzarkItems = new ArrayList<Item>(); //goblin boss
		aRizzarkItems.add(itemTable.getItem(""));
		monsterMap.put("rizzark", new Monster(120, "Rizzark", "A gobling boss!", 28, aRizzarkItems));
	}
}


