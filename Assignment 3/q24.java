/**
 Print number between 1 to 5 in word format
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  1 to 5 to get word ");
        int val = sc.nextInt();

        switch(val){
            case 1:
                System.out.println("one ");
                break;
            case 2:
                System.out.println("two ");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("only enter b/w 1 to 5");
                break;
        }
    }
}