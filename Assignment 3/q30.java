/**
 W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice ");
        char choice = sc.next().charAt(0);

        if(choice=='c'){
            System.out.println("Enter fahrenheit ");
            float fer = sc.nextFloat();
            float cel = (fer-32)*5/9;
            System.out.println("fahrenite to celcius is = "+cel);
        }else{
           System.out.println("Enter celcius ");
            float  cel = sc.nextFloat();
            float fer = (cel*9/5)+32;
            System.out.println("celcius to fahrenite is = "+fer);
        }
        
    }
}