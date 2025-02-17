package test.com.matheusknaul.turnbasedrpg.battle;

import main.com.matheusknaul.turnbasedrpg.domain.Entity;
import main.com.matheusknaul.turnbasedrpg.domain.Spell;
import main.com.matheusknaul.turnbasedrpg.roles.Archer;
import main.com.matheusknaul.turnbasedrpg.roles.EntityClass;
import main.com.matheusknaul.turnbasedrpg.roles.Warrior;
import main.com.matheusknaul.turnbasedrpg.domain.Character;
import main.com.matheusknaul.turnbasedrpg.domain.Enemy;

public class BattleTest {

	public static void main(String[] args) {
		EntityClass archer = new Archer("Archer");
		Entity hero = new Character(1, "MatheusKnaul", archer);
		
		EntityClass warrior = new Warrior("Warrior");
		Entity goblinEnemy = new Enemy(2, "Evil Goblin", warrior);
		
		goblinEnemy.displayStats();
		hero.displayStats();
		
		Spell fireBall = new Spell("Fire ball", "A fire ball that burn to target.", 40, 0, 10, 5);
	}

}
