
/**
 * Write a description of class Problem9_SpecialPythagoreanTriplet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 */
//ended i at 998 because a is less then b. I could probably end i and j much lower since c needs to be
//greater than b, however I just change i and j to values large enough to end the loop and thus the 
//program once the answer is found.
//a^2+b^2=c^2 and a+b+c=1000
public class Problem9_SpecialPythagoreanTriplet
{    
    
    public static void main(String args[]){
        double a;
        double b;
        double c;
        for(int i = 1; i<998; i++){
            for(int j=i+1; j<999; j++){
                a = i;
                b = j;
                c=Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
                if((a<b && b<c) && a+b+c == 1000){
                    System.out.println(a*b*c);
                    i =1000;
                    j =1000;
                }   
            }
        }
    }
}
