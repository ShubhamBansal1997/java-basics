/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 15:03:40
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 15:04:32
* continue statement
*/

class continue1 {
    public static void main(String[] args) {
      for(int i=1;i<=10;i++){
        if(i==5){
          continue;
        }
        System.out.println(i);
      }
    }
}
