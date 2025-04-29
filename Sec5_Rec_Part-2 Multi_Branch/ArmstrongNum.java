public class ArmstrongNum {
    static int digitCount(int num){
     
        //Base case
        if(num==0){
            return 0;
        }
        int count=digitCount(num/10);
        return count+1;

    
        }
        
    static void computeArm(int num,int sum,int copy){
        //Base case
        if(num==0){
            if(sum==copy){
                System.out.println("yes it is a  armStrong number");
            }else{
                System.out.println("not a arm strong number");
            }
            return;
        }

        int count= digitCount(copy);
        //small problem
        int digit=num%10;
        int result=(int)Math.pow(digit,count);
        sum=sum+result;
      // recursively call this logic
      computeArm(num/10,sum,copy);


    }
    public static void main(String[] args) {

        computeArm(153, 0, 153);
        
    }
    
}
