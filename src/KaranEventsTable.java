import java.util.ArrayList;
import java.util.HashMap;


public class KaranEventsTable {
	private MonsterTable monsterMap;
	private ItemTable itemTable;
	private HashMap<String, KaranEvents> eventTable;
	public KaranEventsTable() {
		eventTable = new HashMap<String, KaranEvents>();
		monsterMap = new MonsterTable();
		itemTable = new ItemTable();
		
		eventTable.put("trip", new KaranEvents("You trip", "You trip on nothing...", null));
}
}