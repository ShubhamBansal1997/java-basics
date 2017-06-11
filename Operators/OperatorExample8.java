/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 03:56:27
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 04:00:01
* AND Operator Example: Logical && and. Bitwise &
*/

class OperatorExample8 {
    public static void main(String[] args) {
      int a = 10;
      int b = 5;
      int c = 20;
      System.out.println(a<b&&a++<c); // false  && true
      System.out.println(a); // 10 because second condition is not checked
      System.out.println(a<b&a++<c); // false && true
      System.out.println(a); // 11 because second condition is checked
    }
}
