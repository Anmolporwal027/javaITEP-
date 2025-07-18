/*
    18. Ron jogs around a rectangular park of length 50 m and breadth 30 m. If he takes 10 rounds of the park each day, how much distance does he cover in a day in km?
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length ");
        float len = sc.nextFloat();
        
        System.out.println("Enter breadth ");
        float bre= sc.nextFloat();

    
        float peri = (2 * (len+bre))*10;
        peri = peri/1000;

        System.out.println("distance cover = "+peri+"km in a day");
    }
}