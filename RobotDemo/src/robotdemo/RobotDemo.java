/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotdemo;

/**
 *
 * @author 340889765
 */
import becker.robots.*;
import java.awt.Color;
public class RobotDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City waterloo = new City();
        Wall w1 = new Wall(waterloo,3,1,Direction.WEST);
        Wall w2 = new Wall(waterloo,3,1,Direction.SOUTH);
        Wall w3 = new Wall(waterloo,4,2,Direction.EAST);
        Thing t1 = new Thing(waterloo,2,5);
        Thing t2 = new Thing(waterloo,6,1);
        Robot bob = new Robot(waterloo,2,4,Direction.EAST,0);
        Robot bob2 = new Robot(waterloo,2,9,Direction.WEST,0);
        bob.setColor(Color.blue);
        bob2.setColor(Color.red);
        bob.setLabel("Bob");
        bob.move();
        bob2.move();
        bob.pickThing();
        bob.move();
        bob2.move();
        bob.putThing();
        bob.move();
        bob2.move();
        if(bob.canPickThing()){
            bob.putThing();
        }
        bob.move();
        bob2.move();
        bob.move();
        bob2.move();
        
    }
    
}
