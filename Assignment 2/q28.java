
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter carpet length");
        float l = sc.nextFloat();

        System.out.println("Enter carpet breadth");
        float b = sc.nextFloat();

        float area = l * b;
        float cost = area * 205;
        System.out.println("Total cost of carpet is "+cost);
       
    }
}