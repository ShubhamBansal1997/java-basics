/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 04:19:06
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 04:22:30
* Assignment operator Adding Short
*/

class OperatorExample12 {
    public static void main(String[] args) {
      short a = 10;
      short b = 10;
      //a+=b;//a=a+b internally so fine
      //a = a + b;//Compile time error because 10+10=20 now int
      // to remove the above error we add a typecast
      a = (short)(a+b);
      System.out.println(a);
    }
}
