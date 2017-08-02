import java.util.ArrayList;
import java.util.List;

/**
 * Created by emma on 8/2/17.
 */
public class Sentence {

    private String sentence;
    public List<Integer> getBlankPositions() {

        char[] letters = sentence.toCharArray();
        ArrayList<Integer> positions = new ArrayList<Integer>();

        for(int i = 0; i < letters.length; i++) {

            if(Character.isWhitespace(letters[i])) {
                positions.add(i);
            }

        }

        return positions;

    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
