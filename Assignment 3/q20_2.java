//WAP to find greater among three number 
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter val1 ");
        int val1 = sc.nextInt();
        System.out.println("Enter val2 ");
        int val2 = sc.nextInt();
         System.out.println("Enter val2 ");
        int val3 = sc.nextInt();
       if(val1 > val2 && val1 > val3){
        System.out.print("va11 is greater =  "+val1);

       }else if (val2 > val1 && val2 > val3){
            System.out.print("va12 is greater =  "+val2);

       }else{
            System.out.print("val3 is greater");
       } 
    }
}