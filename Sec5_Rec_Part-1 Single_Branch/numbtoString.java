public class numbtoString {
    static void numbtoString(int num){

        //using.





        String words[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        if(num==0){
            return;
        }

        // small problem
        numbtoString(num/10);
        int digit=num%10;
        System.out.println(words[digit]+" ");// using HAshing



        // switch (key) {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }

    }
    public static void main(String[] args) {
        numbtoString(123);
    }
    
}
