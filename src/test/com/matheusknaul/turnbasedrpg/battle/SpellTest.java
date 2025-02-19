package test.com.matheusknaul.turnbasedrpg.battle;

import main.com.matheusknaul.turnbasedrpg.domain.Entity;
import main.com.matheusknaul.turnbasedrpg.domain.Character;
import main.com.matheusknaul.turnbasedrpg.domain.Spell;
import main.com.matheusknaul.turnbasedrpg.roles.Archer;
import main.com.matheusknaul.turnbasedrpg.roles.EntityClass;
import main.com.matheusknaul.turnbasedrpg.rules.Lucky;

public class SpellTest {

	public static void main(String[] args) {
		Spell fireBall = new Spell("Fire ball", "A fireball that burn to target.", 40, 0, 10, 5);
		fireBall.displayStats();

		EntityClass archer = new Archer("Archer");
		Entity hero = new Character(1, "Matheus Knaul", archer);
		hero.displayStats();
		
		Lucky lucky = new Lucky();
		int number = (int) lucky.getNumber();
		
		fireBall.useSpell(hero, number);
		
		
		
	}

}
