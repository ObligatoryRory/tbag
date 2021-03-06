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
		
		itemMap.put("yew_staff", new Item_Weapon("Yew Staff", "A moderately effective staff.", false, 35, false, false));
		itemMap.put("iron_dagger", new Item_Weapon("Iron Dagger", "A moderately effective dagger", false, 25, true, false));
		itemMap.put("iron_shortsword", new Item_Weapon("Iron Shortsword", "A moderately effective shortsword.", false, 30, true, false));
		itemMap.put("steel_shortsword", new Item_Weapon("Steel Shortsword", "A great blade, for a great warrior.", false, 50, true, false));
		itemMap.put("steel_longsword", new Item_Weapon("Steel Longsword", "A long blade made out of steel", false, 90, true, false ));
		itemMap.put("wooden_staff", new Item_Weapon("Wooden Staff", "Basically a twig that is slightly magical.", false, 10, false, true));
		itemMap.put("basic_fireball_spellbook", new Item_Weapon("Spellbook of Basic Fireball", "Low end spell that deals 15 damage", false, 15, true, false));
		itemMap.put("medium_fireball_spellbook", new Item_Weapon("Spellbook of Advanced Fireball", "Decently powerfull spell", false, 40, true, false));
		itemMap.put("advanced_fireball_spellbook", new Item_Weapon("Spellbook of Mastering the Fire", "Very powerfull spell", false, 115, true, false));
		itemMap.put("wooden_bow", new Item_Weapon("Wooden Bow", "Don't pull too hard, the wood isn't strong. ", false, 15, true, true));
		itemMap.put("oak_bow", new Item_Weapon("Oak Bow", "Somewhat sturdy, give it a good pull!", false, 28, true, true));
		itemMap.put("willow_bow", new Item_Weapon("Willow Bow", "A powerful bow made from willow wood.", false, 45, true, true));
		itemMap.put("maple_bow", new Item_Weapon("Maple Bow", "A beautiful bow.", false, 70, true, true));
		itemMap.put("yew_bow", new Item_Weapon("Yew Bow", "A very sturdy bow.", false, 100, true, true));
		
		
	}
	public Item getItem(String theItem) {
		return itemMap.get(theItem);
	}
}
 