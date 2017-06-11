/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 05:34:34
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 05:36:13
* Label - 2
* performing basic break
*/

class for4 {
    public static void main(String[] args) {
      aa:
        for(int i=1;i<=3;i++){
          bb:
            for(int j=1;j<=3;j++){
              if(i==2&&j==2){
                break bb;
              }

              System.out.println(i+" "+j);
            }
        }
    }
}
