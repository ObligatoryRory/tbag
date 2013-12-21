import java.util.ArrayList;
import java.util.HashMap;

//We should have a level utilizing goblins, then ogres, then vampires?



public class MonsterTable {
	private HashMap<String, Monster> monsterMap;
	private ItemTable itemTable;

	
	public static String drop(){
		double value = Math.floor((Math.random()*10)+1);
        String lowDrop = ""; 
        String medDrop = ""; 
        String highDrop = ""; 
        
		/*  Warrior will have the easiest time with low drops, archer will have easiest time with medium drops, while mage will have easiest time with the high drops
		 * The following if statement allows user to get random drops, so there will not be a level with just melee/range/mage drops
		 * Will eventually create a method that will randomly assign med-high monsters the ability to have drops of the level below it
		 * this will disallow straight up monster farming as well as increase difficulty of the game
		 * currently have no way of refreshing the item assigned to the value.  thus although the drop may be random -- the drop per value will not change
		 * add this to a method and recall it 
		 */
        
        if (value >= 7){
			lowDrop = "iron_shortsword";
			medDrop = "willow_bow";
			highDrop = "";  //mage drop
		}else if (value < 7 && value >= 5){
			lowDrop = "basic_fireball_spellbook";
			medDrop = "steel_shortsword";//warrior drop
			highDrop = "";//archer drop
		}else if (value < 5 && value > 2){
			lowDrop = "oak_bow";
			medDrop = "medium_fireball_spellbook";
			highDrop = "";//warrior drop
		}else{  //null set unless another class is created, in which need to rebalance
			lowDrop = "";
			medDrop = "";
			highDrop = "";
		}
        
        //need to make it return string array
	}
	
	public MonsterTable() {
		monsterMap = new HashMap<String, Monster>();
		itemTable = new ItemTable();
        
		double value = Math.floor((Math.random()*10)+1);
        String lowDrop = ""; 
        String medDrop = ""; 
        String highDrop = ""; 
        
		/*  Warrior will have the easiest time with low drops, archer will have easiest time with medium drops, while mage will have easiest time with the high drops
		 * The following if statement allows user to get random drops, so there will not be a level with just melee/range/mage drops
		 * Will eventually create a method that will randomly assign med-high monsters the ability to have drops of the level below it
		 * this will disallow straight up monster farming as well as increase difficulty of the game
		 * currently have no way of refreshing the item assigned to the value.  thus although the drop may be random -- the drop per value will not change
		 * add this to a method and recall it 
		 */
        
        if (value >= 7){
			lowDrop = "iron_shortsword";
			medDrop = "willow_bow";
			highDrop = "";  //mage drop
		}else if (value < 7 && value >= 5){
			lowDrop = "basic_fireball_spellbook";
			medDrop = "steel_shortsword";//warrior drop
			highDrop = "";//archer drop
		}else if (value < 5 && value > 2){
			lowDrop = "oak_bow";
			medDrop = "medium_fireball_spellbook";
			highDrop = "";//warrior drop
		}else{  //null set unless another class is created, in which need to rebalance
			lowDrop = "";
			medDrop = "";
			highDrop = "";
		}
       
		ArrayList<Item> aGreenSlimeItems = new ArrayList<Item>();
		aGreenSlimeItems.add(itemTable.getItem("small_health_potion"));
		monsterMap.put("green_slime", new Monster(30, "Green Slime", "A basic, worthless slime, weak against fire!", 5, aGreenSlimeItems));
		
		ArrayList<Item> aGoblinItems = new ArrayList<Item>();
		aGoblinItems.add(itemTable.getItem("small_intel_potion"));
		Object randomDrop;
		aGoblinItems.add(itemTable.getItem(lowDrop));
		monsterMap.put("goblin", new Monster(50, "Goblin", "A dumb, oblivious goblin, kill it for a surprise!", 10, aGoblinItems));

        ArrayList<Item>aGoblinArcherItems = new ArrayList<Item>();//low level goblin archer
        aGoblinArcherItems.add(itemTable.getItem(lowDrop));
        monsterMap.put("goblin_archer", new Monster(40, "A goblin archer", "It weilds a low level crossbow!", 15, aGoblinArcherItems));
        
		ArrayList<Item>aGoblinShredderItems = new ArrayList<Item>(); //heavy goblin unit
		aGoblinShredderItems.add(itemTable.getItem("small_health_potion"));
        aGoblinShredderItems.add(itemTable.getItem("iron_shortsword"));
        monsterMap.put("goblin_shredder", new Monster(90, "Goblin Shredder","A goblin wearing equipment, ready for battle.", 22, aGoblinShredderItems));

        ArrayList<Item>aRizzarkItems = new ArrayList<Item>(); //goblin boss
        aRizzarkItems.add(itemTable.getItem(""));
        monsterMap.put("rizzark", new Monster(120, "Rizzark", "A goblin boss!", 28, aRizzarkItems));
		
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

        ArrayList<Item>aSaunaProItems = new ArrayList<Item>();//a mid level boss
        aSaunaProItems.add(itemTable.getItem("")); 
        monsterMap.put("sauna_pro", new Monster(500, "Sauna Pro", "Kill him, quick before he burns you to death!", 150, aSaunaProItems));
        
        ArrayList<Item>aDarkJohnItems = new ArrayList<Item>(); // the final boss
        aDarkJohnItems.add(itemTable.getItem(""));
        monsterMap.put("dark_john", new Monster(1000, "Dark John Novak", "Your inner evil has been revealed!", 300, aDarkJohnItems));

        
        
	}
	public Monster getMonsters(String theMonster) {
		return monsterMap.get(theMonster);
	}
}
