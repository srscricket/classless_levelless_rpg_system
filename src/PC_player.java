
public class PC_player extends Races
{
	//stats
	double health = (this.healthMultiplier * this.fortitude);
	int mana;
	
	
	int strength;
	int dexterity;
	int agility;
	int intelligence;
	int wisdom;
	int fortitude;
	
	int strengthCap = 56;
	int dexterityCap = 56;
	int agilityCap = 56;
	int intelligenceCap = 56;
	int wisdomCap = 56;
	int fortitudeCap = 56;
	
	//weapons skills
	int melee;
	int staff;
	
	
	//melee skill
	
	int slashing;
	int peircing;
	int placeHolder;
	
	
	//magic affinities
	int fire;
	int wind;
	int water;
	int air;
	int earth;
	int light;
	int dark;
	
	
	void setStats(Races race)
	{
		race.setInitial();
	}
	
	//get stats methods
	int getStrength()
	{
		return strength;
	}
	
	int getDexterity()
	{
		return dexterity;
	}
	
	int getAgility()
	{
		return agility;
	}
	
	int getIntelligence()
	{
		return intelligence;
	}
	
	int getWisdom()
	{
		return wisdom;
	}
	
	int getFortitude()
	{
		return fortitude;
	}
	//end stats methods

	//cap setters
	void SetstrengthCap(int newCap)
	{
		strengthCap = newCap;
	}
	void dexterityCap(int newCap)
	{
		dexterityCap = newCap;
	} 
	void agilityCap(int newCap)
	{
		agilityCap = newCap;
	} 
	void intelligenceCap(int newCap)
	{
		intelligenceCap = newCap;
	} 
	void wisdomCap(int newCap)
	{
		wisdomCap = newCap;
	} 
	void fortitudeCap(int newCap)
	{
		fortitudeCap = newCap;
	}
	//end cap setters
	
}
