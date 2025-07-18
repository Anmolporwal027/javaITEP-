/*
    What is the volume of a brick of ice-cream with length 25 cm, breadth 10 cm and height 8 cm
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
       

        float vol = len*bre*hei;
      


        System.out.println("volume of brick of icecream ="+vol);

    }
}