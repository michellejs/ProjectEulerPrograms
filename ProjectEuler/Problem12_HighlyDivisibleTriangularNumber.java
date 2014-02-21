
/**
 * Write a description of class Problem12_HighlyDivisibleTriangularNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 

The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

     1: 1
     3: 1,3
     6: 1,2,3,6
    10: 1,2,5,10
    15: 1,3,5,15
    21: 1,3,7,21
    28: 1,2,4,7,14,28

We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?

 */
public class Problem12_HighlyDivisibleTriangularNumber
{
    public static void main(String args[]){
        int counter = 0;
        int number = 0;
        boolean found = false;
        int numOfFactors;
        while(!found){
            numOfFactors = 0;//to account for one being the first factor
            number += counter;
            //System.out.println(number);
            for(int i=1; i<=number; i++)
            {
                //System.out.println(isFactor(i,number) + "  " + i + "   " + counter);
                if(isFactor(i,number)){
                    numOfFactors++;
                }
            }
            if(numOfFactors > 500){
                found = true;
                
            }
            counter++;
            //System.out.println(numOfFactors);
        }
        System.out.println(number);
    }
    public static boolean isFactor(int possibleFactor, int number){
        if(number>0 && number%possibleFactor == 0)
            return true;
        
        return false;
        
    }

}
