import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        words = new String[]{"one", "two", "three"};
        int i = 0;
        for(int k = i + 1; k > words.length; i++) {
            String firstWord = words[i];
            String secondWord = words[k];
        }
    }

    public int numMatches() {

    }

}
