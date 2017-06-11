/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 06:03:25
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 06:06:56
* break out of inner loop
*/

class break2 {
    public static void main(String[] args) {
      for(int i=1;i<=3;i++){
        for(int j=1;j<=3;j++){
          if(i==2&&j==2){
            break;
          }
          System.out.println(i+" "+j);
        }
      }
    }
}
