
public class Item_Buff extends Item {
	private int myBonus;
	private boolean myTemporary;
	private String myAttribute;

	public Item_Buff(String theName, String theDescription, boolean theUnique, int theBonus, boolean theTemporary, String theAttribute) {
		super(theName, theDescription, theUnique);
		myBonus = theBonus;
		myTemporary = theTemporary;
		myAttribute = theAttribute;
	}

	public void useBuff(Player thePlayer) {
		thePlayer.removeItem(this);
		
		switch(myAttribute) {
		case "health":
			if(thePlayer.getHealth() + myBonus > thePlayer.getMaxHealth()){
				thePlayer.setHealth(thePlayer.getMaxHealth());	
			}else{
				thePlayer.setHealth(thePlayer.getHealth() + myBonus);
			}
			break;
		case "strength":
			thePlayer.setStrength(thePlayer.getStrength() + myBonus);
			thePlayer.addBuff(myAttribute, myBonus);
			break;
		case "luck":
			thePlayer.setLuck(thePlayer.getLuck() + myBonus);
			thePlayer.addBuff(myAttribute, myBonus);
			break;
		case "intel":
			thePlayer.setIntel(thePlayer.getIntel() + myBonus);
			thePlayer.addBuff(myAttribute, myBonus);
			break;
		case "agility":
			thePlayer.setAgility(thePlayer.getAgility() + myBonus);
			thePlayer.addBuff(myAttribute, myBonus);
			break;
		}
	}
}
