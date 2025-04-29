import java.util.ArrayList;
import java.util.Scanner;

public class evenOddCompute {
//array is basically a reference type

static int[] evenoddelementList(int range,ArrayList<Integer>evenList,ArrayList<Integer>oddList){
//Base Case
if(range==0){
    int result[]=new int[2];
    return result;

}

//small Problem
int result[]=evenoddelementList(range-1, evenList, oddList);
//Logic
if(range%2==0){
    result[0]=result[0]+1;
    evenList.add(range);
}else{
    result[1]=result[1]+1;
    oddList.add(range);
}
return result;


}

    static int[] evenOddElements(int range){
        //Base case
        if(range==0){
            int result[]=new int[2];
            return result;

        }
        //small problem

        int result[]=evenOddElements(range-1);
        //logic
        if(range%2==0){
            result[0]=result[0]+1;//if number is even storing it at the first index
        }else{
            result[1]=result[1]+1;//if number is odd storing it at second index
        }
        return result;


    }
    
    static void countEvenOdd(int range,int even,int odd){
        //Base case
        if(range==0){
            System.out.println("Even Count "+even+" And Count of odd "+odd+"");
            return;
        }
        //Logic for stack building time

        if(range%2==0){
            even++;
        }else{
            odd++;
        }
        //small problem
        countEvenOdd(range-1,even,odd);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of the array");
        int n= sc.nextInt();
        countEvenOdd(n,0,0);
        int arr[]=evenOddElements(n);//calling the function which will be pass the value of even count i an array
        System.out.println("Event count "+arr[0]+"");
        System.out.println("odd count "+arr[1]+"");

        ArrayList<Integer>evenList=new ArrayList<>();
        ArrayList<Integer>oddList=new ArrayList<>();
        int array[]=evenoddelementList(n,evenList,oddList);
        System.out.println("Event count "+array[0]+"");
        System.out.println("odd count "+array[1]+"");

        System.out.println("Even Numbers of Elements"+evenList);
        System.out.println("Odd Numbers of Elements"+oddList);
       
}

 }

