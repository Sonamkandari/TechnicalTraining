public class code1 {
    static void printName(int num){
        //for stoping the recursion
        // termination case or base case
        if(num==0){
            return ;
        }
        System.out.println("Sonam"+num);// pre logic
        //num -1 //small problem
       printName(num-1);//this will call the function repeatedly until the stack memory get fill and generate a stack overflow message
       System.out.println("Kandari"+num);// post logic
    }
    public static void main(String[] args) {
        // we can stop this if we gave some parameters inside this function which will tell that how many times it should call
        printName(5);
    }
}
