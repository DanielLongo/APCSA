
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner
{
 public static void a1() {
     BallWorld ballWorld = new BallWorld(200, 200);
     TGPoint tgPoint = new TGPoint(0,0);
     BallBot ballBot = new BallBot(ballWorld, tgPoint, 0, 20);
     while (true) {
         if(ballBot.canMoveForward(ballWorld)) ballBot.moveForward();
     }
}
}
