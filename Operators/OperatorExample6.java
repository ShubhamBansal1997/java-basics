/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 03:49:35
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 03:52:16
* >> vs >>>
* For positve number both works same
* but got negative number >>> changes parity bit(MSB) to 0
*/

class OperatorExample6 {
    public static void main(String[] args) {
      // for positive number
      System.out.println(20>>2);
      System.out.println(20>>>2);
      // for negative number
      System.out.println(-20>>2);
      System.out.println(-20>>>2);
    }
}
