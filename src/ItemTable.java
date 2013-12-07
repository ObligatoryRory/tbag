import java.util.HashMap;


public class ItemTable {
	private HashMap<String, Item> itemMap;

	public ItemTable() {
		itemMap = new HashMap<String, Item>();
		itemMap.put("small_health_potion",  new Item_Buff("Small Health Potion", "Heals 10 health.", false, 10, false, "health"));
	}
	
	public Item getItem(String theItem) {
		return itemMap.get(theItem);
	}
}
