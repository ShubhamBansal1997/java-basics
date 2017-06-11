/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 15:22:19
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 15:25:08
* Fibonacci using recursion
*/

class Fibonacci1 {
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count){
      if(count>0){
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print(" "+n3);
        printFibonacci(count-1);
      }
    }
    public static void main(String[] args) {
      int count=10;
      System.out.print(n1+" "+n2);
      printFibonacci(count-2);
    }
}
