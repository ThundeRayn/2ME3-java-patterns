package factory;

//import java.util.Random;

public class TotalTheTower {

	public static void main(String[] args) {
		Enemy currentEnemy;
		Factory spawner = new AverageSpawner();
		
		System.out.println("********* Entering Floor 1 *********");
		currentEnemy = spawner.spawn();
		
		currentEnemy.takeDamage(2);
		currentEnemy.attack();
		currentEnemy.takeDamage(3);
		currentEnemy.attack();
		currentEnemy.takeDamage(2);
		currentEnemy.attack();
		currentEnemy.takeDamage(5);
		
		System.out.println("********* Entering Floor 2 *********");
		currentEnemy = spawner.spawn();
		
		currentEnemy.takeDamage(2);
		currentEnemy.attack();
		currentEnemy.takeDamage(3);
		currentEnemy.attack();
		currentEnemy.takeDamage(2);
		currentEnemy.attack();
		currentEnemy.takeDamage(5);
		
		System.out.println("********* Entering Floor 3 *********");
		currentEnemy = spawner.spawn();
		
		currentEnemy.takeDamage(2);
		currentEnemy.attack();
		currentEnemy.takeDamage(3);
		currentEnemy.attack();
		currentEnemy.takeDamage(2);
		currentEnemy.attack();
		currentEnemy.takeDamage(5);
		
		
	}
	
}
