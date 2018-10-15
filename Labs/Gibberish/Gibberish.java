
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
            if (currStartIndex == -1) return resultString + sourceString.substring(0); //if there are no more "<" return
            resultString += sourceString.substring(0, currStartIndex); //adds text between start and tag 
            currEndIndex = sourceString.indexOf("</>");
            pos = sourceString.substring(currStartIndex + 1,currStartIndex+2); // gets part of speach
            //adds random string to final result
            resultString += wordList5000.getRandomWordString(pos);
            //shortens source string so that indexOf will return a new index
            sourceString = sourceString.substring(currEndIndex + 3); 
        }
    }
}
