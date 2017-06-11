/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 15:09:23
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 15:22:39
* Simple Fibonacci using recursion
*/

class Fibonacci {
    public static void main(String[] args) {
      int n1=0,n2=1,i,count=10,n3;
      System.out.print(n1+" "+n2);
      for(i=2;i<count;++i){
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
      }
    }
}
