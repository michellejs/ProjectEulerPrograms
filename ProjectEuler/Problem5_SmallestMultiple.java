
/**
 * Write a description of class Problem5_SmallestMultiple here.
 * 
Project Euler Problem 5 Smallest Multiple
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 * Michelle Skolly
 * May 2014
 */
public class Problem5_SmallestMultiple
{
    public static void main(String[] args){
        //Use only multiples of twenty
        //creating an array of numbers to check for
        //Anything which is a multiple of 20 is also a multiple of 10, 5 and 2 so I don't need to check for those
        //Anything which is a multiple of 18 is also a multiple of 9,6,3 and 2
        //Anything which is a multiple of 16 is also a multiple of 8,4, and 2
        //Anything which is a multiple of 15 is also a multiple of 5 and 3
        //Anything which is a multiple of 14 is also a multple of 7 and 2
        int testNumbers[] = new int[]{19,18,17,16,15, 14,13,12,11};
        int currentNumber =2520;//This is the sample number it seems like a place to start
        boolean numberFound = false;
        while(!numberFound){//do this until number found
            numberFound = true;//assume number is correct until proven otherwise
            
            //Divide current number by each number in testArray. If remainder is not zero go to next number
            for(int i=0; i<testNumbers.length; i++){
                if(currentNumber % testNumbers[i] != 0){
                    numberFound = false;
                    break;
                }
                
            }
            
            if(!numberFound)
                currentNumber +=20;
        }
        System.out.println(currentNumber);
        
    }
}
