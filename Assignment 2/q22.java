/*
    22. A pond is 50 m long, 30 m wide and 2 m deep. Find the capacity of the pond in cubic metre
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        float len= sc.nextFloat();
        
        System.out.println("Enter breadth ");
        float bre= sc.nextFloat();

        System.out.println("Enter height ");
        float hei= sc.nextFloat();
       
          
          float vol = len * bre * hei;
          System.out.println("volume is "+vol);
    }
}