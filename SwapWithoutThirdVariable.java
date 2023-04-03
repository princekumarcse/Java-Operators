//Write a program to swap values of two int variables without using a third variable. 
import java.util.*;
class SwapWithoutThirdVariable{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Two Numbers: ");
    int num1=sc.nextInt();
    int num2=sc.nextInt();

    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;
    System.out.println("Swapped Value is : "+num1+" and "+num2);
}
}