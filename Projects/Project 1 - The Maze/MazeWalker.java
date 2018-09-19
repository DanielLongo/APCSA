
/**
 * Write a description of class MazeWalker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeWalker
{
    private static BreadCrumb crumb = new BreadCrumb(); 
    public static void run() {
    Maze maze = new Maze(3);
    MazeBot mazeBot = maze.getMazeBot();
   // MazeBot mazeBot = new MazeBot(maze, maze.ge());
    walkMaze(maze, mazeBot);
    }
    public static void walkMaze(Maze maze, MazeBot mazeBot) {
//          for (int i =0; i < 10; i++) {
  //        mazeBot.moveForward();
  //      }
 // moveForward(mazeBot);
  //mazeBot.turnRight();
//moveForward(mazeBot);
  //mazeBot.turnLeft();
//moveForward(mazeBot);
 // mazeBot.turnLeft();
//moveForward(mazeBot);
 // mazeBot.turnRight();
//moveForward(mazeBot);
//  mazeBot.turnRight();
//moveForward(mazeBot);
 // mazeBot.turnLeft();
//moveForward(mazeBot);
 // if (mazeBot.didReachGoal()) mazeBot.signalSuccess();
  //else mazeBot.signalError();
  System.out.println("START ");
  while (didNotReachGoal(mazeBot)) {
      System.out.println(mazeBot.getHeading() + " heading");
      moveForward(mazeBot);
      mazeBot.turnRight();
      crumb.crumbRight();
     // System.out.println("skfjdsfkjh " + mazeBot.currentHeading);
      if (mazeBot.canMoveForward()) continue;
      mazeBot.turnLeft();
      crumb.crumbLeft();
      mazeBot.turnLeft();
      crumb.crumbLeft();
    }
 mazeBot.signalSuccess();
}
   public static boolean testWinLeft(MazeBot mazeBot) {
       mazeBot.turnLeft();
       if (mazeBot.canMoveForward()) mazeBot.moveForward();
       else return false;
       if (mazeBot.didReachGoal() == true) return true;
       else {
           mazeBot.turnRight();
           mazeBot.turnRight();
           mazeBot.moveForward();
           mazeBot.turnLeft();
    }
    return false;
}
    
   public static boolean testWinRight(MazeBot mazeBot) {
       mazeBot.turnRight();
       if (mazeBot.canMoveForward()) mazeBot.moveForward();
       else return false;
       if (mazeBot.didReachGoal() == true) return true;
       else {
           mazeBot.turnLeft();
           mazeBot.turnLeft();
           mazeBot.moveForward();
           mazeBot.turnRight();
    }
    return false;
}
   public static void moveForward(MazeBot mazeBot) {
       boolean win;
       while (mazeBot.canMoveForward()) {
           mazeBot.moveForward();
           win = testWinLeft(mazeBot);
           win = testWinRight(mazeBot);
        }
    }
    
    public static boolean didNotReachGoal(MazeBot mazeBot) {
        if (mazeBot.didReachGoal() == true) return false;
        return true;
    }
   
}
