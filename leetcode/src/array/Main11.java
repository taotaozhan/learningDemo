package array;

public class Main11 {

//  public  int maxArea(int[] height){
//    int maxera = 0;
//    for (int i = 0; i < height.length;i++ ){
//      for (int j = i + 1; j < height.length; j++ ){
//        maxera = Math.max(maxera,Math.min(height[i],height[j] * (j - i)));
//      }
//    }
//    return maxera;
//  }
  public int maxArea(int[] height) {
    int maxera = 0;
    int l = 0;
    int r = height.length - 1;
    while (l < r) {
      maxera = Math.max(maxera,Math.min(height[l],height[r]) * (r - 1 ));
      if ( height[l] < height[r] ) {
        l++;
      }else {
        r--;
      }
    }
    return maxera;
  }

  public static void main(String[] args) {

  }


}
