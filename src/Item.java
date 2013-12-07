
public class Item {
	private String myName;
	private String myDescription;
	private boolean myUnique;

	public Item (String theName, String theDescription, boolean theUnique) {
		myName = theName;
		myDescription = theDescription;
		myUnique = theUnique;
	}

	public String toString() {
		return myName + ": " + myDescription + "\n";
	}


}
