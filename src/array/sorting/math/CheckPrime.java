package array.sorting.math;
public class CheckPrime {




    /**
     * Write a function which checks if a number is prime or not.
     *
     * Input: int n
     * Output: boolean, true if number is prime else false.
     *
     * A prime number is only divisible by 1 and number itself.
     *
     * Time complexity: O(sqrt(n))
     * Space complexity: O(1)
     *
     * check if 16 is a prime number:
     *
     * check for divisibility by: 2,3,4,5,6,7,8,9,10,11,12,13,14,15,
     *
     * example: 16 = 2* 8 which is checked by dividing by 2
     * 16 = 8*2
     *
     * All you need to do is check till sqrt(n) -> sqrt(16) = 4
     */
    static boolean isPrime(int n){
        if(n==1){
            return false;
        }

        for(int i=2; i<= (int) Math.sqrt(n); i++){
            if(n%i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 1000000;

        // Total time complexity: O(n*sqrt(n))
        for(int i=1; i<=n;i++){  // O(n)

            if(isPrime(i)){ // O(sqrt(n))
                System.out.println(i+" is prime");
            }
        }
    }
}

