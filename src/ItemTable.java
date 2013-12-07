import java.util.HashMap;


public class ItemTable {
	private HashMap<String, Item> itemMap;

	public ItemTable() {
		itemMap = new HashMap<String, Item>();
		itemMap.put("small_health_potion",  new Item_Buff("Small Health Potion", "Heals 20 health.", false, 20, false, "health"));
		itemMap.put("small_strength_potion", new Item_Buff("Small Strength Potion", "Increases Strength stat by 20 until next room.", false, 20, true, "strength"));
		itemMap.put("small_agility_potion", new Item_Buff("Small Agility Potion", "Increases Agility stat by 20 until next room.", false, 20, true, "agility"));
		itemMap.put("small_intel_potion",new Item_Buff("Small Intelligence Potion", "Increases Intelligence stat by 20 until next room.", false, 20, true, "intel"));
		itemMap.put("small_luck_potion",new Item_Buff("Small Luck Potion", "Increases Luck stat by 20 until next room.", false, 20, true, "intel"));
		itemMap.put("medium_strength_potion", new Item_Buff("Medium Strength Potion", "Increases Strength stat by 40 until next room.", false, 40, true, "strength"));
		itemMap.put("medium_agility_potion", new Item_Buff("Medium Agility Potion", "Increases Agility stat by 40 until next room.", false, 40, true, "agility"));
		itemMap.put("medium_intel_potion",new Item_Buff("Medium Intelligence Potion", "Increases Intelligence stat by 40 until next room.", false, 40, true, "intel"));
		itemMap.put("medium_luck_potion",new Item_Buff("Medium Luck Potion", "Increases Luck stat by 40 until next room.", false, 40, true, "intel"));
		itemMap.put("large_strength_potion", new Item_Buff("Large Strength Potion", "Increases Strength stat by 70 until next room.", false, 70, true, "strength"));
		itemMap.put("large_agility_potion", new Item_Buff("Large Agility Potion", "Increases Agility stat by 70 until next room.", false, 70, true, "agility"));
		itemMap.put("large_intel_potion",new Item_Buff("Large Intelligence Potion", "Increases Intelligence stat by 70 until next room.", false, 70, true, "intel"));
		itemMap.put("large_luck_potion",new Item_Buff("Large Luck Potion", "Increases Luck stat by 70 until next room.", false, 70, true, "intel"));
		
		itemMap.put("yew_staff", new Item_Weapon("Yew Staff", "A moderately effective staff.", false, 20, false, false));
		itemMap.put("iron_dagger", new Item_Weapon("Iron Dagger", "A moderately effective dagger", false, 25, true, false));
		itemMap.put("iron_shortsword", new Item_Weapon("Iron Shortsword", "A moderately effective shortsword.", false, 30, true, false));
		
		itemMap.put("basic_fireball_spellbook", new Item_Weapon("Spellbook of Basic Fireball", "Low end spell that deals 15 damage", false, 15, true, false));
		
	}
	
	public Item getItem(String theItem) {
		return itemMap.get(theItem);
	}
}
