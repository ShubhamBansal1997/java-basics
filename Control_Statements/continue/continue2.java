/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 15:05:25
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 15:06:29
*/

class continue2 {
    public static void main(String[] args) {
      for(int i=0;i<=3;i++){
        for(int j=1;j<=3;j++){
          if(i==2&&j==2){
            continue;
          }
          System.out.println(i+" "+j);
        }
      }
    }
}
