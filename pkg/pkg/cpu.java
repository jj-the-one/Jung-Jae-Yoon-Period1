/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class cpu extends Characters{
	public cpu(String name){
		super(name);
	}
	
	public void defend(Characters op){
		double miss = Math.random()*4 + 1;
		speed += (int)(speed*miss);
		health = health/2;
	}
	
	public void oneHook(Characters op){
		int miss = (int)Math.random()*op.getSpeed();
		if(speed > miss){
			op.takeDamage(power/5);
			System.out.println(op.getName() + " is Hit!");
		}
		else{
			System.out.println("MISS!");
		}
	}
	
	public void barrage(Characters op){
		for(int i = 0; i < 5; i++){
			int miss = (int)Math.random()*op.getSpeed();
			if(speed > miss){
				op.takeDamage(power/5);
				System.out.println(op.getName() + " is Hit!");
			}
			else{
				System.out.println("MISS!");
			}
		}
	}

}
