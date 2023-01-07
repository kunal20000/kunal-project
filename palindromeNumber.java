static void isPalindrome(int N)
        {
        // Your code here
        int sum=0;
        int temp =N;
        while(N>0){
        int r=N%10;
        sum=(sum*10)+r;
        N=N/10;
        }
        if(temp==sum){
        System.out.println("True");
        }else{
        System.out.println("False");
        }

        }