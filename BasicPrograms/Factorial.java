/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 15:33:28
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 15:35:14
* Factorial using loop
*/

class Factorial {
    public static void main(String[] args) {
      int i, fact=1;
      int number=5;
      for(i=1;i<=number;i++){
        fact=fact*i;
      }
      System.out.println("Factorial of "+number+" is: "+fact);
    }
}
