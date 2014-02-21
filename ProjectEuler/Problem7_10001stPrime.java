
/**
 * Write a description of class Problem7_10001stPrime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem7_10001stPrime
{
   public static void main(String args[]){
       int primeNum = 0;
       int counter = 0;
       do{
          //test if current iteration is prime / if isPrime increment primeNum
          counter++;
          if(isPrime(counter)){
             primeNum++;
          }
        }while (primeNum < 10001);
        System.out.println(counter);
       
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
