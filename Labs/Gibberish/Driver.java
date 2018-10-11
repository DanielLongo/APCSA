
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
   public static void main() {
       WordList5000 wordList5000 = new WordList5000();
       String s;
       Template t = new Template();
       
       Gibberish g = new Gibberish(t.getSourceString());
       s = g.makeGibberish(wordList5000);
       System.out.println(s);
       
   }
}
