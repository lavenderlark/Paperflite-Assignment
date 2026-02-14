import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false; // Length mismatch
        }
        
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(w)) {
                    return false; // Pattern character maps to a different word
                }
            } else {
                charToWord.put(c, w);
            }
            
            if (wordToChar.containsKey(w)) {
                if (wordToChar.get(w) != c) {
                    return false; // Word maps to a different pattern character
                }
            } else {
                wordToChar.put(w, c);
            }
        }
        
        return true; // Pattern matches
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter pattern:");
        String pattern = scanner.nextLine();
        
        System.out.println("Enter string:");
        String s = scanner.nextLine();
        
        boolean result = wordPattern(pattern, s);
        System.out.println("String follows the pattern: " + result);
        
        scanner.close();
    }
}
