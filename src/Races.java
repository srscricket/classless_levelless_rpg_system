
public class Races
{
	int strength;
	int dexterity;
	int agility;
	int intelligence;
	int wisdom;
	int fortitude;
	
	double healthMultiplier;
	
	void setInitial()
	{
		System.out.println("Need to choose a race!");
	}
	
	Races()
	{
		System.out.println( "Must choose a subtype!");
	}
	
}

class Human extends Races
{
	
	public void setInitial()
	{
		int strength = 10;
		int dexterity = 10;
		int agility = 10;
		int intelligence = 10;
		int wisdom = 10;
		int fortitude = 10;
	}
	
	double healthMultiplier = 10;
}

class Elf extends Races
{
	public void setInitial()
	{
		int strength = 8;
		int dexterity = 12;
		int agility = 8;
		int intelligence = 12;
		int wisdom = 12;
		int fortitude = 8;
	}
	
	double healthMultiplier = 8;
}

class Dwarf extends Races
{
	public void setInitial()
	{
		int strength = 14;
		int dexterity = 8;
		int agility = 8;
		int intelligence = 7;
		int wisdom = 11;
		int fortitude = 12;
	}
	
	double healthMultiplier = 12;
}