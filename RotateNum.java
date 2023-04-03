//Write a program to take a three-digit number from the user and rotate its digits by one position towards the right 

import java.util.*;
class RotateNum{
    public static void main(String args[]){
        Scanner sc= new  Scanner(System.in);
        System.out.println("Enter Three Digit Number: ");
        int num=sc.nextInt();
        int tem=num;
        int count=0,num2=0 ;
        while(num!=0){
           int rem=num%10;
            count++;
            num=num/10;
            if(count==4)
               break;
        }
        if(count==4){
            System.out.println("Not a Three Digit Number");
        }else{
            System.out.println((tem%10)*100+(tem/10));
        }
    }
}