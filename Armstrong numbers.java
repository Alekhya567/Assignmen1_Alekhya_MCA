
//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
      //sum to be long to hold even large integers
        long sum =0;
      //take back up of n as num
        int num = n;
      //if n<=0 no more digits to check
        while(n>0)
         {
      //Math class has power function that returns first argument to the power of 2nd argument
      //Type casted int result of power to long
             sum+=(long)Math.pow(n%10,3);
      //n=n/10 will deletes checked digit from n
             n=n/10;
         }
       //typecast num to long type to match type of sum
      if (sum==(long)num)
        //"Yes" and "No" are strings as return type is string
           return "Yes";
        else 
           return "No";
         
    }
}
