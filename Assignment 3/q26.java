/**
 Check given character is vowel or not using switch case
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char ");
        char val = sc.next().charAt(0);

        switch(val){
            case 'a':
                System.out.println("Value is  vowel "+val);
                break;
            case 'e':
                System.out.println("Value is vowel "+val);
                break;
            case 'i':
                System.out.println("Value is vowel "+val);
                break;
            case 'o':
                System.out.println("Value is vowel "+val);
                break;
            case 'u':
                System.out.println("Value is vowel "+val);
                break;
            default:
                System.out.println("Not vowel "+val);
        }
    }
}