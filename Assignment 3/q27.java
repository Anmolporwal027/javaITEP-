/**
 Check given character is vowel or not using switch case
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice for arithmatix op ");
        char choice = sc.next().charAt(0);

        System.out.println("Enter value 1 ");
        int val1 = sc.nextInt();
        System.out.println("Enter value 2");
        int val2 = sc.nextInt();


        switch(choice){
            case '+':
                System.out.println("add "+(val1+val2));
                break;
            case '-':
                System.out.println("substract "+(val1-val2));
                break;
            case '*':
                System.out.println("multiply "+(val1*val2));
                break;
            case '/':
                System.out.println("divide "+(val1/val2));
                break;
           
            default:
                System.out.println("Not right ");
        }
    }
}