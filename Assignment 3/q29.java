/**
 WAP to check given year is a leap year or not
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year ");
        int year = sc.nextInt();

        if(year%4 == 0){
            System.out.println(+year+" is leap year");
        }else if(year%400 == 0){
            System.out.println(+year+" is leap year");
        }else{
            System.out.println("it is not a leap year ");
        }
        
    }
}