
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
             if(currBallBot.canMoveForward(ballWorld) && (ballBotToBounceOff(currBallBot, ballBots) == null)) currBallBot.moveForward();
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
             if(currBallBot.canMoveForward(ballWorld) && (ballBotToBounceOff(currBallBot, ballBots) == null)) {
                 currBallBot.moveForward();
                 currBallBot.setPixelsPerSecond(currBallBot.getPixelsPerSecond() + 1);
                }
             else {
                 currBallBot.setHeading((currBallBot.getHeading() + 110) % 360);
                 currBallBot.setPixelsPerSecond(1);
                 currBallBot.setColor(currBallBot.getColor() + 1);
                }
         }
        }
}
public static int findFreeBallBotIndex(BallBot[] ballBotArray) {
    for (int i = 0; i < ballBotArray.length; i++) {
        if (ballBotArray[i] == null) return i;
    }
    return ballBotArray.length;
}
public static double distanceBetweenPoints (TGPoint point1, TGPoint point2) {
    return Math.pow((Math.pow((point1.xDoubleValue() - point2.xDoubleValue()), 2) + Math.pow((point1.yDoubleValue() - point2.yDoubleValue()), 2)), .5);
}

public static boolean entranceClearByRadius(BallBot ballBot, int radiusNewBot, TGPoint entrancePoint) {
    double distance;
    distance = distanceBetweenPoints(ballBot.getPoint(), entrancePoint);
    if (distance > (ballBot.getRadius() + radiusNewBot)) return true;
    return false;
}
public static boolean entranceClear (BallBot[] ballBotArray, TGPoint entrancePoint) {
   for (int i = 0; i < ballBotArray.length; i++) {
       if (ballBotArray[i] == null) {
        if (i == 0) {
            return true;
        }
        else if (distanceBetweenPoints(ballBotArray[i-1].getPoint(), ballBotArray[i].getPoint()) >= (ballBotArray[i-1].getRadius() + ballBotArray[i].getRadius())){
           return true;
        }
        else return false;
       }
    }
   return false;
}

public static BallBot ballBotToBounceOff(BallBot ballBot, BallBot[] ballBotArray) {
    TGPoint currPoint = ballBot.getPoint();
    TGPoint nextPoint = ballBot.forwardPoint();
    BallBot currBallBot;
    double currDistance;
    double nextDistance;
    for (int i = 0;i < ballBotArray.length;i++) {
        currBallBot = ballBotArray[i];
        if ((currBallBot != null) && (currBallBot != ballBot)) {
            currDistance = distanceBetweenPoints(currBallBot.getPoint(), currPoint);
            if (currDistance <= currBallBot.getRadius() + ballBot.getRadius()) {
                nextDistance = distanceBetweenPoints(nextPoint,currBallBot.getPoint());
            if (nextDistance <= currDistance) {
                return currBallBot;
            }
        }
        }
    }
    return null;
}    
}