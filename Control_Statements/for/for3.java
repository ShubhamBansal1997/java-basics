/*
* @Author: Shubham Bansal
* @Date:   2017-06-11 05:31:05
* @Last Modified by:   Shubham Bansal
* @Last Modified time: 2017-06-11 05:33:59
* having name for each for-loop
* help to break and continue specific loop
*/

class for3 {
    public static void main(String[] args) {
      aa:
        for(int i=1;i<=3;i++){
          bb:
            for(int j=1;j<=3;j++){
              if(i==2&&j==2){
                break aa;
              }
              System.out.println(i+" "+j);
            }
        }

    }
}
