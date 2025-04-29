public class table {
    
    static String ComputeTable(int num,int val){
        //Base case
        if(val==0){
            return " ";
        }

        String result=ComputeTable(num, val-1);
        String Expression=num+"*"+val+"="+(num*val)+"\n";
        return result+Expression;

    }
   

    static void computeTable(int num,int i){
         //Base case
        if(i==0){
            return;
        }
       
      
       
       //small problem 
        computeTable(num,i-1);
        //stack fall
        int result=num*i;
        System.out.println(""+num+"x"+i+"= "+result+""  );  


    }
    public static void main(String[] args) {
        computeTable(5,10);

        String r=ComputeTable(5, 10);
        System.out.println(r);
        
    }
    
}
