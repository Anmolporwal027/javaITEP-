/**
 WAP to find lowest number among four different number 
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value 1 ");
        int val1 = sc.nextInt();
        System.out.println("Enter value 2");
        int val2 = sc.nextInt();
        System.out.println("Enter value 3 ");
        int val3 = sc.nextInt();
        System.out.println("Enter value 4");
        int val4 = sc.nextInt();

        if(val1 < val2 && val1 < val3 && val1 < val4){
            System.out.println(val1+" is lowestt");
        }
        else if(val2 < val1 && val2 < val3 && val2 < val4){
            System.out.println(val2+" is lowest");
        }
        else if(val3 < val1 && val3 < val2 && val3 < val4){
            System.out.println(val3+" is lowest");
        }
        else{
            System.out.println(val4+" is lowest");
        }
       
    }
}