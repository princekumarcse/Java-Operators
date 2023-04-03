//Assume price of 1 USD is INR 76.23. Write a program to take the amount in INR and convert it into USD. 

import java.util.*;

class InrToUsd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter INR: ");
        float Inr=sc.nextFloat();
        float usd=(1/76.23f)*Inr;
        System.out.println(Inr +"Rupee is Usd is : "+usd);
    }
}