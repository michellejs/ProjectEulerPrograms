
/**
 * Write a description of class Problem4_LargestPalindromeProduct here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem4_LargestPalindromeProduct
{
    

    //A palindromic number reads the same both ways. The largest palindrome made 
    //from the product of two 2-digit numbers is 9009 = 91 × 99.
    //Find the largest palindrome made from the product of two 3-digit numbers.
   public static void main(String args[]){
       int product;
       int highestPalindrome = 0;       
        //start with the highest possible numbers that way the first palindrome we find will be the highest
           for(int i = 999; i>100; i--){
               for(int j = 999; j>100; j--){
                   product = i*j;
                   if(isPalindrome(product))
                   {
                       System.out.println("Palindrome" + product);
                       if(product > highestPalindrome){
                                highestPalindrome = product;
                       
                       }
                   }
            }
        }
       System.out.println(highestPalindrome);
       
   }
   public static int reverse(int number) {

        int result = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            result = result * 10 + lastDigit;
            number = number / 10;
        }

        return result;
    }

    public static boolean isPalindrome(int number) {
        if(number == reverse(number)){
            System.out.println("palindrome" + number);
            return true;
        }
        else
        return false;
        //return number == reverse(number);
    }
    public static boolean isPalindrome(String value1){
                StringBuilder sb1 = new StringBuilder(""+value1);
                String sb2 = ""+value1;
                sb1.reverse();
                if(sb2.equals(sb1.toString())) {
                  return true;
               } 
               return false;
        
    }
    //Palindrome String Checker using recursion
   //Params String string - current string to test for palindrome
    //Returns True if palindrome
    //If the string is 1 or less returns true, else if the next two letters match
    //recursively calls check(String str) with a smaller substring. If not a palindrom
    //returns false
    private static Boolean check (String str) 
    {
        if ( str.length() <= 1) 
        {
            return true;
        }
        else 
        {
            String subString = str.substring(1,(str.length()-1));
            if ( (str.charAt(0) == str.charAt(str.length()-1)) && check(subString))
            {
                return true;
            }
            else 
            {
            return false;
            }
        }
    }
}
/*
 * 
/**
 * Michelle Skolly
 * Student #3121226
 * Comp272
 * 
 * PalindromeCheck
 * This Program checks a user inputted string to determine if it is a palindrome.
 * 
 * Test Data:
 * Input: Able was I ere I saw Elba. Output: "yes, it is a palindrome"
 * Input: A man, a plan, a canal--Panama!  Output: "yes, it is a palindrome"
 * Input: This is not a palindrom! Output: "no, it is not a palindrom"
 *
 * I implemented this program as part of the problems given in the text. I at first
 * had some trouble understanding the uses of char[]'s vs Strings and asked this
 * question in the courses online forum: http://scis.lms.athabascau.ca/mod/forum/discuss.php?d=36929#p108949 
 */
/*
import java.util.Scanner;
public class PalindromeCheck
{
    //Prompts user to enter a string. Removes everything from the string
    //except numbers and letters and makes the string lowercase. Then calls
    //checkPalindrom(str) to determine if the input is a palindrom.
    public static void main(String[] args)
    {
        System.out.println("Please enter a string to check for palindrome: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.replaceAll("[\\W_]", "");
        System.out.println(str);
        checkPalindrome(str.toLowerCase());
    }    
    //Params String str
    //Calls check(str) to determine if str is a palindrome. 
    //Prints message to consoie indicating if str is a palindrome or not.
    private static void checkPalindrome (String str) 
    {
       if (check (str))
       {
           System.out.println("yes, it is a palindrome\n");
       }
       else 
       {
            System.out.println("No, it is not a palindrome");
       }
    }
    //Params String string - current string to test for palindrome
    //Returns True if palindrome
    //If the string is 1 or less returns true, else if the next two letters match
    //recursively calls check(String str) with a smaller substring. If not a palindrom
    //returns false
    private static Boolean check (String str) 
    {
        if ( str.length() <= 1) 
        {
            return true;
        }
        else 
        {
            String subString = str.substring(1,(str.length()-1));
            if ( (str.charAt(0) == str.charAt(str.length()-1)) && check(subString))
            {
                return true;
            }
            else 
            {
            return false;
            }
        }
    }

} 

 

 */
