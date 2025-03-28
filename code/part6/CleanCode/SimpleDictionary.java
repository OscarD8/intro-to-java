package part6.CleanCode;


public class SimpleDictionary
{
    private WordList dictionary;

    public SimpleDictionary() {
        this.dictionary = new WordList();
    }

    public String translate(String word) {
        try {
            if (this.dictionary.contains(word)) {
                return dictionary.getWord(dictionary.getIndex(word) + 1);
            }
        } catch (IndexOutOfBoundsException e) {
            return "Error. " + word + " looks to be a translation of " +
                    dictionary.getWord(dictionary.getIndex(word) - 1);
        }
        return "Unable to locate " + word + " in the dictionary.";
    }

    public void add(String sourceWord, String translatedWord) {
        if (this.dictionary.contains(sourceWord)) {
            System.out.println("Entry already made for: " + sourceWord);
            return;
        }
        this.dictionary.add(sourceWord);
        this.dictionary.add(translatedWord);
    }

}
