/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 05:14:41
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 05:26:05
* Switch Statment - 2
* Switch Statment is fall through, it executes all statments after first match if break statement is not used with swtich cases
*/

class switch2 {
    public static void main(String[] args) {
      int number = 20;
      switch(number){
        case 10: System.out.println("10");
        case 20: System.out.println("20");
        case 30: System.out.println("30");
        default: System.out.println("Not in 10, 20 or 30");
      }

    }
}
