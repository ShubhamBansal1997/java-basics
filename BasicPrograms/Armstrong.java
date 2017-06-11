/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 23:39:38
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-12 04:56:57
* Armstrong of the number
* 153 =
* ==> (1*1*1)+(5*5*5)+(3*3*3) = 157
* So it's a armstrong
*/

class Armstrong {
    public static void main(String[] args) {
      int c=0,a, temp;
      int n=153;
      temp = n;
      while(n>0){
        a=n%10;
        n=n/10;
        c=c+(a*a*a);
      }
      if(temp==c){
        System.out.println
      }
    }
}
