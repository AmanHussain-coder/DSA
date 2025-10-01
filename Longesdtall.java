import java.util.ArrayList;

public class Longesdtall {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "kiwi", "blueberry", "grapeeeee"};
        
        // Find max length first
        int maxLength = 0;
        for(String word : words) {
            if(word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        
        // Find all words with max length
        ArrayList<String> longestWords = new ArrayList<>();
        for(String word : words) {
            if(word.length() == maxLength) {
                longestWords.add(word);
            }
        }
        
        System.out.println("Longest strings: " + longestWords);
        System.out.println("Length: " + maxLength);
    }
}