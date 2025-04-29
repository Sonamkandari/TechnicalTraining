public class LoopsAndTypes {
    public static void main(String[] args) {
        //while loop ->condition

        int j=1;// start
        while (j<=10) {//condition
            System.out.println("sonam");
            j++;// increment or decrement operation
            
        }


     // For loop the starting point , condition , and increment will takes place  in a single line

     for(int i=0;i<10;i++){
        System.out.println("Kandari");
     }


     // do while
     int h=20; // starting point

     do{
        System.out.println("HELLO");// statement -> loop will run at most one time  
        h++;  // out put is only a single time hello because our condition is not true there fore we are not able to print the value of hello or since it is a property of 
        // Do while statement will be printed one time before checking the condition
     }while(h<10);// condition

     // enhance for loop
     // this for loop is created for traversing a array

     int arr[]={12,23,14,35,45};
     // traditional way of traversing an array we use an for loop
     for(int g=0;g<arr.length;g++){
        System.out.println(arr[g]);// this will print all the array elements
     }

     //enhance for loop
     for(int s:arr){// it is used when the user want to traverse only a single direction 
        System.out.println(s);
     }

    }
    
}
