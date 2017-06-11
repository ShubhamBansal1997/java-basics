/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 04:09:36
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 04:12:40
* OP Operator: Logical || and Bitwise |
*/

class OperatorExample9 {
    public static void main(String[] args) {
      int a = 10;
      int b = 5;
      int c = 20;
      System.out.println(a>b||a<c); // true || true = true
      System.out.println(a>b||a<c); // true || true = true
      System.out.println(a>b||a++<c); // true || true = true
      System.out.println(a); // 10 because second condition is not checked
      System.out.println(a>b|a++<c); // true | true = true
      System.out.println(a); // 11 because second condition is checked
    }
}
