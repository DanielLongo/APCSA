
/**
 * Write a description of class Gibberish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gibberish
{
    private String sourceString;
    public Gibberish(String setSourceString) {
        sourceString = setSourceString;
    }
    public String makeGibberish(WordList5000 wordList5000) {
        int currSourceIndex = 0;
        String resultString = "";
        int currStartIndex = 0;
        int currEndIndex = 0;
        String pos;
        while (true) {
            currStartIndex = sourceString.indexOf("<");
            if (currStartIndex == -1) return resultString + sourceString.substring(0);
            resultString += sourceString.substring(0, currStartIndex);
            currEndIndex = sourceString.indexOf("</>");
            pos = sourceString.substring(currStartIndex + 1,currStartIndex+2);
            System.out.println("pos " + pos); 
            resultString += wordList5000.getRandomWordString(pos);
            sourceString = sourceString.substring(currEndIndex + 3);
        }
    }
}
