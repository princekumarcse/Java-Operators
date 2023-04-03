//Write a program to find the position of first 1 in LSB. 

import java.util.*;
class PositionOfOne{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int count=0,sum=0;
        while(num!=0){
            int unitd=num%10;
            sum=sum+unitd;
            count++;
            num=num/10;
            if(count==4){  
               break;
            }
        }
        if(count==4){
          System.out.println("Not a Three Digit Number");
        }
        else{
       System.out.println("Sum is : "+sum);
        }
        
    }
}