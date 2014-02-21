
/**
 * Write a description of class Problem2_EvenFibonacciNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem2_EvenFibonacciNumbers
{
     public static void main(String[] args) {
       int sum = 2;
       int fib = 0;
       int firstPrev = 2;
       int secondPrev = 1;
       do
       {
            fib = firstPrev + secondPrev;
            if(fib%2 ==0){
                sum += fib;
            }
            secondPrev = firstPrev;
            firstPrev = fib;
        }while(fib <= 4000000);
        System.out.println(sum);
    }
}
//currentnum = previous num + 2nd previous num