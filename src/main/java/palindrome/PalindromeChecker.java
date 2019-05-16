package palindrome;

public class PalindromeChecker {
    public static void main(String[] args) {
        String mayPalindrome=args[0];
        System.out.println(isPalindrome(mayPalindrome));
    }
    public static Boolean isPalindrome(String maybepalindrome){
        if(maybepalindrome.length()==1){
            return true;
        }
        else if(maybepalindrome.length()==0){
            return true;
        }
        else if(isSingular(maybepalindrome)){
            return isPalindrome(maybepalindrome.substring(1,maybepalindrome.length()-1));
        }
        return false;
    }

    private static boolean isSingular(String maybepalindrome) {
        return maybepalindrome.charAt(0)==maybepalindrome.charAt(maybepalindrome.length()-1);
    }
}

