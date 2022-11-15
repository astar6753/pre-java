package mission6_221107.additional1.wordrelay;

public class Rule {
    private String currentWord = TextContent.START_WORD;

    public Boolean isPass(String nextWord) {
        char first = nextWord.charAt(0);
        char last = this.currentWord.charAt(this.currentWord.length()-1);
        return last == first;
    }

    public void next(String nextWord) {
        if(!isPass(this.currentWord)){

        }
        this.currentWord = nextWord;
    }
}
