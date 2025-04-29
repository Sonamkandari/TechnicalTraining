public class ArrayCountEvenOdd {
    static String printTable(int num,int count){
         
        if(num==0){   
            return " ";// blank string
            
        }
        //int table=num*count;
        //return printTable(num, count-1);

        String r=printTable(num, count-1);
        String exp=num +"*"+count+"="+(num*count);
        return r+exp+"\n";
    }
    public static void main(String[] args) {
        String r=printTable(5, 10);
        System.out.println(r);
        
    }
    
}
