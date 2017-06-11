/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 15:30:52
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 15:32:29
* Palindrome of a number
*/

class Palindrome {
    public static void main(String[] args) {
      int r, sum=0,temp;
      int n=454;

      temp =n;
      while(n>0){
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
      }
      if(temp==sum)
        System.out.println("pallindrome number");
      else
        System.out.println("not Palindrome");
    }
}
