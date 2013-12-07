import java.util.ArrayList;


public class KaranEvents extends Event{
	
	String name;
	String description;
	Item myReward;
	public KaranEvents(String name, String description, Item myReward){
		this.name = name;
		this.description = description;
		this.myReward = myReward;
		
	}

	@Override
	public void giveStat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Item> giveReward() {
		// TODO Auto-generated method stub
		return null;
	}

}
