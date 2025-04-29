//creating an another class here

import java.util.Scanner;

class ArrayOperations{
    //here we are declaring an array with out giving a specific size to it
     int arr[];
     int size;

     // here we are taking a constructor of our class
     //note constructor will always has a same name as class name

     ArrayOperations(int capacity){
        arr=new int[capacity];//How many elements array can store
        size=0;// how many elements currently it have


     }
     //CRUDE

     //create a function of insertion

  void insert(int position ,int element){
    
    if(size==arr.length){
        System.out.println("I cant insert elements further..");
        return;
    }
    int currectIndex=position-1;
    for(int i= size;i>=currectIndex;i--){
       arr[i+1]=arr[i];
    }
    arr[currectIndex]=element;

    size++;//how many elements we have


  }
  // creating a function for deleting an element
  void remove(int element){
    

  }

  //also create a function for printing 
  void print(){
    //we will extract elements from an array and prints its elements one by one
    for(int elements:arr){
        System.out.print(" "+elements);
    }
    System.out.println();

  }

}

public class CRUDEoperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int capacity=10;
        //creating an object of ArrayOperations class
        // we are passing the capacity of the array which we had created there
        ArrayOperations myobj=new ArrayOperations(capacity);

        
        //creating a menu here so that we can choose what  we want to do
        while(true){
            System.out.println("1.Insertion");
            System.out.println("2.Deletion");
            System.out.println("3.Reverse");
            System.out.println("4.Update");
            System.out.println("5.print");
            System.out.println("Enter the Choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                myobj.insert(1,100);
                myobj.insert(2,200);
                myobj.insert(1,2000);
                break;

                case 5:
                myobj.print();

                break;
                case 6:
                System.exit(0);

            }

        }
        
    }
    
}

