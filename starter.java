/*
 *	Author:  Jung-jae Yoon
 *  Date: 11/29/2023
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


import java.util.*;
class starter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Punch Your Stress Away!!! Type 1 to start and any other number to quit.");
    int choice1 = sc.nextInt();
    sc.nextLine();
    if(choice1 == 1){
      System.out.println("You said yes. Please type your [player name]");
      String str = sc.nextLine();
      Characters varsity = new Player1(str);
      System.out.println("Hello " + varsity.getName() + " here are your stats");
      System.out.println("NAME: " + varsity.getName());
      System.out.println("HP: " + varsity.getHealth());
      System.out.println("STRENGTH: " + varsity.getPower());
      System.out.println("SPEED: " + varsity.getSpeed());
      System.out.println("Enter your [Opponent's name] or the thing thats giving you stress.");
      String stri = sc.nextLine();
      Characters op = new cpu(stri);
      System.out.println("Hello " + op.getName() + " here are your stats");
      System.out.println("NAME: " + op.getName());
      System.out.println("HP: " + op.getHealth());
      System.out.println("STRENGTH: " + op.getPower());
      System.out.println("SPEED: " + op.getSpeed());
      System.out.println("\n\n\n\n\n\n\n\n");
      System.out.println("THE FIGHT STARTS IN 3! 2! 1!");
      
      while(varsity.getHealth() > 0){
        System.out.println("-----------------------------------------------------");
        System.out.println(varsity.getName() + "'s health: " + varsity.getHealth() + "\n" + op.getName() + "'s health: " + op.getHealth());
        for(int x = 0; x == 0; x++){
          System.out.println(varsity.getName() + " it's your turn. you can do one of 3 things. 1 for defend, 2 for a barrage attack, and 3 for a right hook!");
          int attackOpt = sc.nextInt();
          sc.nextLine();
          if(attackOpt != 1 && attackOpt != 2 && attackOpt != 3){
            System.out.println("You did not choose a proper option");
            x --;
          }
          else{
            if(attackOpt == 1){
              varsity.defend(op);
            }
            else if(attackOpt == 2){
              varsity.barrage(op);
            }
            else{
              varsity.oneHook(op);
            }
          }
        }
        
        if(op.getHealth() > 0){
          System.out.println(op.getName() + "'s turn.");
          int cpuOpt = (int)(Math.random()* 3)+1;
          if(cpuOpt == 1){
            System.out.println(op.getName() + " chose to defend themself!");
            op.defend(varsity);
          }
          else if(cpuOpt == 2){
            System.out.println(op.getName() + " chose use barrage!");
            op.barrage(varsity);
          }
          else{
            System.out.println(op.getName() + " chose use onehook!");
            op.oneHook(varsity);
          }
        }
        else{
          System.out.println("Player1 WINS!!!!");
          break;
        }
      }
      if(varsity.getHealth() <= 0){
        System.out.println("Wow you actually lost to a bot.");
      }
      
    else{
      System.out.println("bye bye");
    }
  }
}
}
