
/**
 * Write a description of class Problem6_SumSquareDifference here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * 

The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

 */
public class Problem6_SumSquareDifference
{
    public static void main(String args[]){
        int sumOfSquares = 0;
        int sum =0;
        double squareOfSum;
        for(int i=1; i<101; i++)
        {
            sumOfSquares += Math.pow(i,2);
            sum += i;
        }
        squareOfSum = Math.pow(sum,2);
        System.out.println(sumOfSquares);
        System.out.println(squareOfSum);
        System.out.println(squareOfSum - sumOfSquares);
    }
}
