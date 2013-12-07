
public class Item_Weapon extends Item {
	private int myDamage;
	private boolean myOneHanded;
	private boolean myEquipped;

	public Item_Weapon(String theName, String theDescription, boolean theUnique, int theDamage, boolean theOneHanded, boolean theEquipped ) {
		super(theName, theDescription, theUnique);
		myDamage = theDamage;
		myOneHanded = theOneHanded;
		myEquipped = theEquipped;

	}
	
	public String toString() {
		if(myEquipped)
			return "<E> " + super.toString();
		else
			return "    " + super.toString();
	}
}
