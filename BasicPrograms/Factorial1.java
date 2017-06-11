/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 23:35:58
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 23:39:12
* Factorial using recursion
*/


class Factorial1 {
    static int factorial(int n){
      if(n==0)
        return 1;
      else
        return (n*factorial(n-1));
    }
    public static void main(String[] args) {
      int i, fact=1;
      int number=4;
      fact = factorial(number);
      System.out.println("Factorial of "+number+" is: "+fact);
    }
}
