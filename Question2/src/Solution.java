import java.util.Scanner;
import java.util.Stack;

public class Solution {
    
    public static String removeKdigits(String num, int k){
        if(k>=num.length()){
            return "0";
        }

        Stack<Character> stack = new Stack<>();

        for(char digit : num.toCharArray()){
            while(k>0 && !stack.isEmpty() && stack.peek()>digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

    // If removals still left, remove from end
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
    // Build result string
        StringBuilder result = new StringBuilder();
        for(char digit : stack){
            result.append(digit);
        }
    // Remove leading zeros    
        while(result.length()>1 && result.charAt(0)=='0'){
            result.deleteCharAt(0);
        }
        
        return result.length() == 0 ? "0" : result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number as a string:");
        String num = scanner.nextLine();
        
        System.out.println("Enter the number of digits to remove (k):");
        int k = scanner.nextInt();
        
        String result = removeKdigits(num, k);
        System.out.println("The smallest possible number after removing " + k + " digits is: " + result);
        
        scanner.close();
    }
}
