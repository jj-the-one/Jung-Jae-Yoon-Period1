package pkg;
import java.util.Scanner;
import java.util.Random;
public class Characters{
    public String name;
    public double health;
    public int power;
    public int speed;
    
	public Characters(String name){
	    this.name = name;
		health = 100;
		power = (int)(Math.random()*((int)health)) + 10;
		speed = (int)(Math.random()*power) + 10;
	}
	
	public String getName(){
	    return name;
	}
	
	public double getHealth(){
	    return health;
	}
	
	public int getPower(){
	    return power;
	}
	
	public int getSpeed(){
	    return speed;
	}
	
	public void takeDamage( int pow){
		health -= pow;
	}
	
	public void defend(Characters opposition){
		double miss = Math.random()*4 + 1;
		speed += (int)(speed*miss);
		health = health/2;
	}
	
	public void oneHook(Characters opposition){
		int miss = (int)Math.random()*opposition.getSpeed();
		if(speed > miss){
			opposition.takeDamage(power/5);
			System.out.println(opposition.getName() + " is Hit!");
		}
		else{
			System.out.println("MISS!");
		}
	}
	
	public void barrage(Characters opposition){
		for(int i = 0; i < 5; i++){
			int miss = (int)(Math.random()*opposition.getSpeed()) + 5;
			if(speed > miss){
				opposition.takeDamage(power/5);
				System.out.println(opposition.getName() + " is Hit!");
			}
			else{
				System.out.println("MISS!");
			}
		}
	}

}

