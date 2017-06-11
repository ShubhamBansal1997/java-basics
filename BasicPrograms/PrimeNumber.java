/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 15:26:04
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 15:29:23
* To display prime number
* 0 & 1 are not prime
* 2 is only even prime
*/

class PrimeNumber {
    public static void main(String[] args) {
      int i,m=0,flag=0;
      int n=17;
      m=n/2;
      for(i=2;i<=m;i++){
        if(n%i==0){
          System.out.println("Number is not prime");
          flag=1;
          break;
        }
      }
      if(flag==0)
        System.out.println("Number is prime");
    }
}
