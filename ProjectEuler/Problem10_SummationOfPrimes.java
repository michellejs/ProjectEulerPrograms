
/**
 * Write a description of class Problem10_SummationOfPrimes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.
public class Problem10_SummationOfPrimes
{
      public static void main(String args[]){
       long primeSum = 0;
       for(int i=0; i<2000000; i++){
          if(isPrime(i)){
             primeSum += i;
          }
        }
        System.out.println(primeSum);
       
   }
   private static boolean isPrime(long n) {
        if(n < 2) return false;//less then two not prime - this doesn't take account 1 (apparently 1 is not a prime according to my research)
        if(n == 2 || n == 3) return true;//recognizes two and 3 as primes
        if(n%2 == 0 || n%3 == 0) return false;//rejects all factors of 2 and 3
        long sqrtN = (long)Math.sqrt(n)+1;//square root truncated +1
        for(long i = 6L; i <= sqrtN; i += 6) {//This part I need to figure out
            if(n%(i-1) == 0 || n%(i+1) == 0)
               return false;
        }
            return true;
    }
}
