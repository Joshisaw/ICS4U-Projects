/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotdemo;

import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author 340889765
 */
import becker.robots.*;
public class Robot2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City waterloo = new City();
        Robot bob = new Robot(waterloo,1,1,Direction.EAST,0);
        Wall w1 = new Wall(waterloo,2,2,Direction.NORTH);
        Wall w2 = new Wall(waterloo,2,3,Direction.NORTH);
        Wall w3 = new Wall(waterloo,2,4,Direction.NORTH);
        Wall w4 = new Wall(waterloo,2,4,Direction.EAST);
        Wall w5 = new Wall(waterloo,2,4,Direction.SOUTH);
        Wall w6 = new Wall(waterloo,2,3,Direction.SOUTH);
        Wall w7 = new Wall(waterloo,2,2,Direction.WEST);
        Thing t1 = new Thing(waterloo,1,2);
        Thing t2 = new Thing(waterloo,1,5);
        Thing t3 = new Thing(waterloo,3,3);
    }
    
}
