/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 340826148
 */
import java.awt.Color;
public class Ball {
    private int ballX;
    private int ballY;
    private int xChange = 10;
    private int yChange = 10;
    private int xDir = 1;
    private int yDir = 1;
    private Color bCol;


public Ball(int x, int y, Color theCol){
ballX = x;
ballY = y;
bCol = theCol;
}

public Color getBallColor(){
    return bCol;
}

public int setBallX(){
if((ballX + xChange * xDir < DrawingArea.sLeft)|| (ballX + xChange * xDir> DrawingArea.sRight)){
    xDir = xDir * -1;
}    
ballX = ballX + xChange * xDir;
return ballX;
}

public int setBallY(){
    if((ballY + yChange * yDir < DrawingArea.sTop)|| (ballY + yChange * yDir> DrawingArea.sBottom)){
        yDir = yDir * -1;
    }
    ballY = ballY + yChange * yDir;
return ballY;
}

}