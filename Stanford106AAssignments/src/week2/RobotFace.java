//Draw a robot-looking face.

package week2;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {

	//Parameters for the drawing
	private static final int HEAD_WIDTH = 150;	//Head is a big rectangle
	private static final int HEAD_HEIGHT = 250; 
	private static final int EYE_RADIUS = 20;	//Eyes are circles.
	private static final int MOUTH_WIDTH = 100;  //Mouth is a rectangle.
	private static final int MOUTH_HEIGHT = 30; 

    public void run() {
        buildHead();
        buildLeftEye();
        buildRightEye();
        buildMouth();
    }
    private void buildHead() {
        double startingWidth = ((getWidth()/2) - (HEAD_WIDTH/2));
        double startingHeight = ((getHeight()/2) - (HEAD_HEIGHT/2));
        GRect face = new GRect (startingWidth, startingHeight, HEAD_WIDTH, HEAD_HEIGHT);
        add(face);
        face.setFilled(true);
        face.setFillColor(Color.GRAY);
    }
    private void buildLeftEye() {
        double startingWidth = getWidth()/2 - HEAD_WIDTH/4 - EYE_RADIUS/2;
        double startingHeight = getHeight()/2 - HEAD_HEIGHT/4 - EYE_RADIUS/2;
        GOval leftEye = new GOval (startingWidth, startingHeight, EYE_RADIUS, EYE_RADIUS);
        add(leftEye);
        leftEye.setColor(Color.YELLOW);
        leftEye.setFilled(true);
        leftEye.setFillColor(Color.YELLOW);
    }
    private void buildRightEye() {
        double startingWidth = getWidth()/2 + HEAD_WIDTH/4 - EYE_RADIUS/2;
        double startingHeight = getHeight()/2 - HEAD_HEIGHT/4 - EYE_RADIUS/2;
        GOval rightEye = new GOval (startingWidth, startingHeight, EYE_RADIUS, EYE_RADIUS);
        add(rightEye);
        rightEye.setColor(Color.YELLOW);
        rightEye.setFilled(true);
        rightEye.setFillColor(Color.YELLOW);
    }
    private void buildMouth() {
        double startingWidth = getWidth()/2 - MOUTH_WIDTH/2;
        double startingHeight = getHeight()/2 + HEAD_HEIGHT/4 - MOUTH_HEIGHT/2;
        GRect mouth = new GRect (startingWidth, startingHeight, MOUTH_WIDTH, MOUTH_HEIGHT);
        add(mouth);
        mouth.setColor(Color.WHITE);
        mouth.setFilled(true);
        mouth.setFillColor(Color.WHITE);
    }
}