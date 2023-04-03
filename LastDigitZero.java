//Write a program to make the last digit of a number stored in a variable as zero. (

    import java.util.*;
    class LastDigitZero{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A Number: ");
            int num=sc.nextInt();
            int  lastDigit=num%10;
            num=num-lastDigit;
            System.out.println("Number is : "+num);

        }
    }