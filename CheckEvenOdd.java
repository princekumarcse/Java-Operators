//Write a program to check whether the given number is even or odd. 
import java.util.*;
class CheckEvenOdd{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
            System.out.println("Enter Number: ");
            int num=sc.nextInt();
            if(num%2==0){
                System.out.println(num+" Is Even " );
            }else{
                System.out.println(num+" Is Odd " );
            }
                
        
    }
}