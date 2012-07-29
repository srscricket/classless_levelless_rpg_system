
public class Races
{
	Races()
	{
		System.out.println( "Must choose a subtype!");
	}
	
}

class Human extends Races
{
	int strength = 10;
	int dexterity = 10;
	int agility = 10;
	int intelligence = 10;
	int wisdom = 10;
	int fortitude = 10;
}

class Elf extends Races
{
	int strength = 8;
	int dexterity = 12;
	int agility = 8;
	int intelligence = 12;
	int wisdom = 12;
	int fortitude = 8;
}

class Dwarf extends Races
{
	int strength = 14;
	int dexterity = 8;
	int agility = 8;
	int intelligence = 7;
	int wisdom = 11;
	int fortitude = 12;
}