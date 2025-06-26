public class ContainerWith {
public static int maxArea(int[] height) {
        int maxarea=0;
     for(int i=0;i<height.length;i++){
        for(int j=height.length-1;j>0;j--){
            int Height=Math.min(height[i],height[j]);
            int width=j-i;
            int area=Height*width;
            maxarea=Math.max(maxarea,area);
        }
     }
     return maxarea;
    }
  public static void main(String[] args) {
    int []height={1,7,2,38};
    int result=maxArea(height);
    System.out.println(result);

  }
    
}
