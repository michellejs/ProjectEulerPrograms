
/**
 * Write a description of class Problem3_LargestPrimeFactor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem3_LargestPrimeFactor
{
    public static void main(String args[]){
        //The prime factors of 13195 are 5, 7, 13 and 29.
        //What is the largest prime factor of the number 600851475143 ?
        
        //Java truncates ints and a factor has to be less then the square root of 
        //the size so I am going to start there
        long num = 600851475143L;
        //square root returns a double but I will cast is as in int in the loop
        double squareRtNum = Math.sqrt(num); 
        long largestPrime = 0L;
        //Start with squareRtNum and work towards 0
        //Determine if a number is a factor of num
        //If it is a factor of num determine if it is prime. 
        //First Prime Wins
        for(long i=(int)squareRtNum; i>0; i--)
            if(i%2 != 0){//make sure it is odd
                if(num%i == 0){//make sure it is a factor    
                    if(isPrime(i)){
                        largestPrime = i;
                        break;
                    }
                }
            }
            
         System.out.println(largestPrime);
    }
    //I got this isPrime method here: http://stackoverflow.com/questions/14650360/very-simple-prime-number-test-i-think-im-not-understanding-the-for-loop
    //I understand most of it but I am slightly unclear on final part so far
    private static boolean isPrime(long n) {
        if(n < 2) return false;//less then two not prime - this doesn't take account 1
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
