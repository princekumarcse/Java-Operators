//. Write a program to print unit digit of a given number 
import java.util.*;
class UnitDigit{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A Number: ");
    int num=sc.nextInt();
    int unitd=num%10;
    System.out.println("Unit Digit of "+num+ " is: "+unitd );
    }
}