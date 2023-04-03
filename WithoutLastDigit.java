//Write a program to print a given number without its last digit. 

import java.util.*;
class WithoutLastDigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Numbers: ");
        int num=sc.nextInt();
        int lastd=num%10;
        num=num-lastd;
        System.out.println("Given Number without Last Digit is : "+num);
    }
}