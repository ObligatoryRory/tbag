import java.util.ArrayList;


public abstract class Event {
	private String myName;
	private String myDescription;
	public abstract void giveStat();
	public abstract ArrayList<Item> giveReward();
}
