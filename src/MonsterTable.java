import java.util.ArrayList;
import java.util.HashMap;


public class MonsterTable {
	private HashMap<String, Monster> monsterMap;
	private ItemTable itemTable;

	public MonsterTable() {
		monsterMap = new HashMap<String, Monster>();
		itemTable = new ItemTable();
<<<<<<< HEAD

		ArrayList<Item> aGreenSlimeItems = new ArrayList<Item>();
		aGreenSlimeItems.add(itemTable.getItem("small_health_potion"));
		monsterMap.put("green_slime", new Monster(30, "Green Slime", "A basic, worthless slime, kill it with fire!", 5, aGreenSlimeItems));

		ArrayList<Item> aGoblinItems = new ArrayList<Item>();
		aGoblinItems.add(itemTable.getItem("small_intel_potion"));
		aGoblinItems.add(itemTable.getItem("iron_dagger"));
		monsterMap.put("goblin", new Monster(50, "Goblin", "A dumb, oblivious goblin, kill it for a surprise!", 10, aGoblinItems));


		ArrayList<Item> aVampireItems = new ArrayList<Item>();
		aVampireItems.add(itemTable.getItem("small_agility_potion"));
		aVampireItems.add(itemTable.getItem("drainlife_spellbook"));
		monsterMap.put("vampire", new Monster(40, "Vampire", "A dark, scary vampire, drain its life!", 15, aVampireItems));

		ArrayList<Item> aOgreItems = new ArrayList<Item>();
		aOgreItems.add(itemTable.getItem("large_strength_potion"));
		aOgreItems.add(itemTable.getItem("iron_shortsword"));
		monsterMap.put("ogre", new Monster(80, "Ogre", "A dull, brutal ogre, beat it to death!", 25, aOgreItems));

		ArrayList<Item> aTrollItems = new ArrayList<Item>();
		aTrollItems.add(itemTable.getItem("medium_luck_potion"));
		monsterMap.put("troll", new Monster(70, "Troll", "A disgusting beast, destroy it!", 30, aTrollItems));

		ArrayList<Item>aGoblinShredderItems = new ArrayList<Item>(); //heavy goblin unit
                aGoblinShredderItems.add(itemTable.getItem("iron_shortsword"));
                monsterMap.put("goblin_shredder", new Monster(90, "Goblin Shredder","A goblin wearing equipment, ready for battle.", 22, aGoblinShredderItems));

                ArrayList<Item>aRizzarkItems = new ArrayList<Item>(); //goblin boss
                aRizzarkItems.add(itemTable.getItem(""));
                monsterMap.put("rizzark", new Monster(120, "Rizzark", "A gobling boss!", 28, aRizzarkItems));

	}
	public Monster getMonsters(String theMonster) {
		return monsterMap.get(theMonster);
	}
}




