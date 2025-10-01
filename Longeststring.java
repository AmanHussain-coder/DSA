public class Longeststring {

public static void main(String[] args) {
    
    String[] words = {"apple", "banana", "kiwi", "strawberry"};

    String longest = words[0];  //Assume first word is longest
    
    for(int i = 0; i < words.length ; i++){
        if(words[i].length() > longest.length()){
        longest = words[i];
        }
    }

    System.out.println("Longest string: " + longest);
        System.out.println("Length: " + longest.length());

}
    
}
