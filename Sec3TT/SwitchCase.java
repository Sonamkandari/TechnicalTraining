public class SwitchCase {
    public static void main(String[] args) {
        // Switch case with String 

        //Switch case with int, byte, long, Sort,Double
       int item=4;
        final int sunday =1;
        final int Monday =2;
        final int Tuesday=3;
        final int Wednesday =4;
        final int Thursday =5;
        final int Friday =6;

        switch (item) {
            case 1:
            System.out.println("Sunday");    
                break;
            case 2:
            System.out.println("Monday");    
                break;
            case 3:
            System.out.println("Tuesday");    
                break;
            case 4:
            System.out.println("Wednesday");    
                break;
            case 5:
            System.out.println("Thursday");    
                break;
            case 6:
            System.out.println("Friday");    
                break;
            case 7:
            System.out.println("Saturday");    
                break;
        
            default:
                break;
        }
        


        
      // from java 7 onwords String is allowed +
        String Day="sunday";
        
        switch (Day) {
            case "sunday":
            System.out.println("Sunday");    
                break;
            case "tuesday":
            System.out.println("Monday");    
                break;
            case "wednesday":
            System.out.println("Tuesday");    
                break;
            case "thursday":
            System.out.println("Wednesday");    
                break;
            case "Friday":
            System.out.println("Thursday");    
                break;
            case "Saturday":
            System.out.println("Friday");    
                break;
            case "Sunday":
            System.out.println("Saturday");    
                break;
        
            default:
                break;
        }


        // But java 14 onwords 
        // Arrow functions
        //using arrow there is no fall in the code 
        // then we don't use break statement
        String day="sunday";
        
        switch (day) {
            case "sunday"->{
            System.out.println("Sunday"); 
            }   
            case "tuesday"->{
            System.out.println("Monday");
            }        
            case "wednesday"->{
            System.out.println("Tuesday"); 
            }   
            case "thursday"->{
            System.out.println("Wednesday"); 
            }   
            case "Friday"->{
            System.out.println("Thursday");
            }    
            case "Saturday"->{
            System.out.println("Friday"); 
            }   
            case "Sunday"->{
            System.out.println("Saturday"); 
            } 
            //yield is use to stop the current thread and gave chance to the another thread
            
        
        
                
        }

    }
    
}
