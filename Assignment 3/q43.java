/**
 Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice ");
        String choice = sc.next();

        System.out.println("Enter value 1 ");
        int val1 = sc.nextInt();
        System.out.println("Enter value 2");
        int val2 = sc.nextInt();


        switch(choice){
            case "+":
                System.out.println("add "+(val1+val2));
                break;
            case ">":
                if(val1 > val2)
                    System.out.println("greatest "+val1);
                else
                    System.out.println("geratest "+val2);

                break;

            case "==":
                if(val1 == val2)
                    System.out.println("value is equal ");
                else
                    System.out.println("value is not equal ");

                break;

            default:
                System.out.println("Not right ");
        }
    }
}