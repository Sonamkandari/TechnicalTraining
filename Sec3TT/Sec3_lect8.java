public class Sec3_lect8 {
    public static void main(String[] args) {
        //loops are used for repeating things
        int num=724;
        int count =0;
        //make number small till it became zero
        while(num!=0){
        //num=num/10;
        num/=10;
        count++;
        }
        System.out.println("Count digit:"+count);

        
    }
}
