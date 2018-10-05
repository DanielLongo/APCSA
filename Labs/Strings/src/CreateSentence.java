public class CreateSentence {
    private String[] nouns;
    private String[] verbs;
    private String[] adjs;
    private String[] determiners;
    private String[] adverbs;
    private String[] prepositions;

    public CreateSentence() {
        nouns = new String[]{"puppy", "pizza", "snake", "doorbell", "girl", "building"};
        verbs = new String[]{"jumps", "runs", "flies", "eats", "makes", "wants", "sings", "skips"};
        adjs = new String[]{"little", "silly", "funny", "stuffy", "shady", "hopeful", "graceful"};
        determiners = new String[]{"the", "my", "your", "his", "her", "our", "their", "Fred's"};
        adverbs = new String[]{"quickly", "happily", "smoothly", "often", "very", "never"};
        prepositions = new String[]{"over", "near", "on top of", "behind", "next to", "inside of", "under"};

    }

    public String random_value(String[] x){
        int random_index = (int)(Math.random() * x.length);
        return x[random_index];
    }

    public String getSentence() {
        String sentence = getNounPhrase() + " " + getVerbPhrase() + " " + getPrepositionPhrase() + ".";
        sentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
        return sentence;
    }
    public String getNounPhrase() {
        return getRandomDeterminers() + " " + getRandomAdj() + " " + getRandomNoun();
    }

    public String getPrepositionPhrase() {
        return getRandomPreposition() + " the " + getRandomNoun();
    }

    public String getVerbPhrase() {
        return getRandomAdverb() + " " + getRandomVerb();
    }

    public String getRandomNoun() {
        return random_value(nouns);
    }

    public String getRandomVerb() {
        return random_value(verbs);
    }

    public String getRandomAdj() {
        return random_value(adjs);
    }

    public String getRandomAdverb() {
        return random_value(adverbs);
    }

    public String getRandomPreposition() {
        return random_value(prepositions);
    }

    public String getRandomDeterminers() {
        return random_value(determiners);
    }
}
