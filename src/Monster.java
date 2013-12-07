import java.util.ArrayList;


public class Monster {
	private int myHealth;
	private String myName;
	private String myDescription;
	private int myDamage;
	private ArrayList<Item> myDrops;

	public Monster(int theHealth, String theName, String theDescription, int theDamage, ArrayList<Item> theDrops) {
		myHealth = theHealth;
		myName = theName;
		myDescription = theDescription;
		myDamage = theDamage;
		myDrops = theDrops;

	}

	public void damagePlayer(Player thePlayer) {
		double randomNumber = Math.random();
		int dealtDamage;
		
		if (randomNumber > .55)
			dealtDamage = (int) (myDamage + Math.random()*10);
		else if (randomNumber < .45)
			dealtDamage = (int) (myDamage - Math.random()*10);
		else 
			dealtDamage = 0;
		
		if (dealtDamage < 0)
			dealtDamage = 0;

		int playerHealth = thePlayer.getHealth();
		thePlayer.setHealth(playerHealth - dealtDamage);
	}
}
