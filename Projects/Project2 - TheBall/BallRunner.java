
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner {
 public static void a1() {
     BallWorld ballWorld = new BallWorld(200, 200);
     TGPoint tgPoint = new TGPoint(0,0);
     BallBot ballBot = new BallBot(ballWorld, tgPoint, 0, 20);
     while (true) {
         if(ballBot.canMoveForward(ballWorld)) ballBot.moveForward();
         else ballBot.setHeading((ballBot.getHeading() + 110) % 360);
     }
}
 public static void a2() {
     BallWorld ballWorld = new BallWorld(200, 200);
     TGPoint entrancePoint = new TGPoint(0,0);
     BallBot[] ballBots = new BallBot[10];
     BallBot currBallBot;
     BallBot newBallBot;
     
     while (true) {
         if (findFreeBallBotIndex(ballBots) != ballBots.length) {
             newBallBot = new BallBot(ballWorld, entrancePoint, Math.random() * 360.,(int)(Math.random() * 50));
             ballBots[findFreeBallBotIndex(ballBots)] = new BallBot(ballWorld, entrancePoint, Math.random() * 360.,(int)(Math.random() * 50));
         }
         for (int i = 0; i < findFreeBallBotIndex(ballBots); i++) {
             currBallBot = ballBots[i];
             if(currBallBot.canMoveForward(ballWorld)) currBallBot.moveForward();
             else currBallBot.setHeading((currBallBot.getHeading() + 110) % 360);
         }
}
}
 public static void a3() {
     BallWorld ballWorld = new BallWorld(200, 200);
     TGPoint entrancePoint = new TGPoint(0,0);
     BallBot[] ballBots = new BallBot[10];
     int[] ballBotRadiuses = new int[10];
     int curRadius;
     BallBot currBallBot;
     for (int i = 0; i < ballBots.length; i ++) {
        ballBotRadiuses[i] = (int)(Math.random() * 50);
    }
     while (true) {
         if (findFreeBallBotIndex(ballBots) != ballBots.length) {
             curRadius = ballBotRadiuses[findFreeBallBotIndex(ballBots)];
             if (findFreeBallBotIndex(ballBots) == 0) {
             ballBots[findFreeBallBotIndex(ballBots)] = new BallBot(ballWorld, entrancePoint, Math.random() * 360.,curRadius);
                }
             else if (entranceClearByRadius(ballBots[findFreeBallBotIndex(ballBots)-1], curRadius, entrancePoint)) {
                 ballBots[findFreeBallBotIndex(ballBots)] = new BallBot(ballWorld, entrancePoint, Math.random() * 360.,curRadius);
         }
        }
         for (int i = 0; i < findFreeBallBotIndex(ballBots); i++) {
             currBallBot = ballBots[i];
             if(currBallBot.canMoveForward(ballWorld)) currBallBot.moveForward();
             else currBallBot.setHeading((currBallBot.getHeading() + 110) % 360);
         }
        }
}

 public static void a4() {
     BallWorld ballWorld = new BallWorld(200, 200);
     TGPoint entrancePoint = new TGPoint(0,0);
     BallBot[] ballBots = new BallBot[10];
     int[] ballBotRadiuses = new int[10];
     int curRadius;
     BallBot currBallBot;
     for (int i = 0; i < ballBots.length; i ++) {
        ballBotRadiuses[i] = (int)(Math.random() * 50);
    }
     while (true) {
         if (findFreeBallBotIndex(ballBots) != ballBots.length) {
             curRadius = ballBotRadiuses[findFreeBallBotIndex(ballBots)];
             if (findFreeBallBotIndex(ballBots) == 0) {
             ballBots[findFreeBallBotIndex(ballBots)] = new BallBot(ballWorld, entrancePoint, Math.random() * 360.,curRadius);
                }
             else if (entranceClearByRadius(ballBots[findFreeBallBotIndex(ballBots)-1], curRadius, entrancePoint)) {
                 ballBots[findFreeBallBotIndex(ballBots)] = new BallBot(ballWorld, entrancePoint, Math.random() * 360.,curRadius);
         }
        }
         for (int i = 0; i < findFreeBallBotIndex(ballBots); i++) {
             currBallBot = ballBots[i];
             if(currBallBot.canMoveForward(ballWorld) && (ballBotToBounceOff(currBallBot, ballBots) == true)) currBallBot.moveForward();
             else {
                 currBallBot.setHeading((currBallBot.getHeading() + 110) % 360);
                }
         }
        }
}

public static void a5() {
     BallWorld ballWorld = new BallWorld(200, 200);
     TGPoint entrancePoint = new TGPoint(0,0);
     BallBot[] ballBots = new BallBot[10];
     int[] ballBotRadiuses = new int[10];
     int curRadius;
     BallBot currBallBot;
     for (int i = 0; i < ballBots.length; i ++) {
        ballBotRadiuses[i] = (int)(Math.random() * 50); //creates array of randome radii
    }
     while (true) {
         //creates new ballBots
         if (findFreeBallBotIndex(ballBots) != ballBots.length) {
             curRadius = ballBotRadiuses[findFreeBallBotIndex(ballBots)];
             if (findFreeBallBotIndex(ballBots) == 0) { //the first ball bot will always have a clear entrance
             ballBots[findFreeBallBotIndex(ballBots)] = new BallBot(ballWorld, entrancePoint, Math.random() * 360.,curRadius);
                }
             else if (entranceClearByRadius(ballBots[findFreeBallBotIndex(ballBots)-1], curRadius, entrancePoint)) {
                 //if the enough room in entrance creates new bot
                 ballBots[findFreeBallBotIndex(ballBots)] = new BallBot(ballWorld, entrancePoint, Math.random() * 360.,curRadius);
         }
        }
        
        //moves ballBots
         for (int i = 0; i < findFreeBallBotIndex(ballBots); i++) {
             currBallBot = ballBots[i];
             if(currBallBot.canMoveForward(ballWorld) && (ballBotToBounceOff(currBallBot, ballBots) == false)) {
                 currBallBot.moveForward();
                 currBallBot.setPixelsPerSecond(currBallBot.getPixelsPerSecond() + 4); //accelerates ballBot
                }
             else {
                 currBallBot.setHeading((currBallBot.getHeading() + 110) % 360); //changes heading on colision
                 currBallBot.setPixelsPerSecond(1); //slows down ball bot on collision
                 currBallBot.setColor(currBallBot.getColor() + 1); //changes color on collision
                }
         }
        }
}
public static int findFreeBallBotIndex(BallBot[] ballBotArray) {
    for (int i = 0; i < ballBotArray.length; i++) {
        //retuns index next unitialized ball bot
        if (ballBotArray[i] == null) return i;
    }
    return ballBotArray.length;
}
public static double distanceBetweenPoints (TGPoint point1, TGPoint point2) {
    //distance formula implemented 
    return Math.pow((Math.pow((point1.xDoubleValue() - point2.xDoubleValue()), 2) + Math.pow((point1.yDoubleValue() - point2.yDoubleValue()), 2)), .5);
}

public static boolean entranceClearByRadius(BallBot ballBot, int radiusNewBot, TGPoint entrancePoint) {
    double distance;
    distance = distanceBetweenPoints(ballBot.getPoint(), entrancePoint);
    //ensures distance is greater than the radii of the two bots 
    if (distance > (ballBot.getRadius() + radiusNewBot)) return true;
    return false;
}

public static boolean ballBotToBounceOff(BallBot ballBot, BallBot[] ballBotArray) {
    TGPoint currPoint = ballBot.getPoint();
    TGPoint nextPoint = ballBot.forwardPoint();
    BallBot currBallBot;
    double currDistance;
    double nextDistance;
    for (int i = 0;i < ballBotArray.length;i++) {
        currBallBot = ballBotArray[i];
        if ((currBallBot != null) && (currBallBot != ballBot)) { //checks if there are two unique ball bots
            currDistance = distanceBetweenPoints(currBallBot.getPoint(), currPoint);
            if (currDistance <= currBallBot.getRadius() + ballBot.getRadius()) {
                nextDistance = distanceBetweenPoints(nextPoint,currBallBot.getPoint());
            if (nextDistance <= currDistance) {
                return true; //returns true if bots will colide
            }
        }
        }
    }
    return false; //returns false bots will not colide
}    
}